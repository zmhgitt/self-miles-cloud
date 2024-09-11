package self.miles.gateway.filter;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.reactor.context.SaReactorSyncHolder;
import cn.dev33.satoken.reactor.filter.SaReactorFilter;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import jakarta.servlet.http.HttpServletRequest;
import self.miles.common.core.constants.HttpStatus;
import self.miles.common.core.utils.ServletUtils;
import self.miles.common.core.utils.StringUtils;
import self.miles.common.satoken.utils.LoginHelper;
import self.miles.gateway.config.properties.IgnoreWhiteProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;

import java.util.Objects;

/**
 * [Sa-Token 权限认证] 拦截器
 *
 * @author Lion Li
 */
@Configuration
public class AuthFilter {

    /**
     * 注册 Sa-Token 全局过滤器
     */
    @Bean
    public SaReactorFilter getSaReactorFilter(IgnoreWhiteProperties ignoreWhite) {
        //设置登录状态 todo: 仅用于测试阶段自动登录

        HttpServletRequest request1 = ServletUtils.getRequest();
        if (Objects.nonNull(request1)){
            request1.setAttribute(LoginHelper.CLIENT_KEY,"pc");
            request1.setAttribute("Authorization","Driver eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsb2dpblR5cGUiOiJsb2dpbiIsImxvZ2luSWQiOiJwYzoxIiwicm5TdHIiOiJjQndXZTFPaGtsbzlVWFNxcTlPdFdBSzM1MDlyZFliOCIsImNsaWVudGlkIjoicGMiLCJ0ZW5hbnRJZCI6IjEiLCJ1c2VySWQiOjEsImRlcHRJZCI6MX0.9p2pTNlrzSJcWyKlvjfA9D_PSJWLK7W_MEO4CVAqjt0");
            System.out.println(request1.getParameter(LoginHelper.CLIENT_KEY));
        }

        return new SaReactorFilter()
            // 拦截地址
            .addInclude("/**")
            .addExclude("/favicon.ico", "/actuator/**")
            // 鉴权方法：每次访问进入
            .setAuth(obj -> {
                // 登录校验 -- 拦截所有路由
                SaRouter.match("/**")
                    .notMatch(ignoreWhite.getWhites())
                    .check(r -> {
                        // 检查是否登录 是否有token
                        StpUtil.checkLogin();

                        // 检查 header 与 param 里的 clientid 与 token 里的是否一致
                        ServerHttpRequest request = SaReactorSyncHolder.getContext().getRequest();
//                        String headerCid = request.getHeaders().getFirst(LoginHelper.CLIENT_KEY);
                        String paramCid = request.getQueryParams().getFirst(LoginHelper.CLIENT_KEY);
                        String clientId = StpUtil.getExtra(LoginHelper.CLIENT_KEY).toString();
//                        if (!StringUtils.equalsAny(clientId, headerCid, paramCid)) {
                        if (!StringUtils.equalsAny(clientId,paramCid)) {
                            // token 无效
                            throw NotLoginException.newInstance(StpUtil.getLoginType(),
                                "-100", "客户端ID与Token不匹配",
                                StpUtil.getTokenValue());
                        }

                        // 有效率影响 用于临时测试
                        // if (log.isDebugEnabled()) {
                        //     log.debug("剩余有效时间: {}", StpUtil.getTokenTimeout());
                        //     log.debug("临时有效时间: {}", StpUtil.getTokenActivityTimeout());
                        // }
                    });
            }).setError(e -> {
                if (e instanceof NotLoginException) {
                    return SaResult.error(e.getMessage()).setCode(HttpStatus.UNAUTHORIZED);
                }
                return SaResult.error("认证失败，无法访问系统资源").setCode(HttpStatus.UNAUTHORIZED);
            });
    }
}

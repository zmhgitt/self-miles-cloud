package self.miles.common.core.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @ClassName: RedisPrefixConstants
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/6/4 10:37
 */
public interface RedisPrefixConstants {

    /**
     * 全局 redis key (业务无关的key)
     */
    public static String GLOBAL_REDIS_KEY = "global:";

    /**
     * 验证码 redis key
     */
    public static String CAPTCHA_CODE_KEY = GLOBAL_REDIS_KEY + "captcha_codes:";

    /**
     * 防重提交 redis key
     */
    public static String REPEAT_SUBMIT_KEY = GLOBAL_REDIS_KEY + "repeat_submit:";

    /**
     * 限流 redis key
     */
    public static String RATE_LIMIT_KEY = GLOBAL_REDIS_KEY + "rate_limit:";

    /**
     * 登录账户密码错误次数 redis key
     */
    public static String PWD_ERR_CNT_KEY = GLOBAL_REDIS_KEY + "pwd_err_cnt:";

    /**
     * 三方认证 redis key
     */
    public static String SOCIAL_AUTH_CODE_KEY = GLOBAL_REDIS_KEY + "social_auth_codes:";
}

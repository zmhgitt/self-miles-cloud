package self.miles.sys.dubbo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import self.miles.common.core.constants.BooleanConstants;
import self.miles.common.core.constants.UserConstants;
import self.miles.common.core.exception.base.UserException;
import self.miles.common.core.utils.MapstructUtils;
import self.miles.sys.domain.po.SysUser;
import self.miles.sys.domain.vo.SysUserVo;
import self.miles.sys.mapper.SysUserMapper;
import self.miles.sys.service.ISysUserService;
import self.miles.system.api.RemoteLoginUserService;
import self.miles.system.api.entity.LoginUser;

import java.util.List;

/**
 * @author Miles
 * @ClassName RemoteUserServiceImpl
 * @Description Mapper:用作查询，当变更数据时使用Service，利于统一管理
 * @date 2024/6/27 15:22
 */
@RequiredArgsConstructor
@Service
@DubboService
public class RemoteLoginUserServiceImpl implements RemoteLoginUserService {


    private final ISysUserService userService;
    private final SysUserMapper userMapper;

    /**
     *  查询用户信息
     * @param username  用户名
     * @param tenantId  租户ID
     * @return .
     */
    public LoginUser selectUserInfo(String username, String tenantId){
        SysUser sysUser = userMapper.selectOne(new LambdaQueryWrapper<SysUser>()
                .select(SysUser::getUserId, SysUser::getUserName, SysUser::getTenantId, SysUser::getStatus)
                .eq(SysUser::getUserName, username));
        if (ObjectUtil.isNull(sysUser)) {
            throw new UserException("user.not.exists", username);
        }
        if (BooleanConstants.FALSE.equals(sysUser.getStatus())) {
            throw new UserException("user.blocked", username);
        }
        if (!sysUser.getTenantId().equals(tenantId) && !UserConstants.SUPER_ADMIN_ID.equals(sysUser.getUserId())){
            throw new UserException("user.tenant.not.auth", username);
        }
        return buildLoginUser(userMapper.selectUserByUsername(username));
    }


    private LoginUser buildLoginUser(SysUserVo userVo){
        LoginUser loginUser = new LoginUser();
        loginUser.setTenantId(userVo.getTenantId());
        loginUser.setUserId(userVo.getUserId());
        loginUser.setDeptId(userVo.getDeptId());
        loginUser.setUsername(userVo.getUserName());
        loginUser.setNickname(userVo.getNickName());
        loginUser.setPassword(userVo.getPassword());
        loginUser.setUserType(userVo.getUserType());
//        loginUser.setMenuPermission(permissionService.getMenuPermission(userVo.getUserId()));
//        loginUser.setRolePermission(permissionService.getRolePermission(userVo.getUserId()));
//        loginUser.setDeptName(ObjectUtil.isNull(userVo.getDept()) ? "" : userVo.getDept().getDeptName());
//        List<RoleDTO> roles = BeanUtil.copyToList(userVo.getRoles(), RoleDTO.class);
//        loginUser.setRoles(roles);
        return loginUser;
    }
}

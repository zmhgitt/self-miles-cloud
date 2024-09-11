package self.miles.system.api;

import self.miles.system.api.entity.LoginUser;

/**
 * @author Miles
 * @ClassName RemoteUserService
 * @Description 类描述
 * @date 2024/6/27 14:57
 */
public interface RemoteLoginUserService {

    LoginUser selectUserInfo(String username,String tenantId);
}

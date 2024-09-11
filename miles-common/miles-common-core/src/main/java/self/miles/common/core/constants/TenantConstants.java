package self.miles.common.core.constants;

import lombok.AccessLevel;

/**
 * @ClassName: TenantConstants
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/6/5 15:50
 */
public record TenantConstants() {
    /**
     * 租户正常状态
     */
    public static final String NORMAL = "0";

    /**
     * 租户封禁状态
     */
    public static final String DISABLE = "1";

    /**
     * 超级管理员ID
     */
    public static final Long SUPER_ADMIN_ID = 1L;

    /**
     * 超级管理员角色 roleKey
     */
    public static final String SUPER_ADMIN_ROLE_KEY = "superadmin";

    /**
     * 租户管理员角色 roleKey
     */
    public static final String TENANT_ADMIN_ROLE_KEY = "admin";

    /**
     * 租户管理员角色名称
     */
    public static final String TENANT_ADMIN_ROLE_NAME = "管理员";

    /**
     * 默认租户ID
     */
    public static final String DEFAULT_TENANT_ID = "000000";
}

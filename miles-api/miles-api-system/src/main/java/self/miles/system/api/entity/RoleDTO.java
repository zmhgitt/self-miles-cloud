package self.miles.system.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @ClassName: RoleDTO
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/6/5 15:39
 */
@Data
@NoArgsConstructor
public class RoleDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色权限
     */
    private String roleKey;

    /**
     * 数据范围（1：所有数据权限；2：自定义数据权限；3：仅本人数据权限）
     */
    private String dataScope;

}

package self.miles.sys.domain.bo;

import self.miles.sys.domain.po.SysUser;
import self.miles.common.mybatis.core.domain.BaseEntity;
import self.miles.common.core.validate.AddGroup;
import self.miles.common.core.validate.EditGroup;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;
import java.util.Date;
import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 系统用户业务对象 sys_user
 *
 * @author Miles
 * @date 2024-06-05 17:51:37
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = SysUser.class, reverseConvertGenerate = false)
public class SysUserBo extends BaseEntity {

    /**
     * 用户ID
     */
    @NotNull(message = "用户ID不能为空", groups = { EditGroup.class })
    private Long userId;

    /**
     * 部门ID
     */
    @NotNull(message = "部门ID不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long deptId;

    /**
     * 用户账号
     */
    @NotBlank(message = "用户账号不能为空", groups = { AddGroup.class, EditGroup.class })
    private String userName;

    /**
     * 用户昵称
     */
    @NotBlank(message = "用户昵称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String nickName;

    /**
     * 自我介绍
     */
    @NotBlank(message = "自我介绍不能为空", groups = { AddGroup.class, EditGroup.class })
    private String selfDesc;

    /**
     * 用户类型（sys_user系统用户）
     */
    @NotBlank(message = "用户类型（sys_user系统用户）不能为空", groups = { AddGroup.class, EditGroup.class })
    private String userType;

    /**
     * 用户邮箱
     */
    @NotBlank(message = "用户邮箱不能为空", groups = { AddGroup.class, EditGroup.class })
    private String email;

    /**
     * 手机号码
     */
    @NotBlank(message = "手机号码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String phonenumber;

    /**
     * 用户性别（0男 1女 2未知）
     */
    @NotBlank(message = "用户性别（0男 1女 2未知）不能为空", groups = { AddGroup.class, EditGroup.class })
    private String sex;

    /**
     * 头像地址
     */
    @NotNull(message = "头像地址不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long avatar;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String password;

    /**
     * 帐号状态（0正常 1停用）
     */
    @NotBlank(message = "帐号状态（0正常 1停用）不能为空", groups = { AddGroup.class, EditGroup.class })
    private String status;

    /**
     * 最后登录IP
     */
    @NotBlank(message = "最后登录IP不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loginIp;

    /**
     * 最后登录时间
     */
    @NotNull(message = "最后登录时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date loginDate;

    /**
     * 备注
     */
    @NotBlank(message = "备注不能为空", groups = { AddGroup.class, EditGroup.class })
    private String remark;


}

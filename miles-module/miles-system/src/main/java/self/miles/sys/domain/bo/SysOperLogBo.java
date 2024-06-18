package self.miles.sys.domain.bo;

import self.miles.sys.domain.po.SysOperLog;
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
 * 操作日志记录业务对象 sys_oper_log
 *
 * @author Miles
 * @date 2024-06-05 17:51:52
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = SysOperLog.class, reverseConvertGenerate = false)
public class SysOperLogBo extends BaseEntity {

    /**
     * 日志主键
     */
    @NotNull(message = "日志主键不能为空", groups = { EditGroup.class })
    private Long operId;

    /**
     * 模块标题
     */
    @NotBlank(message = "模块标题不能为空", groups = { AddGroup.class, EditGroup.class })
    private String title;

    /**
     * 业务类型（0其它 1新增 2修改 3删除）
     */
    @NotNull(message = "业务类型（0其它 1新增 2修改 3删除）不能为空", groups = { AddGroup.class, EditGroup.class })
    private Integer businessType;

    /**
     * 方法名称
     */
    @NotBlank(message = "方法名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String method;

    /**
     * 请求方式
     */
    @NotBlank(message = "请求方式不能为空", groups = { AddGroup.class, EditGroup.class })
    private String requestMethod;

    /**
     * 操作类别（0其它 1后台用户 2手机端用户）
     */
    @NotNull(message = "操作类别（0其它 1后台用户 2手机端用户）不能为空", groups = { AddGroup.class, EditGroup.class })
    private Integer operatorType;

    /**
     * 操作人员
     */
    @NotBlank(message = "操作人员不能为空", groups = { AddGroup.class, EditGroup.class })
    private String operName;

    /**
     * 部门名称
     */
    @NotBlank(message = "部门名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String deptName;

    /**
     * 请求URL
     */
    @NotBlank(message = "请求URL不能为空", groups = { AddGroup.class, EditGroup.class })
    private String operUrl;

    /**
     * 主机地址
     */
    @NotBlank(message = "主机地址不能为空", groups = { AddGroup.class, EditGroup.class })
    private String operIp;

    /**
     * 操作地点
     */
    @NotBlank(message = "操作地点不能为空", groups = { AddGroup.class, EditGroup.class })
    private String operLocation;

    /**
     * 请求参数
     */
    @NotBlank(message = "请求参数不能为空", groups = { AddGroup.class, EditGroup.class })
    private String operParam;

    /**
     * 返回参数
     */
    @NotBlank(message = "返回参数不能为空", groups = { AddGroup.class, EditGroup.class })
    private String jsonResult;

    /**
     * 操作状态（0正常 1异常）
     */
    @NotNull(message = "操作状态（0正常 1异常）不能为空", groups = { AddGroup.class, EditGroup.class })
    private Integer status;

    /**
     * 错误消息
     */
    @NotBlank(message = "错误消息不能为空", groups = { AddGroup.class, EditGroup.class })
    private String errorMsg;

    /**
     * 操作时间
     */
    @NotNull(message = "操作时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date operTime;

    /**
     * 消耗时间
     */
    @NotNull(message = "消耗时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long costTime;


}

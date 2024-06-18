package self.miles.sys.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.*;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import self.miles.common.idempotent.annotation.RepeatSubmit;
import self.miles.common.log.annotation.SysLog;
import self.miles.common.web.core.controller.BaseController;
import self.miles.common.mybatis.core.page.PageQuery;
import self.miles.common.core.domain.R;
import self.miles.common.core.validate.AddGroup;
import self.miles.common.core.validate.EditGroup;
import self.miles.common.log.enums.BusinessType;
import self.miles.sys.domain.vo.SysOperLogVo;
import self.miles.sys.domain.bo.SysOperLogBo;
import self.miles.sys.service.ISysOperLogService;
import self.miles.common.mybatis.core.page.TableDataInfo;

/**
 * 操作日志记录
 * 前端访问路由地址为:/sys/operLog
 *
 * @author Miles
 * @date 2024-06-05 17:51:52
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/operLog")
public class SysOperLogController extends BaseController {

    private final ISysOperLogService sysOperLogService;

    /**
     * 查询操作日志记录列表
     */
    @SaCheckPermission("sys:operLog:list")
    @GetMapping("/list")
    public TableDataInfo<SysOperLogVo> list(SysOperLogBo bo, PageQuery pageQuery) {
        return sysOperLogService.queryPageList(bo, pageQuery);
    }

    /**
     * 获取操作日志记录详细信息
     *
     * @param operId 主键
     */
    @SaCheckPermission("sys:operLog:query")
    @GetMapping("/{operId}")
    public R<SysOperLogVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long operId) {
        return R.ok(sysOperLogService.queryById(operId));
    }

    /**
     * 新增操作日志记录
     */
    @SaCheckPermission("sys:operLog:add")
    @SysLog(title = "操作日志记录", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody SysOperLogBo bo) {
        return toAjax(sysOperLogService.insertByBo(bo));
    }

    /**
     * 修改操作日志记录
     */
    @SaCheckPermission("sys:operLog:edit")
    @SysLog(title = "操作日志记录", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody SysOperLogBo bo) {
        return toAjax(sysOperLogService.updateByBo(bo));
    }

    /**
     * 删除操作日志记录
     *
     * @param operIds 主键串
     */
    @SaCheckPermission("sys:operLog:remove")
    @SysLog(title = "操作日志记录", businessType = BusinessType.DELETE)
    @DeleteMapping("/{operIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] operIds) {
        return toAjax(sysOperLogService.deleteWithValidByIds(List.of(operIds), true));
    }
}

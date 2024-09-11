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
import self.miles.sys.domain.vo.SysUserVo;
import self.miles.sys.domain.bo.SysUserBo;
import self.miles.sys.service.ISysUserService;
import self.miles.common.mybatis.core.page.TableDataInfo;

/**
 * 系统用户
 * 前端访问路由地址为:/system/user
 *
 * @author Miles
 * @date 2024-06-05 17:51:37
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class SysUserController extends BaseController {

    private final ISysUserService sysUserService;

    /**
     * 查询系统用户列表
     */
    @SaCheckPermission("sys:user:list")
    @GetMapping("/list")
    public TableDataInfo<SysUserVo> list(SysUserBo bo, PageQuery pageQuery) {
        return sysUserService.queryPageList(bo, pageQuery);
    }

    /**
     * 获取系统用户详细信息
     *
     * @param userId 主键
     */
    @SaCheckPermission("sys:user:query")
    @GetMapping("/{userId}")
    public R<SysUserVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long userId) {
        return R.ok(sysUserService.queryById(userId));
    }

    /**
     * 新增系统用户
     */
    @SaCheckPermission("sys:user:add")
    @SysLog(title = "系统用户", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody SysUserBo bo) {
        return toAjax(sysUserService.insertByBo(bo));
    }

    /**
     * 修改系统用户
     */
    @SaCheckPermission("sys:user:edit")
    @SysLog(title = "系统用户", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody SysUserBo bo) {
        return toAjax(sysUserService.updateByBo(bo));
    }

    /**
     * 删除系统用户
     *
     * @param userIds 主键串
     */
    @SaCheckPermission("sys:user:remove")
    @SysLog(title = "系统用户", businessType = BusinessType.DELETE)
    @DeleteMapping("/{userIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] userIds) {
        return toAjax(sysUserService.deleteWithValidByIds(List.of(userIds), true));
    }
}

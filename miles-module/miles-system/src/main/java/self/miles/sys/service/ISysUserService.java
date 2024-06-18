package self.miles.sys.service;

import self.miles.sys.domain.po.SysUser;
import self.miles.sys.domain.vo.SysUserVo;
import self.miles.sys.domain.bo.SysUserBo;
import self.miles.common.mybatis.core.page.TableDataInfo;
import self.miles.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 系统用户Service接口
 *
 * @author Miles
 * @date 2024-06-05 17:51:37
 */
public interface ISysUserService {

    /**
     * 查询系统用户
     */
    SysUserVo queryById(Long userId);

    /**
     * 查询系统用户列表
     */
    TableDataInfo<SysUserVo> queryPageList(SysUserBo bo, PageQuery pageQuery);

    /**
     * 查询系统用户列表
     */
    List<SysUserVo> queryList(SysUserBo bo);

    /**
     * 新增系统用户
     */
    Boolean insertByBo(SysUserBo bo);

    /**
     * 修改系统用户
     */
    Boolean updateByBo(SysUserBo bo);

    /**
     * 校验并批量删除系统用户信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}

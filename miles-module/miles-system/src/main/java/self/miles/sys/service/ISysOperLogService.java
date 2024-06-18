package self.miles.sys.service;

import self.miles.sys.domain.po.SysOperLog;
import self.miles.sys.domain.vo.SysOperLogVo;
import self.miles.sys.domain.bo.SysOperLogBo;
import self.miles.common.mybatis.core.page.TableDataInfo;
import self.miles.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 操作日志记录Service接口
 *
 * @author Miles
 * @date 2024-06-05 17:51:52
 */
public interface ISysOperLogService {

    /**
     * 查询操作日志记录
     */
    SysOperLogVo queryById(Long operId);

    /**
     * 查询操作日志记录列表
     */
    TableDataInfo<SysOperLogVo> queryPageList(SysOperLogBo bo, PageQuery pageQuery);

    /**
     * 查询操作日志记录列表
     */
    List<SysOperLogVo> queryList(SysOperLogBo bo);

    /**
     * 新增操作日志记录
     */
    Boolean insertByBo(SysOperLogBo bo);

    /**
     * 修改操作日志记录
     */
    Boolean updateByBo(SysOperLogBo bo);

    /**
     * 校验并批量删除操作日志记录信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}

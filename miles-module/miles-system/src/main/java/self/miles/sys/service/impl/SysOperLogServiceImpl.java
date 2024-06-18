package self.miles.sys.service.impl;

import self.miles.common.core.utils.MapstructUtils;
import self.miles.common.core.utils.StringUtils;
import self.miles.common.mybatis.core.page.TableDataInfo;
import self.miles.common.mybatis.core.page.PageQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import self.miles.sys.domain.bo.SysOperLogBo;
import self.miles.sys.domain.vo.SysOperLogVo;
import self.miles.sys.domain.po.SysOperLog;
import self.miles.sys.mapper.SysOperLogMapper;
import self.miles.sys.service.ISysOperLogService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 操作日志记录Service业务层处理
 *
 * @author Miles
 * @date 2024-06-05 17:51:52
 */
@RequiredArgsConstructor
@Service
public class SysOperLogServiceImpl implements ISysOperLogService {

    private final SysOperLogMapper baseMapper;

    /**
     * 查询操作日志记录
     */
    @Override
    public SysOperLogVo queryById(Long operId){
        return baseMapper.selectVoById(operId);
    }

    /**
     * 查询操作日志记录列表
     */
    @Override
    public TableDataInfo<SysOperLogVo> queryPageList(SysOperLogBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<SysOperLog> lqw = buildQueryWrapper(bo);
        Page<SysOperLogVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询操作日志记录列表
     */
    @Override
    public List<SysOperLogVo> queryList(SysOperLogBo bo) {
        LambdaQueryWrapper<SysOperLog> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<SysOperLog> buildQueryWrapper(SysOperLogBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<SysOperLog> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getTitle()), SysOperLog::getTitle, bo.getTitle());
        lqw.eq(bo.getBusinessType() != null, SysOperLog::getBusinessType, bo.getBusinessType());
        lqw.eq(StringUtils.isNotBlank(bo.getMethod()), SysOperLog::getMethod, bo.getMethod());
        lqw.eq(StringUtils.isNotBlank(bo.getRequestMethod()), SysOperLog::getRequestMethod, bo.getRequestMethod());
        lqw.eq(bo.getOperatorType() != null, SysOperLog::getOperatorType, bo.getOperatorType());
        lqw.like(StringUtils.isNotBlank(bo.getOperName()), SysOperLog::getOperName, bo.getOperName());
        lqw.like(StringUtils.isNotBlank(bo.getDeptName()), SysOperLog::getDeptName, bo.getDeptName());
        lqw.eq(StringUtils.isNotBlank(bo.getOperUrl()), SysOperLog::getOperUrl, bo.getOperUrl());
        lqw.eq(StringUtils.isNotBlank(bo.getOperIp()), SysOperLog::getOperIp, bo.getOperIp());
        lqw.eq(StringUtils.isNotBlank(bo.getOperLocation()), SysOperLog::getOperLocation, bo.getOperLocation());
        lqw.eq(StringUtils.isNotBlank(bo.getOperParam()), SysOperLog::getOperParam, bo.getOperParam());
        lqw.eq(StringUtils.isNotBlank(bo.getJsonResult()), SysOperLog::getJsonResult, bo.getJsonResult());
        lqw.eq(bo.getStatus() != null, SysOperLog::getStatus, bo.getStatus());
        lqw.eq(StringUtils.isNotBlank(bo.getErrorMsg()), SysOperLog::getErrorMsg, bo.getErrorMsg());
        lqw.eq(bo.getOperTime() != null, SysOperLog::getOperTime, bo.getOperTime());
        lqw.eq(bo.getCostTime() != null, SysOperLog::getCostTime, bo.getCostTime());
        return lqw;
    }

    /**
     * 新增操作日志记录
     */
    @Override
    public Boolean insertByBo(SysOperLogBo bo) {
        SysOperLog add = MapstructUtils.convert(bo, SysOperLog.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setOperId(add.getOperId());
        }
        return flag;
    }

    /**
     * 修改操作日志记录
     */
    @Override
    public Boolean updateByBo(SysOperLogBo bo) {
        SysOperLog update = MapstructUtils.convert(bo, SysOperLog.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(SysOperLog entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除操作日志记录
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}

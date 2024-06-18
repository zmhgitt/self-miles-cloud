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
import self.miles.sys.domain.bo.SysUserBo;
import self.miles.sys.domain.vo.SysUserVo;
import self.miles.sys.domain.po.SysUser;
import self.miles.sys.mapper.SysUserMapper;
import self.miles.sys.service.ISysUserService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 系统用户Service业务层处理
 *
 * @author Miles
 * @date 2024-06-05 17:51:37
 */
@RequiredArgsConstructor
@Service
public class SysUserServiceImpl implements ISysUserService {

    private final SysUserMapper baseMapper;

    /**
     * 查询系统用户
     */
    @Override
    public SysUserVo queryById(Long userId){
        return baseMapper.selectVoById(userId);
    }

    /**
     * 查询系统用户列表
     */
    @Override
    public TableDataInfo<SysUserVo> queryPageList(SysUserBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<SysUser> lqw = buildQueryWrapper(bo);
        Page<SysUserVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询系统用户列表
     */
    @Override
    public List<SysUserVo> queryList(SysUserBo bo) {
        LambdaQueryWrapper<SysUser> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<SysUser> buildQueryWrapper(SysUserBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<SysUser> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getDeptId() != null, SysUser::getDeptId, bo.getDeptId());
        lqw.like(StringUtils.isNotBlank(bo.getUserName()), SysUser::getUserName, bo.getUserName());
        lqw.like(StringUtils.isNotBlank(bo.getNickName()), SysUser::getNickName, bo.getNickName());
        lqw.eq(StringUtils.isNotBlank(bo.getSelfDesc()), SysUser::getSelfDesc, bo.getSelfDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getUserType()), SysUser::getUserType, bo.getUserType());
        lqw.eq(StringUtils.isNotBlank(bo.getEmail()), SysUser::getEmail, bo.getEmail());
        lqw.eq(StringUtils.isNotBlank(bo.getPhonenumber()), SysUser::getPhonenumber, bo.getPhonenumber());
        lqw.eq(StringUtils.isNotBlank(bo.getSex()), SysUser::getSex, bo.getSex());
        lqw.eq(bo.getAvatar() != null, SysUser::getAvatar, bo.getAvatar());
        lqw.eq(StringUtils.isNotBlank(bo.getPassword()), SysUser::getPassword, bo.getPassword());
        lqw.eq(StringUtils.isNotBlank(bo.getStatus()), SysUser::getStatus, bo.getStatus());
        lqw.eq(StringUtils.isNotBlank(bo.getLoginIp()), SysUser::getLoginIp, bo.getLoginIp());
        lqw.eq(bo.getLoginDate() != null, SysUser::getLoginDate, bo.getLoginDate());
        return lqw;
    }

    /**
     * 新增系统用户
     */
    @Override
    public Boolean insertByBo(SysUserBo bo) {
        SysUser add = MapstructUtils.convert(bo, SysUser.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setUserId(add.getUserId());
        }
        return flag;
    }

    /**
     * 修改系统用户
     */
    @Override
    public Boolean updateByBo(SysUserBo bo) {
        SysUser update = MapstructUtils.convert(bo, SysUser.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(SysUser entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除系统用户
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}

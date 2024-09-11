package self.miles.sys.mapper;

import self.miles.sys.domain.po.SysUser;
import self.miles.sys.domain.vo.SysUserVo;
import self.miles.common.mybatis.core.mapper.BaseMapperPlus;

/**
 * 系统用户Mapper接口
 *
 * @author Miles
 * @date 2024-06-05 17:51:37
 */
public interface SysUserMapper extends BaseMapperPlus<SysUser, SysUserVo> {

    /**
     * 通过用户名查询用户
     * @param username 用户名
     * @return 结果
     */
    SysUserVo selectUserByUsername(String username);
}

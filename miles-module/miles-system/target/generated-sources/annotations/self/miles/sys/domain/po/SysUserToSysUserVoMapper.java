package self.miles.sys.domain.po;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import self.miles.sys.domain.vo.SysUserVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysUserToSysUserVoMapper extends BaseMapper<SysUser, SysUserVo> {
  SysUserVo convert(SysUser source, @MappingTarget SysUserVo target);
}

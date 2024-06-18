package self.miles.sys.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import self.miles.sys.domain.po.SysUser;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysUserVoToSysUserMapper extends BaseMapper<SysUserVo, SysUser> {
  SysUser convert(SysUserVo source, @MappingTarget SysUser target);
}

package self.miles.sys.domain.po;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import self.miles.sys.domain.vo.SysOperLogVo;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOperLogToSysOperLogVoMapper extends BaseMapper<SysOperLog, SysOperLogVo> {
  SysOperLogVo convert(SysOperLog source, @MappingTarget SysOperLogVo target);
}

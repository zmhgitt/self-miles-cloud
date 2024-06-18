package self.miles.sys.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import self.miles.sys.domain.po.SysOperLog;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOperLogVoToSysOperLogMapper extends BaseMapper<SysOperLogVo, SysOperLog> {
  SysOperLog convert(SysOperLogVo source, @MappingTarget SysOperLog target);
}

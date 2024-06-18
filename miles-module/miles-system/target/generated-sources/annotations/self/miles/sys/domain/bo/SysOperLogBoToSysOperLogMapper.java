package self.miles.sys.domain.bo;

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
public interface SysOperLogBoToSysOperLogMapper extends BaseMapper<SysOperLogBo, SysOperLog> {
  SysOperLog convert(SysOperLogBo source, @MappingTarget SysOperLog target);
}

package self.miles.sys.domain.vo;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import self.miles.sys.domain.po.SysOperLog;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-13T14:21:04+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class SysOperLogVoToSysOperLogMapperImpl implements SysOperLogVoToSysOperLogMapper {

    @Override
    public SysOperLog convert(SysOperLogVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOperLog sysOperLog = new SysOperLog();

        sysOperLog.setOperId( arg0.getOperId() );
        sysOperLog.setTitle( arg0.getTitle() );
        sysOperLog.setBusinessType( arg0.getBusinessType() );
        sysOperLog.setMethod( arg0.getMethod() );
        sysOperLog.setRequestMethod( arg0.getRequestMethod() );
        sysOperLog.setOperatorType( arg0.getOperatorType() );
        sysOperLog.setOperName( arg0.getOperName() );
        sysOperLog.setDeptName( arg0.getDeptName() );
        sysOperLog.setOperUrl( arg0.getOperUrl() );
        sysOperLog.setOperIp( arg0.getOperIp() );
        sysOperLog.setOperLocation( arg0.getOperLocation() );
        sysOperLog.setOperParam( arg0.getOperParam() );
        sysOperLog.setJsonResult( arg0.getJsonResult() );
        sysOperLog.setStatus( arg0.getStatus() );
        sysOperLog.setErrorMsg( arg0.getErrorMsg() );
        sysOperLog.setOperTime( arg0.getOperTime() );
        sysOperLog.setCostTime( arg0.getCostTime() );

        return sysOperLog;
    }

    @Override
    public SysOperLog convert(SysOperLogVo source, SysOperLog target) {
        if ( source == null ) {
            return target;
        }

        target.setOperId( source.getOperId() );
        target.setTitle( source.getTitle() );
        target.setBusinessType( source.getBusinessType() );
        target.setMethod( source.getMethod() );
        target.setRequestMethod( source.getRequestMethod() );
        target.setOperatorType( source.getOperatorType() );
        target.setOperName( source.getOperName() );
        target.setDeptName( source.getDeptName() );
        target.setOperUrl( source.getOperUrl() );
        target.setOperIp( source.getOperIp() );
        target.setOperLocation( source.getOperLocation() );
        target.setOperParam( source.getOperParam() );
        target.setJsonResult( source.getJsonResult() );
        target.setStatus( source.getStatus() );
        target.setErrorMsg( source.getErrorMsg() );
        target.setOperTime( source.getOperTime() );
        target.setCostTime( source.getCostTime() );

        return target;
    }
}

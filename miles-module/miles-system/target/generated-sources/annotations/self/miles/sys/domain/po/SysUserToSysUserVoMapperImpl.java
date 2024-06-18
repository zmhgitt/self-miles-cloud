package self.miles.sys.domain.po;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import self.miles.sys.domain.vo.SysUserVo;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-13T14:21:04+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class SysUserToSysUserVoMapperImpl implements SysUserToSysUserVoMapper {

    @Override
    public SysUserVo convert(SysUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserVo sysUserVo = new SysUserVo();

        sysUserVo.setUserId( arg0.getUserId() );
        sysUserVo.setDeptId( arg0.getDeptId() );
        sysUserVo.setUserName( arg0.getUserName() );
        sysUserVo.setNickName( arg0.getNickName() );
        sysUserVo.setSelfDesc( arg0.getSelfDesc() );
        sysUserVo.setUserType( arg0.getUserType() );
        sysUserVo.setEmail( arg0.getEmail() );
        sysUserVo.setPhonenumber( arg0.getPhonenumber() );
        sysUserVo.setSex( arg0.getSex() );
        sysUserVo.setAvatar( arg0.getAvatar() );
        sysUserVo.setPassword( arg0.getPassword() );
        sysUserVo.setStatus( arg0.getStatus() );
        sysUserVo.setLoginIp( arg0.getLoginIp() );
        sysUserVo.setLoginDate( arg0.getLoginDate() );
        sysUserVo.setRemark( arg0.getRemark() );

        return sysUserVo;
    }

    @Override
    public SysUserVo convert(SysUser source, SysUserVo target) {
        if ( source == null ) {
            return target;
        }

        target.setUserId( source.getUserId() );
        target.setDeptId( source.getDeptId() );
        target.setUserName( source.getUserName() );
        target.setNickName( source.getNickName() );
        target.setSelfDesc( source.getSelfDesc() );
        target.setUserType( source.getUserType() );
        target.setEmail( source.getEmail() );
        target.setPhonenumber( source.getPhonenumber() );
        target.setSex( source.getSex() );
        target.setAvatar( source.getAvatar() );
        target.setPassword( source.getPassword() );
        target.setStatus( source.getStatus() );
        target.setLoginIp( source.getLoginIp() );
        target.setLoginDate( source.getLoginDate() );
        target.setRemark( source.getRemark() );

        return target;
    }
}

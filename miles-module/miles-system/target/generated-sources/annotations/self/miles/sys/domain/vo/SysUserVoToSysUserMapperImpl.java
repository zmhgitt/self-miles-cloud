package self.miles.sys.domain.vo;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import self.miles.sys.domain.po.SysUser;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-13T14:21:04+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class SysUserVoToSysUserMapperImpl implements SysUserVoToSysUserMapper {

    @Override
    public SysUser convert(SysUserVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setUserId( arg0.getUserId() );
        sysUser.setDeptId( arg0.getDeptId() );
        sysUser.setUserName( arg0.getUserName() );
        sysUser.setNickName( arg0.getNickName() );
        sysUser.setSelfDesc( arg0.getSelfDesc() );
        sysUser.setUserType( arg0.getUserType() );
        sysUser.setEmail( arg0.getEmail() );
        sysUser.setPhonenumber( arg0.getPhonenumber() );
        sysUser.setSex( arg0.getSex() );
        sysUser.setAvatar( arg0.getAvatar() );
        sysUser.setPassword( arg0.getPassword() );
        sysUser.setStatus( arg0.getStatus() );
        sysUser.setLoginIp( arg0.getLoginIp() );
        sysUser.setLoginDate( arg0.getLoginDate() );
        sysUser.setRemark( arg0.getRemark() );

        return sysUser;
    }

    @Override
    public SysUser convert(SysUserVo source, SysUser target) {
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

package io.github.linpeilie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import self.miles.sys.domain.bo.SysOperLogBo;
import self.miles.sys.domain.bo.SysOperLogBoToSysOperLogMapper;
import self.miles.sys.domain.bo.SysUserBo;
import self.miles.sys.domain.bo.SysUserBoToSysUserMapper;
import self.miles.sys.domain.po.SysOperLog;
import self.miles.sys.domain.po.SysOperLogToSysOperLogVoMapper;
import self.miles.sys.domain.po.SysUser;
import self.miles.sys.domain.po.SysUserToSysUserVoMapper;
import self.miles.sys.domain.vo.SysOperLogVo;
import self.miles.sys.domain.vo.SysOperLogVoToSysOperLogMapper;
import self.miles.sys.domain.vo.SysUserVo;
import self.miles.sys.domain.vo.SysUserVoToSysUserMapper;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private SysUserToSysUserVoMapper sysUserToSysUserVoMapper;

  @Autowired
  @Lazy
  private SysUserBoToSysUserMapper sysUserBoToSysUserMapper;

  @Autowired
  @Lazy
  private SysOperLogBoToSysOperLogMapper sysOperLogBoToSysOperLogMapper;

  @Autowired
  @Lazy
  private SysOperLogToSysOperLogVoMapper sysOperLogToSysOperLogVoMapper;

  @Autowired
  @Lazy
  private SysUserVoToSysUserMapper sysUserVoToSysUserMapper;

  @Autowired
  @Lazy
  private SysOperLogVoToSysOperLogMapper sysOperLogVoToSysOperLogMapper;

  public SysUserVo self_miles_sys_domain_po_SysUserToSysUserVo(SysUser param) {
    return sysUserToSysUserVoMapper.convert(param);}

  public SysUser self_miles_sys_domain_bo_SysUserBoToSysUser(SysUserBo param) {
    return sysUserBoToSysUserMapper.convert(param);}

  public SysOperLog self_miles_sys_domain_bo_SysOperLogBoToSysOperLog(SysOperLogBo param) {
    return sysOperLogBoToSysOperLogMapper.convert(param);}

  public SysOperLogVo self_miles_sys_domain_po_SysOperLogToSysOperLogVo(SysOperLog param) {
    return sysOperLogToSysOperLogVoMapper.convert(param);}

  public SysUser self_miles_sys_domain_vo_SysUserVoToSysUser(SysUserVo param) {
    return sysUserVoToSysUserMapper.convert(param);}

  public SysOperLog self_miles_sys_domain_vo_SysOperLogVoToSysOperLog(SysOperLogVo param) {
    return sysOperLogVoToSysOperLogMapper.convert(param);}
}

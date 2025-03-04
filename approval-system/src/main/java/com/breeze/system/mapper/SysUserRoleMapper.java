package com.breeze.system.mapper;

import com.breeze.common.core.mapper.BaseMapperPlus;
import com.breeze.system.domain.SysUserRole;

import java.util.List;

/**
 * 用户与角色关联表 数据层
 */
public interface SysUserRoleMapper extends BaseMapperPlus<SysUserRoleMapper, SysUserRole, SysUserRole> {

    List<Long> selectUserIdsByRoleId(Long roleId);

}

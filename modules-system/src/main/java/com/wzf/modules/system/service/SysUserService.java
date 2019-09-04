package com.wzf.modules.system.service;

import com.wzf.common.api.vo.Result;
import com.wzf.modules.system.entity.SysPermission;
import com.wzf.modules.system.entity.SysRole;
import com.wzf.modules.system.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wzf.modules.system.entity.UserPermission;

import java.util.List;

/**
 * @Description: 用户表
 * @Author: jeecg-boot
 * @Date:   2019-09-02
 * @Version: V1.0
 */
public interface SysUserService extends IService<SysUser> {
    SysUser getUserByName(String username);
    List<SysPermission> getPermissionListByUserId(String id);
    List<SysRole> getRoleListByUserId(String id);
    /**
     * 校验用户是否有效
     * @param sysUser
     * @return
     */
    Result checkUserIsEffective(SysUser sysUser);

    String login(SysUser sysUser);
}

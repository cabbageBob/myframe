package com.wzf.component;

import com.wzf.modules.system.entity.SysPermission;
import com.wzf.modules.system.entity.SysRole;
import com.wzf.modules.system.entity.SysUser;
import com.wzf.modules.system.entity.UserPermission;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 * Created by macro on 2018/4/26.
 */
@Data
public class MyUserDetails implements UserDetails {
    private SysUser sysUser;
    private List<SysRole> roleList;
    public MyUserDetails(SysUser sysUser, List<SysRole> roleList) {
        this.sysUser = sysUser;
        this.roleList = roleList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return roleList.stream()
                .filter(role -> role.getRoleCode()!=null)
                .map(role ->new SimpleGrantedAuthority(role.getRoleCode()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return sysUser.getPassword();
    }

    @Override
    public String getUsername() {
        return sysUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return sysUser.getStatus().equals(1);
    }
}

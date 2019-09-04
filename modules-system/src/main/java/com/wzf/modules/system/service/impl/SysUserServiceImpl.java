package com.wzf.modules.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wzf.common.api.vo.Result;
import com.wzf.common.constant.CommonConstant;
import com.wzf.common.system.util.JwtTokenUtil;
import com.wzf.common.util.RedisUtil;
import com.wzf.modules.system.entity.*;
import com.wzf.modules.system.mapper.SysRoleMapper;
import com.wzf.modules.system.mapper.SysUserMapper;
import com.wzf.modules.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description: 用户表
 * @Author: jeecg-boot
 * @Date:   2019-09-02
 * @Version: V1.0
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private SysRoleMapper roleMapper;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil tokenUtil;
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public SysUser getUserByName(String username) {
        SysUserExample sysUserExample =  new SysUserExample();
        sysUserExample.createCriteria().andUsernameEqualTo(username);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        return baseMapper.selectOne(wrapper);
    }

    @Override
    public List<SysPermission> getPermissionListByUserId(String id) {
        return null;
    }

    @Override
    public List<SysRole> getRoleListByUserId(String id) {
        SysRoleExample sysRoleExample =  new SysRoleExample();
        sysRoleExample.createCriteria().andIdEqualTo(id);
        return roleMapper.selectByExample(sysRoleExample);
    }

    @Override
    public Result checkUserIsEffective(SysUser sysUser) {
        if (sysUser==null){
            return Result.error("用户不存在");
        }
        if (CommonConstant.DEL_FLAG_1.toString().equals(sysUser.getDelFlag())){
            return Result.error("该用户已注销");
        }
        if (CommonConstant.USER_FREEZE.equals(sysUser.getStatus())){
            return Result.error("该用户已冻结");
        }
        return Result.ok();
    }

    @Override
    public String login(SysUser sysUser) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(sysUser.getUsername());
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = tokenUtil.generateToken(userDetails);
        redisUtil.set(CommonConstant.PREFIX_USER_TOKEN + token, token);
        redisUtil.expire(CommonConstant.PREFIX_USER_TOKEN + token, JwtTokenUtil.EXPIRE_TIME/1000);
        return token;
    }
}

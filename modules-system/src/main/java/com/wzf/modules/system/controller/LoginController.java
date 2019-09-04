package com.wzf.modules.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.wzf.common.api.vo.Result;
import com.wzf.common.system.util.JwtTokenUtil;
import com.wzf.common.util.PasswordUtil;
import com.wzf.modules.system.entity.SysUser;
import com.wzf.modules.system.entity.request.LoginEntity;
import com.wzf.modules.system.entity.response.LoginEntityResponse;
import com.wzf.modules.system.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    SysUserService sysUserService;
    public Result<JSONObject> login(LoginEntity loginEntity){
        Result<JSONObject> result;
        SysUser sysUser = sysUserService.getUserByName(loginEntity.getUsername());
        result = sysUserService.checkUserIsEffective(sysUser);
        if (!result.isSuccess()){
            return result;
        }
        String userPassword = PasswordUtil.encrypt(loginEntity.getUsername(),loginEntity.getPassword(),sysUser.getSalt());
        if (!userPassword.equals(sysUser.getPassword())){
            return result.error500("用户名或密码错误");
        }
        String token = sysUserService.login(sysUser);
        JSONObject obj = new JSONObject();
        LoginEntityResponse loginEntityResponse = new LoginEntityResponse();
        BeanUtils.copyProperties(sysUser,loginEntityResponse);
        obj.put("token",token);
        obj.put("userInfo",loginEntityResponse);
        result.setData(obj);
        result.success();
        return result;
    }
}

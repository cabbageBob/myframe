package com.wzf.modules.system.aspect;

import com.alibaba.fastjson.JSONObject;
import com.wzf.common.aspect.annotation.AutoLog;
import com.wzf.common.util.IPUtils;
import com.wzf.component.MyUserDetails;
import com.wzf.modules.system.entity.SysLog;
import com.wzf.modules.system.entity.SysUser;
import com.wzf.modules.system.service.SysLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * 系统日志，切面处理类
 *
 * @Author scott
 * @email jeecgos@163.com
 * @Date 2018年1月14日
 */
@Aspect
@Component
public class AutoLogAspect {
    @Autowired
    private SysLogService sysLogService;

    @Pointcut("@annotation(com.wzf.common.aspect.annotation.AutoLog)")
    public void logPointCut() {}

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        saveSysLog(point,time);
        return result;
    }

    private void saveSysLog(ProceedingJoinPoint point,long time){
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        SysLog sysLog = new SysLog();
        AutoLog autoLog = method.getAnnotation(AutoLog.class);
        if (autoLog!=null){
            //注解上的描述,操作日志内容
            sysLog.setLogContent(autoLog.value());
            sysLog.setLogType(autoLog.logType());
        }
        String className = point.getTarget().getClass().getName();
        String methodName = signature.getName();
        sysLog.setMethod(className+"."+methodName+"()");

        Object[] args = point.getArgs();
        try{
            String params = JSONObject.toJSONString(args);
            sysLog.setRequestParam(params);
        }catch (Exception e ){

        }

        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        //设置IP地址
        sysLog.setIp(IPUtils.getIpAddr(request));
        SysUser sysUser = ((MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getSysUser();
        if (null!=sysUser){
            sysLog.setUserid(sysUser.getId());
            sysLog.setUsername(sysUser.getUsername());
        }
        //耗时
        sysLog.setCostTime(time);
        sysLog.setCreateTime(new Date());

        sysLogService.save(sysLog);
    }
}

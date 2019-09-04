package com.wzf.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzf.modules.system.entity.SysLog;
import com.wzf.modules.system.mapper.SysLogMapper;
import com.wzf.modules.system.service.SysLogService;
import org.springframework.stereotype.Service;

@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper,SysLog> implements SysLogService {
}

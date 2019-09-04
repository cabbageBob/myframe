package com.wzf.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "com.wzf.modules.**.mapper*")
public class MybatisConfig {
}

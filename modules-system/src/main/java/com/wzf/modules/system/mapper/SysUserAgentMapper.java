package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysUserAgent;
import com.wzf.modules.system.entity.SysUserAgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserAgentMapper {
    int countByExample(SysUserAgentExample example);

    int deleteByExample(SysUserAgentExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysUserAgent record);

    int insertSelective(SysUserAgent record);

    List<SysUserAgent> selectByExample(SysUserAgentExample example);

    SysUserAgent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysUserAgent record, @Param("example") SysUserAgentExample example);

    int updateByExample(@Param("record") SysUserAgent record, @Param("example") SysUserAgentExample example);

    int updateByPrimaryKeySelective(SysUserAgent record);

    int updateByPrimaryKey(SysUserAgent record);
}
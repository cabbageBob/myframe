package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysDataLog;
import com.wzf.modules.system.entity.SysDataLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDataLogMapper {
    int countByExample(SysDataLogExample example);

    int deleteByExample(SysDataLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysDataLog record);

    int insertSelective(SysDataLog record);

    List<SysDataLog> selectByExampleWithBLOBs(SysDataLogExample example);

    List<SysDataLog> selectByExample(SysDataLogExample example);

    SysDataLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysDataLog record, @Param("example") SysDataLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SysDataLog record, @Param("example") SysDataLogExample example);

    int updateByExample(@Param("record") SysDataLog record, @Param("example") SysDataLogExample example);

    int updateByPrimaryKeySelective(SysDataLog record);

    int updateByPrimaryKeyWithBLOBs(SysDataLog record);

    int updateByPrimaryKey(SysDataLog record);
}
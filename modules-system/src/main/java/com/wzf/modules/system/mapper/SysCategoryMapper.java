package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysCategory;
import com.wzf.modules.system.entity.SysCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCategoryMapper {
    int countByExample(SysCategoryExample example);

    int deleteByExample(SysCategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysCategory record);

    int insertSelective(SysCategory record);

    List<SysCategory> selectByExample(SysCategoryExample example);

    SysCategory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysCategory record, @Param("example") SysCategoryExample example);

    int updateByExample(@Param("record") SysCategory record, @Param("example") SysCategoryExample example);

    int updateByPrimaryKeySelective(SysCategory record);

    int updateByPrimaryKey(SysCategory record);
}
package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.Demo;
import com.wzf.modules.system.entity.DemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoMapper {
    int countByExample(DemoExample example);

    int deleteByExample(DemoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Demo record);

    int insertSelective(Demo record);

    List<Demo> selectByExample(DemoExample example);

    Demo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByExample(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}
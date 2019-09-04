package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.TestPerson;
import com.wzf.modules.system.entity.TestPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestPersonMapper {
    int countByExample(TestPersonExample example);

    int deleteByExample(TestPersonExample example);

    int deleteByPrimaryKey(String id);

    int insert(TestPerson record);

    int insertSelective(TestPerson record);

    List<TestPerson> selectByExampleWithBLOBs(TestPersonExample example);

    List<TestPerson> selectByExample(TestPersonExample example);

    TestPerson selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TestPerson record, @Param("example") TestPersonExample example);

    int updateByExampleWithBLOBs(@Param("record") TestPerson record, @Param("example") TestPersonExample example);

    int updateByExample(@Param("record") TestPerson record, @Param("example") TestPersonExample example);

    int updateByPrimaryKeySelective(TestPerson record);

    int updateByPrimaryKeyWithBLOBs(TestPerson record);

    int updateByPrimaryKey(TestPerson record);
}
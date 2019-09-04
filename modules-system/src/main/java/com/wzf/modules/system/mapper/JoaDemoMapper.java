package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.JoaDemo;
import com.wzf.modules.system.entity.JoaDemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoaDemoMapper {
    int countByExample(JoaDemoExample example);

    int deleteByExample(JoaDemoExample example);

    int insert(JoaDemo record);

    int insertSelective(JoaDemo record);

    List<JoaDemo> selectByExample(JoaDemoExample example);

    int updateByExampleSelective(@Param("record") JoaDemo record, @Param("example") JoaDemoExample example);

    int updateByExample(@Param("record") JoaDemo record, @Param("example") JoaDemoExample example);
}
package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysDictItem;
import com.wzf.modules.system.entity.SysDictItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictItemMapper {
    int countByExample(SysDictItemExample example);

    int deleteByExample(SysDictItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysDictItem record);

    int insertSelective(SysDictItem record);

    List<SysDictItem> selectByExample(SysDictItemExample example);

    SysDictItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysDictItem record, @Param("example") SysDictItemExample example);

    int updateByExample(@Param("record") SysDictItem record, @Param("example") SysDictItemExample example);

    int updateByPrimaryKeySelective(SysDictItem record);

    int updateByPrimaryKey(SysDictItem record);
}
package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysSms;
import com.wzf.modules.system.entity.SysSmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSmsMapper {
    int countByExample(SysSmsExample example);

    int deleteByExample(SysSmsExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysSms record);

    int insertSelective(SysSms record);

    List<SysSms> selectByExampleWithBLOBs(SysSmsExample example);

    List<SysSms> selectByExample(SysSmsExample example);

    SysSms selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysSms record, @Param("example") SysSmsExample example);

    int updateByExampleWithBLOBs(@Param("record") SysSms record, @Param("example") SysSmsExample example);

    int updateByExample(@Param("record") SysSms record, @Param("example") SysSmsExample example);

    int updateByPrimaryKeySelective(SysSms record);

    int updateByPrimaryKeyWithBLOBs(SysSms record);

    int updateByPrimaryKey(SysSms record);
}
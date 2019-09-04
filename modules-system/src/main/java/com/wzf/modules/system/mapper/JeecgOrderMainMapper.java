package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.JeecgOrderMain;
import com.wzf.modules.system.entity.JeecgOrderMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JeecgOrderMainMapper {
    int countByExample(JeecgOrderMainExample example);

    int deleteByExample(JeecgOrderMainExample example);

    int deleteByPrimaryKey(String id);

    int insert(JeecgOrderMain record);

    int insertSelective(JeecgOrderMain record);

    List<JeecgOrderMain> selectByExample(JeecgOrderMainExample example);

    JeecgOrderMain selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JeecgOrderMain record, @Param("example") JeecgOrderMainExample example);

    int updateByExample(@Param("record") JeecgOrderMain record, @Param("example") JeecgOrderMainExample example);

    int updateByPrimaryKeySelective(JeecgOrderMain record);

    int updateByPrimaryKey(JeecgOrderMain record);
}
package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysDepart;
import com.wzf.modules.system.entity.SysDepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDepartMapper {
    int countByExample(SysDepartExample example);

    int deleteByExample(SysDepartExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysDepart record);

    int insertSelective(SysDepart record);

    List<SysDepart> selectByExampleWithBLOBs(SysDepartExample example);

    List<SysDepart> selectByExample(SysDepartExample example);

    SysDepart selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysDepart record, @Param("example") SysDepartExample example);

    int updateByExampleWithBLOBs(@Param("record") SysDepart record, @Param("example") SysDepartExample example);

    int updateByExample(@Param("record") SysDepart record, @Param("example") SysDepartExample example);

    int updateByPrimaryKeySelective(SysDepart record);

    int updateByPrimaryKeyWithBLOBs(SysDepart record);

    int updateByPrimaryKey(SysDepart record);
}
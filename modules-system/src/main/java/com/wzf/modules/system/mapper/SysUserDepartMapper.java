package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysUserDepart;
import com.wzf.modules.system.entity.SysUserDepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserDepartMapper {
    int countByExample(SysUserDepartExample example);

    int deleteByExample(SysUserDepartExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysUserDepart record);

    int insertSelective(SysUserDepart record);

    List<SysUserDepart> selectByExample(SysUserDepartExample example);

    SysUserDepart selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysUserDepart record, @Param("example") SysUserDepartExample example);

    int updateByExample(@Param("record") SysUserDepart record, @Param("example") SysUserDepartExample example);

    int updateByPrimaryKeySelective(SysUserDepart record);

    int updateByPrimaryKey(SysUserDepart record);
}
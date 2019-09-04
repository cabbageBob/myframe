package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysPermissionDataRule;
import com.wzf.modules.system.entity.SysPermissionDataRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionDataRuleMapper {
    int countByExample(SysPermissionDataRuleExample example);

    int deleteByExample(SysPermissionDataRuleExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysPermissionDataRule record);

    int insertSelective(SysPermissionDataRule record);

    List<SysPermissionDataRule> selectByExample(SysPermissionDataRuleExample example);

    SysPermissionDataRule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysPermissionDataRule record, @Param("example") SysPermissionDataRuleExample example);

    int updateByExample(@Param("record") SysPermissionDataRule record, @Param("example") SysPermissionDataRuleExample example);

    int updateByPrimaryKeySelective(SysPermissionDataRule record);

    int updateByPrimaryKey(SysPermissionDataRule record);
}
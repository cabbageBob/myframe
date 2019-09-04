package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.JeecgProjectNatureIncome;
import com.wzf.modules.system.entity.JeecgProjectNatureIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JeecgProjectNatureIncomeMapper {
    int countByExample(JeecgProjectNatureIncomeExample example);

    int deleteByExample(JeecgProjectNatureIncomeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JeecgProjectNatureIncome record);

    int insertSelective(JeecgProjectNatureIncome record);

    List<JeecgProjectNatureIncome> selectByExample(JeecgProjectNatureIncomeExample example);

    JeecgProjectNatureIncome selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JeecgProjectNatureIncome record, @Param("example") JeecgProjectNatureIncomeExample example);

    int updateByExample(@Param("record") JeecgProjectNatureIncome record, @Param("example") JeecgProjectNatureIncomeExample example);

    int updateByPrimaryKeySelective(JeecgProjectNatureIncome record);

    int updateByPrimaryKey(JeecgProjectNatureIncome record);
}
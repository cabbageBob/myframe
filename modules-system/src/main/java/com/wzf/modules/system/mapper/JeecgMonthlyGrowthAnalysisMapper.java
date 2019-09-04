package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.JeecgMonthlyGrowthAnalysis;
import com.wzf.modules.system.entity.JeecgMonthlyGrowthAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JeecgMonthlyGrowthAnalysisMapper {
    int countByExample(JeecgMonthlyGrowthAnalysisExample example);

    int deleteByExample(JeecgMonthlyGrowthAnalysisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JeecgMonthlyGrowthAnalysis record);

    int insertSelective(JeecgMonthlyGrowthAnalysis record);

    List<JeecgMonthlyGrowthAnalysis> selectByExample(JeecgMonthlyGrowthAnalysisExample example);

    JeecgMonthlyGrowthAnalysis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JeecgMonthlyGrowthAnalysis record, @Param("example") JeecgMonthlyGrowthAnalysisExample example);

    int updateByExample(@Param("record") JeecgMonthlyGrowthAnalysis record, @Param("example") JeecgMonthlyGrowthAnalysisExample example);

    int updateByPrimaryKeySelective(JeecgMonthlyGrowthAnalysis record);

    int updateByPrimaryKey(JeecgMonthlyGrowthAnalysis record);
}
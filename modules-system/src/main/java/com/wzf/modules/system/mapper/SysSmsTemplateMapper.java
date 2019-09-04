package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysSmsTemplate;
import com.wzf.modules.system.entity.SysSmsTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSmsTemplateMapper {
    int countByExample(SysSmsTemplateExample example);

    int deleteByExample(SysSmsTemplateExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysSmsTemplate record);

    int insertSelective(SysSmsTemplate record);

    List<SysSmsTemplate> selectByExample(SysSmsTemplateExample example);

    SysSmsTemplate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysSmsTemplate record, @Param("example") SysSmsTemplateExample example);

    int updateByExample(@Param("record") SysSmsTemplate record, @Param("example") SysSmsTemplateExample example);

    int updateByPrimaryKeySelective(SysSmsTemplate record);

    int updateByPrimaryKey(SysSmsTemplate record);
}
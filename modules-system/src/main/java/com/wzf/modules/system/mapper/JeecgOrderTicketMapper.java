package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.JeecgOrderTicket;
import com.wzf.modules.system.entity.JeecgOrderTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JeecgOrderTicketMapper {
    int countByExample(JeecgOrderTicketExample example);

    int deleteByExample(JeecgOrderTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(JeecgOrderTicket record);

    int insertSelective(JeecgOrderTicket record);

    List<JeecgOrderTicket> selectByExample(JeecgOrderTicketExample example);

    JeecgOrderTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JeecgOrderTicket record, @Param("example") JeecgOrderTicketExample example);

    int updateByExample(@Param("record") JeecgOrderTicket record, @Param("example") JeecgOrderTicketExample example);

    int updateByPrimaryKeySelective(JeecgOrderTicket record);

    int updateByPrimaryKey(JeecgOrderTicket record);
}
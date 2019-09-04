package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysAnnouncementSend;
import com.wzf.modules.system.entity.SysAnnouncementSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAnnouncementSendMapper {
    int countByExample(SysAnnouncementSendExample example);

    int deleteByExample(SysAnnouncementSendExample example);

    int insert(SysAnnouncementSend record);

    int insertSelective(SysAnnouncementSend record);

    List<SysAnnouncementSend> selectByExample(SysAnnouncementSendExample example);

    int updateByExampleSelective(@Param("record") SysAnnouncementSend record, @Param("example") SysAnnouncementSendExample example);

    int updateByExample(@Param("record") SysAnnouncementSend record, @Param("example") SysAnnouncementSendExample example);
}
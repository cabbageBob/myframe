package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.SysAnnouncement;
import com.wzf.modules.system.entity.SysAnnouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAnnouncementMapper {
    int countByExample(SysAnnouncementExample example);

    int deleteByExample(SysAnnouncementExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysAnnouncement record);

    int insertSelective(SysAnnouncement record);

    List<SysAnnouncement> selectByExampleWithBLOBs(SysAnnouncementExample example);

    List<SysAnnouncement> selectByExample(SysAnnouncementExample example);

    SysAnnouncement selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysAnnouncement record, @Param("example") SysAnnouncementExample example);

    int updateByExampleWithBLOBs(@Param("record") SysAnnouncement record, @Param("example") SysAnnouncementExample example);

    int updateByExample(@Param("record") SysAnnouncement record, @Param("example") SysAnnouncementExample example);

    int updateByPrimaryKeySelective(SysAnnouncement record);

    int updateByPrimaryKeyWithBLOBs(SysAnnouncement record);

    int updateByPrimaryKey(SysAnnouncement record);
}
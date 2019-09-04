package com.wzf.modules.system.mapper;

import com.wzf.modules.system.entity.JeecgOrderCustomer;
import com.wzf.modules.system.entity.JeecgOrderCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JeecgOrderCustomerMapper {
    int countByExample(JeecgOrderCustomerExample example);

    int deleteByExample(JeecgOrderCustomerExample example);

    int deleteByPrimaryKey(String id);

    int insert(JeecgOrderCustomer record);

    int insertSelective(JeecgOrderCustomer record);

    List<JeecgOrderCustomer> selectByExample(JeecgOrderCustomerExample example);

    JeecgOrderCustomer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JeecgOrderCustomer record, @Param("example") JeecgOrderCustomerExample example);

    int updateByExample(@Param("record") JeecgOrderCustomer record, @Param("example") JeecgOrderCustomerExample example);

    int updateByPrimaryKeySelective(JeecgOrderCustomer record);

    int updateByPrimaryKey(JeecgOrderCustomer record);
}
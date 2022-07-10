package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.pojo.Authors;

public interface AuthorsMapper {
    int deleteByPrimaryKey(Integer authorId);

    int insert(Authors record);

    int insertSelective(Authors record);

    Authors selectByPrimaryKey(Integer authorId);

    int updateByPrimaryKeySelective(Authors record);

    int updateByPrimaryKey(Authors record);
}
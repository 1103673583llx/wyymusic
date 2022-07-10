package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.pojo.Albums;

public interface AlbumsMapper {
    int deleteByPrimaryKey(Integer albumId);

    int insert(Albums record);

    int insertSelective(Albums record);

    Albums selectByPrimaryKey(Integer albumId);

    int updateByPrimaryKeySelective(Albums record);

    int updateByPrimaryKey(Albums record);
}
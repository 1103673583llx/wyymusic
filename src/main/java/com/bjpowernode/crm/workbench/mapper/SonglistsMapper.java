package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.pojo.Songlists;

public interface SonglistsMapper {
    int deleteByPrimaryKey(Integer songlistId);

    int insert(Songlists record);

    int insertSelective(Songlists record);

    Songlists selectByPrimaryKey(Integer songlistId);

    int updateByPrimaryKeySelective(Songlists record);

    int updateByPrimaryKey(Songlists record);
}
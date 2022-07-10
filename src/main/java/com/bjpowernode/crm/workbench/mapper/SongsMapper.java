package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.pojo.Songs;

public interface SongsMapper {
    int deleteByPrimaryKey(Integer songId);

    int insert(Songs record);

    int insertSelective(Songs record);

    Songs selectByPrimaryKey(Integer songId);

    int updateByPrimaryKeySelective(Songs record);

    int updateByPrimaryKey(Songs record);
}
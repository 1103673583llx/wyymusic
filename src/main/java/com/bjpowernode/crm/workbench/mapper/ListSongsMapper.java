package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.pojo.ListSongs;

public interface ListSongsMapper {
    int deleteByPrimaryKey(Integer listSongsId);

    int insert(ListSongs record);

    int insertSelective(ListSongs record);

    ListSongs selectByPrimaryKey(Integer listSongsId);

    int updateByPrimaryKeySelective(ListSongs record);

    int updateByPrimaryKey(ListSongs record);
}
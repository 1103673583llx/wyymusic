package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.pojo.UserSonglists;

public interface UserSonglistsMapper {
    int deleteByPrimaryKey(Integer userSonglistsId);

    int insert(UserSonglists record);

    int insertSelective(UserSonglists record);

    UserSonglists selectByPrimaryKey(Integer userSonglistsId);

    int updateByPrimaryKeySelective(UserSonglists record);

    int updateByPrimaryKey(UserSonglists record);
}
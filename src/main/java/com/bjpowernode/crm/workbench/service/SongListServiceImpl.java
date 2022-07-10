package com.bjpowernode.crm.workbench.service;

import com.bjpowernode.crm.commons.ReturnObject;
import com.bjpowernode.crm.workbench.mapper.SonglistsMapper;
import com.bjpowernode.crm.workbench.pojo.Songlists;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SongListServiceImpl implements SongListService {

    @Resource
    private SonglistsMapper songlistsMapper;

    public ReturnObject CreatSongList(){
        songlistsMapper.insertSelective(new Songlists());
        return new ReturnObject();
    }
}

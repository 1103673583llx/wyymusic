package com.bjpowernode.crm.workbench.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * list_songs
 * @author 
 */
@Data
public class ListSongs implements Serializable {
    /**
     * 主键
     */
    private Integer listSongsId;

    /**
     * 歌单id
     */
    private Integer songlistId;

    /**
     * 作品id
     */
    private Integer songId;

    /**
     * 序号
     */
    private Integer serId;

    private static final long serialVersionUID = 1L;
}
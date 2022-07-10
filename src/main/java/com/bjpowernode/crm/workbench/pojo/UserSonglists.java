package com.bjpowernode.crm.workbench.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * user_songlists
 * @author 
 */
@Data
public class UserSonglists implements Serializable {
    /**
     * 主键
     */
    private Integer userSonglistsId;

    /**
     * 歌单id
     */
    private Integer songlistId;

    /**
     * 用户id
     */
    private Integer userId;

    private static final long serialVersionUID = 1L;
}
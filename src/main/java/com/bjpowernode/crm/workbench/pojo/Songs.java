package com.bjpowernode.crm.workbench.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * songs
 * @author 
 */
@Data
public class Songs implements Serializable {
    /**
     * 主键
     */
    private Integer songId;

    /**
     * 作品名
     */
    private String songName;

    /**
     * 时长
     */
    private String songTime;

    /**
     * vip
     */
    private Boolean songVip;

    /**
     * 作者名
     */
    private String authorName;

    /**
     * 专辑名
     */
    private String albumName;

    private static final long serialVersionUID = 1L;
}
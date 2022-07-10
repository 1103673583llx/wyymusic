package com.bjpowernode.crm.workbench.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * songlists
 * @author 
 */
@Data
public class Songlists implements Serializable {
    /**
     * 主键
     */
    private Integer songlistId;

    /**
     * 歌单名
     */
    private String songlistName;

    private static final long serialVersionUID = 1L;
}
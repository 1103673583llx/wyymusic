package com.bjpowernode.crm.workbench.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * albums
 * @author 
 */
@Data
public class Albums implements Serializable {
    /**
     * 主键
     */
    private Integer albumId;

    /**
     * 专辑名
     */
    private String albumName;

    private static final long serialVersionUID = 1L;
}
package com.bjpowernode.crm.workbench.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * authors
 * @author 
 */
@Data
public class Authors implements Serializable {
    /**
     * 主键
     */
    private Integer authorId;

    /**
     * 作者名
     */
    private String authorName;

    private static final long serialVersionUID = 1L;
}
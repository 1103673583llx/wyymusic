package com.bjpowernode.crm.workbench.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * users
 * @author 
 */
@Data
public class Users implements Serializable {
    /**
     * 主键
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * vip
     */
    private Boolean userVip;

    private static final long serialVersionUID = 1L;

    public Users(String userName){this.userName=userName;}

    public Users(){}
}
package com.bjpowernode.crm.workbench.service;

import com.bjpowernode.crm.commons.ReturnObject;
import com.bjpowernode.crm.workbench.pojo.Users;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public interface AccountService {
    //如果同名不予创建
    public ReturnObject CreateAccount(String user);
}

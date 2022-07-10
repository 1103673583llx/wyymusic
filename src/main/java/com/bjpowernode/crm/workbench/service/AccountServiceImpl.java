package com.bjpowernode.crm.workbench.service;


import com.bjpowernode.crm.commons.ReturnObject;
import com.bjpowernode.crm.workbench.mapper.UsersMapper;
import com.bjpowernode.crm.workbench.pojo.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService{

    @Resource
    private UsersMapper usersMapper;

    private ReturnObject returnObject;

    public ReturnObject CreateAccount(String userName) {
        returnObject=new ReturnObject();
        if(usersMapper.selectByName(userName)!=null){
            returnObject.setCode("0");
            returnObject.setMessage("用户名已存在");
        }
        else {
            usersMapper.insertSelective(new Users(userName));
        }
        return returnObject;
    }
}

package com.bjpowernode.crm.workbench.web.controller.impl;
import com.bjpowernode.crm.workbench.pojo.Users;
import com.bjpowernode.crm.workbench.service.AccountService;
import com.bjpowernode.crm.workbench.service.SongListService;
import com.bjpowernode.crm.workbench.web.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
public class UserControllerImpl implements UserController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private SongListService songListService;

    public Object CreatAccount(String userName){
       return accountService.CreateAccount(userName);
    }

    public Object CreatSongList(){
        return songListService.CreatSongList();
    }
}

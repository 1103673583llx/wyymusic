package test;

import com.bjpowernode.crm.commons.ReturnObject;
import com.bjpowernode.crm.workbench.pojo.Users;
import com.bjpowernode.crm.workbench.service.AccountService;
import com.bjpowernode.crm.workbench.web.controller.UserController;
import com.bjpowernode.crm.workbench.web.controller.impl.UserControllerImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class maintest {

    private UserController userController;
   // private AccountService accountService;

    @Test
    public void test() {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        userController=(UserController)context.getBean("userControllerImpl");
        ReturnObject returnObject=(ReturnObject) userController.CreatAccount("张三");
        System.out.println(returnObject.getCode()+returnObject.getMessage());
    }
}

package com.isoft.action;

import com.isoft.service.IUserService;
import com.isoft.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
            IUserService userService;
//    IUserService userService=new UserServiceImpl();
    @RequestMapping("/login.do")
    @ResponseBody
    public String login(String uname, String upwd) {
        System.out.println(uname + "," + upwd);
        /*硬编码*/

        String str = userService.login(uname,upwd);
        return str;
//        if (uname.equals("admin") && upwd.equals("123456"))
//            return "success";
//        else
//            return "fault";
    }

    @RequestMapping("/register.do")
    @ResponseBody
    public String register(String uname, String upwd,String email) {
//        System.out.println(r_uname + "," + r_upwd+","+email);
        /*硬编码*/
//        boolean temp=true;

        boolean temp = userService.register(uname,upwd,email);
        if (temp)
            return "success";
        else
            return "fault";
    }
}

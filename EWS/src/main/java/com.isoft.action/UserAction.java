package com.isoft.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
    @RequestMapping("/login.do")
    @ResponseBody
    public String login(String uname, String upwd) {
        System.out.println(uname + "," + upwd);
        /*硬编码*/
        if (uname.equals("admin") && upwd.equals("123456"))
            return "success";
        else
            return "fault";
    }
    @RequestMapping("/register.do")
    @ResponseBody
    public String register(String r_uname, String r_upwd,String email) {
        System.out.println(r_uname + "," + r_upwd+","+email);
        /*硬编码*/
        boolean temp=true;
        if (temp)
            return "success";
        else
            return "fault";
    }
}

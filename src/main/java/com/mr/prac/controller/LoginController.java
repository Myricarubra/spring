package com.mr.prac.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangdong on 2018/5/25.
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/index.html")
    public String loginPage() {
        return "login";
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[]{"application-context.xml"}
        );
        LoginController controller = (LoginController) applicationContext.getBean("loginController");
        System.out.println(controller);
    }
}

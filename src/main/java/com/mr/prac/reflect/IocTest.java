package com.mr.prac.reflect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by zhangdong on 2018/5/28.
 */
public class IocTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        Animal animal = (Animal) applicationContext.getBean("animal");
        animal.say();
    }
}

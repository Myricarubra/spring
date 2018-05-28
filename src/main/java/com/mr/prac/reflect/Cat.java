package com.mr.prac.reflect;

/**
 * Created by zhangdong on 2018/5/28.
 */
public class Cat implements Animal {
    private String name;

    @Override
    public void say() {
        System.out.println("I am " + name + " !");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

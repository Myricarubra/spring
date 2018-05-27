package com.mr.prac.reflect;

/**
 * Created by zhangdong on 2018/5/27.
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("current loader:" + loader);
        System.out.println("parent loader:" + loader.getParent());
        System.out.println("grandparent loader:" + loader.getParent().getParent());
    }
}

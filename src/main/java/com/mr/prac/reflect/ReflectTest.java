package com.mr.prac.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by zhangdong on 2018/5/27.
 */
public class ReflectTest {

    public static Car carInit() throws Throwable {
//        通过类装载器获取Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.mr.prac.reflect.Car");

//        获取类的默认构造器并实例化Car
        @SuppressWarnings("unchecked")
        Constructor cons = clazz.getDeclaredConstructor((Class<?>[]) null);
        Car car = (Car) cons.newInstance();
        //        通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "bmw");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "red");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 260);
        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car = carInit();
        System.out.println(car);
    }
}

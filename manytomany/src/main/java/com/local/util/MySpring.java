package com.local.util;

import java.util.HashMap;
import java.util.Map;

public class MySpring {
    //单列设计模式
    private static Map<String ,Object> beanMap=new HashMap<>();
    public static <T>T getBean(String className){//通过类名获取一个对象
        //首先去集合中获取值 如果集合中没有值就通过类名获取一个 并且放入集合中
        T obj=(T)beanMap.get(className);//通过类名去集合中获取一个对象
        //判断
        if (obj==null){
            try { //通过类名创建一个对象
                obj=(T)Class.forName(className).newInstance();
                //并且把这个对象放入集合 让集合帮忙管理
                beanMap.put(className,obj);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }
}

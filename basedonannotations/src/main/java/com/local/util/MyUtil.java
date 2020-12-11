package com.local.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyUtil {

    private static SqlSessionFactory factory;
    private static final Boolean DEFAULT=false;
    static{
        factory=new SqlSessionFactoryBuilder().build(Thread.currentThread().getContextClassLoader().getResourceAsStream("dbconfig.xml"));
    }
    public static SqlSession getSqlSession(){
        return factory.openSession(DEFAULT);//默认手动提交事务
    }

    public static SqlSession getSqlSession(Boolean flag){
        return factory.openSession(flag);
    }
}

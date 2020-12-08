package com.local.mapper;


import com.local.bean.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 静
 * @since 2020-12-08
 */
public class StudentMapper {
    //获取SqlSession
    SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
    SqlSessionFactory factory=builder
            .build(Thread
            .currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream("dbconfig.xml"),
                    "数据库环境");//environment 不写默认dbconfig.xml里面的
    SqlSession sqlSession=factory.openSession(true);//自动提交事务
    //测试别名
    public Student selectOne(Integer sid){
        return sqlSession.selectOne("selectOne",sid);
    }



}

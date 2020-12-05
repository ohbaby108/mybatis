package com.local.mapper;

import com.local.bean.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class StudentMapper {
        //    设计一个方法 用于学生的新增操作
    public void insert(Student student){
        //创建工人对象
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //获取工厂对象
        SqlSessionFactory factory=builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("dbconfig.xml"));
        SqlSession sqlSession=factory.openSession(true);//事务是否自动提交
        //StudentMapper.xml中的id(建议与类名一致)
        sqlSession.insert("insert",student);
        // 若上面没有设置true   手动提交事务
        //   sqlSession.commit();
    }
    public void delete(Integer sid){
        //创建工人对象
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //工人创建工厂
        SqlSessionFactory factory= builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("dbconfig.xml"));

        SqlSession sqlSession=factory.openSession(true);//自动提交事务
        sqlSession.delete("delete",sid);
    }

    public void update(Student student){
        //创建工厂
         SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //工人创建工厂
         SqlSessionFactory factory=builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("dbconfig.xml"));

         SqlSession sqlSession= factory.openSession(true);
         sqlSession.update("update",student);

    }

    public Student selectOne(Integer sid){
        //创建工人
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //工人创建工厂
        SqlSessionFactory factory= builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("dbconfig.xml"));

        SqlSession sqlSession= factory.openSession(true);

       return sqlSession.selectOne("selectOne",sid);
    }

    public List<Student> selectList(){
        //创建工厂
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //工人创建工厂
        SqlSessionFactory factory=builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("dbconfig.xml"));

        SqlSession sqlSession= factory.openSession(true);
       return sqlSession.selectList("selectList");
    }
}

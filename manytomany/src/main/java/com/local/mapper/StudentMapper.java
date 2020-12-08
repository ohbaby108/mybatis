package com.local.mapper;

import com.local.bean.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.local.util.MyUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 静
 * @since 2020-12-08
 */
public class StudentMapper  {
    //获取SqlSession
    private SqlSession sqlSession= MyUtil.getSqlSession(true);
    //设计一个方法 查询一个学生上了多少个老师的课程
    public Student selectOne(Integer sid){
        return sqlSession.selectOne("selectOne",sid);
    }

    //查询所有学生分别上哪些老师的课

    public List<Student> selectList(){
        return sqlSession.selectList("selectList");
    }




}

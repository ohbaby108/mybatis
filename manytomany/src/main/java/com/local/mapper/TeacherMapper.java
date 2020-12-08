package com.local.mapper;


import com.local.bean.Teacher;
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
public class TeacherMapper  {
    //获取SqlSession
    SqlSession sqlSession= MyUtil.getSqlSession(true);

    //查看一个老师给哪些学生上课
    public Teacher selectOne(Integer tid){
        return sqlSession.selectOne("selectOne",tid);
    }

    //查看所有老师上课的所有学生
    public List<Teacher> selectList(){
        return sqlSession.selectList("selectList");
    }



}

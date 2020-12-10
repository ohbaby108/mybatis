package com.local.service;


import com.local.bean.Student;
import com.local.dao.StudentDao;
import com.local.util.MyUtil;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 静
 * @since 2020-12-10
 */
public class StudentService  {

    private StudentDao dao=  MyUtil.getSqlSession(true).getMapper(StudentDao.class);
    //新增
    public void insert(Student student){
        dao.insert(student);
    }
    //删除
    public void delete(Integer sid){
        dao.delete(sid);
    }
    //修改
    public void update(Student student){
        dao.update(student);
    }
    //查询单个
    public Student select(Integer sid){
        return dao.selectOne(sid);
    }
    //查询所有
    public List<Student> selectList(){
        return dao.selectList();
    }
}

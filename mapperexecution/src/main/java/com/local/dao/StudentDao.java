package com.local.dao;

import com.local.bean.Student;

import java.util.List;

public interface StudentDao {
    //新增
    void insert(Student student);
    //删除
    void delete(Integer sid);
    //修改
    void update(Student student);
    //查询
    Student selectOne(Integer sid);
    //查询所有
    List<Student> selectList();

}

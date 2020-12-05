package com.local.server;

import com.local.bean.Student;
import com.local.mapper.StudentMapper;

import java.util.List;

public class StudentServer {

    private StudentMapper mapper=new StudentMapper();
    //增
    public void insert(Student student){
        mapper.insert(student);
    }

    //删
    public void delete(Integer sid){
        mapper.delete(sid);
    }

    //改
    public void update(Student student){
        mapper.update(student);
    }

    //查单个
    public Student selectOne(Integer sid){
        return mapper.selectOne(sid);
    }

    //查询全部
    public List<Student> selectList(){
        return mapper.selectList();
    }

}

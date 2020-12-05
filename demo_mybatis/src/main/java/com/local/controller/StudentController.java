package com.local.controller;

import com.local.bean.Student;
import com.local.server.StudentServer;

import java.util.List;

public class StudentController {
    private StudentServer server=new StudentServer();

    //学生的增加
    public void insertStudent(Student student){
        server.insert(student);
    }

    //学生的删除
    public void deleteStudent(Integer sid){
        server.delete(sid);
    }

    //学生的修改
    public void updateStudent(Student student){
        server.update(student);
    }

    //查询学生信息
    public Student selectOne(Integer sid){
        return server.selectOne(sid);
    }

    //查询所有学生
    public List<Student> selectAll(){
        return server.selectList();
    }

    //查询男女各多少人
    public List<Map<String,Object>> selectCountBySex(){
        return server.selectCountBySex();
    }

    //根据id查询名字
    public String selectNameById(Integer sid){
        return server.selectNameById(sid);
    }

    //查询所有并排序之${}的使用
    public List<Student> selectAllOrderById(String flag){
        return server.selectAllOrderById(flag);
    }
}

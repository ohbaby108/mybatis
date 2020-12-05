package com.local.controller;

import com.local.bean.Student;
import com.local.mapper.StudentMapper;
import com.local.server.StudentServer;

public class StudentController {
    private StudentServer server=new StudentServer();

    public void insertStudent(Student student){
        server.insert(student);
    }

    public void deleteStudent(Integer sid){
        server.delete(sid);
    }



}

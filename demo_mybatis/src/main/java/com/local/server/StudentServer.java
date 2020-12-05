package com.local.server;

import com.local.bean.Student;
import com.local.mapper.StudentMapper;

public class StudentServer {

    private StudentMapper mapper=new StudentMapper();

    public void insert(Student student){
        mapper.insert(student);
    }
    public void delete(Integer sid){
        mapper.delete(sid);
    }


}

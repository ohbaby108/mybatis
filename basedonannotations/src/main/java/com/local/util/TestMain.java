package com.local.util;

import com.local.bean.Student;
import com.local.service.StudentService;
import com.local.service.impl.StudentServiceImpl;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        StudentService service=new StudentServiceImpl();
        Student student=new Student(2,"卫东","男",18);
        //service.insert(student);
        //service.delete(12);
        //service.update(student);
        System.out.println(service.selectOne(2));
        System.out.println("=====================");
        List<Student> studentList=service.selectList();
            for(Student student1:studentList){
                System.out.println(student1);
            }
    }
}

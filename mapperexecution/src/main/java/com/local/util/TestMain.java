package com.local.util;


import com.local.bean.Student;
import com.local.service.StudentService;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        StudentService service=new StudentService();
        //新增
        //Student student=new Student(12,"卫东","男",12);
        //service.insert(student);

        //删除
        //service.delete(12);

        //修改
        //Student student=new Student(1,"卫东","男",12);
        //service.update(student);

        //查询单条
        //System.out.println(service.select(1));

        //查询全部
        List<Student> studentList=service.selectList();
        for (Student stu:studentList){
            System.out.println(stu);
        }
    }
}

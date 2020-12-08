package com.local.util;


import com.local.bean.Student;
import com.local.bean.Teacher;
import com.local.mapper.StudentMapper;
import com.local.mapper.TeacherMapper;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
//        StudentMapper mapper=new StudentMapper();
//        Student student=mapper.selectOne(1);
//        System.out.println(student);
//        System.out.println("===================");
//        List<Student> studentList=mapper.selectList();
//        for(Student student1:studentList){
//            System.out.println(student1);
//        }

        TeacherMapper mapper=new TeacherMapper();
        System.out.println(mapper.selectOne(1));
        System.out.println("================");
        List<Teacher> teacherList=mapper.selectList();
        for(Teacher teacher:teacherList){
            System.out.println(teacher);
        }
    }
}

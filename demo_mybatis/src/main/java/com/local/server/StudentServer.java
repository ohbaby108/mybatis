package com.local.server;

import com.local.bean.Student;
import com.local.mapper.StudentMapper;

import java.util.List;
import java.util.Map;

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

    //查询单女各多少人
    public List<Map<String,Object>> selectCountBySex(){
        return mapper.selectCountBySex();
    }

    //根据id查询名字
    public String selectNameById(Integer sid){
        return mapper.selectNameById(sid);
    }

    //查询所有并排序之${}的使用
    public List<Student> selectAllOrderById(String flag){
        return mapper.selectAllOrderById(flag);
    }


}

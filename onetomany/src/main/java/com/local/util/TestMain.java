package com.local.util;


import com.local.bean.Dept;
import com.local.bean.Emp;
import com.local.mapper.DeptMapper;
import com.local.mapper.EmpMapper;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
//        EmpMapper mapper=new EmpMapper();
//        System.out.println(mapper.selectOne(7369));
//
//
//        List<Emp> empList=mapper.selectList();
//        for(Emp emp:empList){
//            System.out.println(emp);
//        }

        DeptMapper mapper=new DeptMapper();
        Dept dept=mapper.selectOne(10);
            System.out.println(dept);




//        List<Dept> depts=mapper.selectList();
//            for(Dept dept:depts){
//                System.out.println(dept);
//            }

    }
}

package com.local.util;

import com.local.mapper.StudentMapper;

public class TestMain {
    public static void main(String[] args) {
        StudentMapper mapper =new StudentMapper();
        System.out.println(mapper.selectOne(1));
        // 运行成功 可以实现

    }
}

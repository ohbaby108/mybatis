package com.local.service;

import com.local.bean.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 静
 * @since 2020-12-11
 */
public interface StudentService {
    //增
    void insert(Student student);
    //删
    void delete(Integer sid);
    //改
    void update(Student student);
    //查询
    Student selectOne(Integer sid);
    //查询全部
    List<Student> selectList();

}

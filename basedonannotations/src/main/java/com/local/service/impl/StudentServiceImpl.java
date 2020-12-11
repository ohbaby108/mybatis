package com.local.service.impl;


import com.local.bean.Student;
import com.local.mapper.StudentMapper;
import com.local.service.StudentService;
import com.local.util.MyUtil;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 静
 * @since 2020-12-11
 */

public class StudentServiceImpl  implements StudentService {
    //数据持久层的支持
    private StudentMapper mapper= MyUtil.getSqlSession(true).getMapper(StudentMapper.class);
    @Override
    public void insert(Student student) {
        mapper.insert(student);
    }

    @Override
    public void delete(Integer sid) {
        mapper.delete(sid);
    }

    @Override
    public void update(Student student) {
        mapper.update(student);
    }

    @Override
    public Student selectOne(Integer sid) {
        return mapper.selectOne(sid);
    }

    @Override
    public List<Student> selectList() {
        return mapper.selectList();
    }
}

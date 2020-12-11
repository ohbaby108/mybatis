package com.local.mapper;

import com.local.bean.Student;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 静
 * @since 2020-12-11
 */
public interface StudentMapper {
    //设计一个新增学生的方法
    @Insert("insert into student values(#{sid},#{sname},#{ssex},#{sage})")
    void insert(Student student);

    //设计一个删除学生的方法
    @Delete("delete from student where sid=#{sid}")
    void delete(Integer sid);

    //设计一个删除的方法
    @Update("update student set sname=#{sname},ssex=#{ssex},sage=#{sage} where sid=#{sid}")
    void update(Student student);

    //设计一个方法 通过学生的id查询学生的全部信息
    @Select("select sid,sname,ssex,sage from student where sid=#{sid}")
    Student selectOne(Integer sid);

    //设计一个方法 用于查询所有的学生信息
    @Select("select sid,sname,ssex,sage from student")
    List<Student> selectList();

}

package com.local.mapper;

import com.local.bean.Emp;
import com.local.util.MyUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 静
 * @since 2020-12-07
 */
public class EmpMapper  {
    //获取sqlsession
    private SqlSession sqlSession= MyUtil.getSqlSession(true);
    //设计一个方法 通过用户给定的员工编号 查询员工信息以及员工所属部门
    public Emp selectOne(Integer empno){
        return sqlSession.selectOne("selectOne",empno);
    }
    //查询全部人及其所属部门
    public List<Emp> selectList(){
        return sqlSession.selectList("selectList");
    }
}

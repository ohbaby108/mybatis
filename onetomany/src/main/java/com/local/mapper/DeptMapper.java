package com.local.mapper;

import com.local.bean.Dept;
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
public class DeptMapper  {
    //获取SqlSession
    private SqlSession sqlSession= MyUtil.getSqlSession(true);
    //设计一个方法 通过部门编号查询部门下所有的成员
    public Dept selectOne(Integer deptno){
        return sqlSession.selectOne("selectOne",deptno);
    }

    public List<Dept> selectList(){
        return sqlSession.selectList("selectList");
    }

}

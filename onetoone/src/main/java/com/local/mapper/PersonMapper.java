package com.local.mapper;


import com.local.bean.Person;
import com.local.util.MyUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 静
 * @since 2020-12-05
 */
public class PersonMapper {
    private SqlSession sqlSession= MyUtil.getSqlSession(true);

    //通过人的id查询人的所有信息
    public Person selectOne(Integer pid){
        return sqlSession.selectOne("selectOne",pid);
    }

    //通过查询人的信息并且查询人身份证信息

    public List<Person> selectList(){
        return sqlSession.selectList("selectList");
    }


}

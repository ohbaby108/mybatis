package com.local.mapper;


import com.local.bean.Idcard;
import com.local.bean.Person;
import org.apache.ibatis.session.SqlSession;
import com.local.util.MyUtil;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 静
 * @since 2020-12-05
 */
public class IdcardMapper{
    private SqlSession sqlSession=MyUtil.getSqlSession(true);

    public Idcard selectOne(String cardId){
        return sqlSession.selectOne("selectOne",cardId);
    }

    public List<Idcard> selectList(){
        return sqlSession.selectList("selectList");
    }
}

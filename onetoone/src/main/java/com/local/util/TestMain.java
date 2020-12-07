package com.local.util;

import com.local.bean.Idcard;
import com.local.bean.Person;
import com.local.mapper.IdcardMapper;
import com.local.mapper.PersonMapper;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        IdcardMapper idcardMapper=new IdcardMapper();
         //单个人的信息查询
//        Idcard idCard=idcardMapper.selectOne("522224197002061234");
//        System.out.println(idCard);

        //查询所有人的信息
//        List<Idcard> idcards=idcardMapper.selectList();
//        for(Idcard idcard:idcards){
//            System.out.println(idcard);
//        }


        PersonMapper mapper=new PersonMapper();
//       Person person= mapper.selectOne(1);
//        System.out.println(person);
//        PersonMapper mapper=new PersonMapper();
//        System.out.println(mapper.selectOne(1));
       List<Person> personList= mapper.selectList();
       for(Person person:personList){
           System.out.println(person);
       }

    }
}

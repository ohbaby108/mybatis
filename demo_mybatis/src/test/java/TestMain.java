import com.local.bean.Student;
import com.local.mapper.StudentMapper;

import java.util.List;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {

        StudentMapper mapper=new StudentMapper();
        //增测试
        //Student student=new Student(11,"测试","男",22);
        //mapper.insert(student);

        //删测试
        //mapper.delete(11);

        //改测试
        //Student student=new Student(10,"测试","男",22);
        //mapper.update(student);

        //查询单条
        //Student student=  mapper.selectOne(1);
        // System.out.println(student);

        //查询多条
        //List<Student> studentList=mapper.selectList();
        //for(Student student:studentList){
        //System.out.println(student);
        //}

        //查询男女各多少人
//        List<Map<String,Object>> mapList=mapper.selectCountBySex();
//        for(Map map:mapList){
//            System.out.println(map);
//        }

        //根据id查询名字
//        String name=mapper.selectNameById(1);
//        System.out.println(name);


        //${}的使用
       List<Student> studentList= mapper.selectAllOrderById("asc");
       for(Student student:studentList){
           System.out.println(student);
       }

    }

}

import com.local.bean.Student;
import com.local.mapper.StudentMapper;

import java.util.List;

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


        List<Student> studentList=mapper.selectList();
        for(Student student:studentList){
            System.out.println(student);
        }
    }

}

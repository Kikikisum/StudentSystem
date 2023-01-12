package StudentMangerSystem;

public interface StudentService {
        //条件查询，根据id获取学生信息
        void findById(Integer id);
        //新增学生信息
        void insert(Student stu);
        //修改学生信息
        void update(Student stu);
        //删除学生信息
        void delete(Integer id);
}

package StudentMangerSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

public class test {
    public static void main(String[] args){
        Student stu = new Student(12,"叶耶耶",18,"20");
        new StudentFunction().insert(stu);
        Student stu1 = new Student(13,"赵羊羊",28,"20");
        new StudentFunction().insert(stu1);
        Student stu2 = new Student(19,"段短短",28,"52");
        new StudentFunction().insert(stu2);
        new StudentFunction().findById(13);
        Student Stu3=new Student(13,"赵羊羊",25,"20");
        new StudentFunction().update(Stu3);
        new StudentFunction().delete(Stu3.getId());
        new StudentFunction().insert(Stu3);
        classes cla = new classes(20,stu,new Date());
        classes cla1 = new classes(20,stu1,new Date());
        classes cla2 =new classes(19,stu2,new Date());
        classes cla3 =new classes(19,Stu3,new Date());
        new ClassFunction().insert_class(cla);
        new ClassFunction().insert_class(cla1);
        new ClassFunction().insert_class(cla2);
        new ClassFunction().update_class(cla);
    }


}

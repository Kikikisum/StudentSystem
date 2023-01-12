package StudentMangerSystem;

public class Student{
    //学生信息的储存
    private int sid;
    private String name;
    private int age;
    private String classnum;

    public Student() {
    }//无参构造

    public Student(int sid, String name, int age, String classnum) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.classnum = classnum;
    }//带四个参数的构造

    public int getId() {
        return sid;
    }

    public void setId(int id) {
        this.sid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassnum(){
        return classnum;
    }

    public void setClassnum(String sex){
        this.classnum=classnum;
    }

}

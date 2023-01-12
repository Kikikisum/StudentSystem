package StudentMangerSystem;

import java.util.Date;

public class classes {
    private int num;
    private Student stu;
    private Date enter_time;
    public classes() {
    }//无参构造

    public classes(int num,Student stu,Date enter_time) {
        this.num = num;
        this.stu = stu;
        this.enter_time = enter_time;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int id) {
        this.num = num;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Date getEnter_time() {
        return enter_time;
    }

    public void setEnter_time(Date enter_time) {
        this.enter_time = enter_time;
    }


}

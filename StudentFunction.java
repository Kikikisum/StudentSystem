package StudentMangerSystem;

import java.sql.*;
class StudentFunction implements StudentService {
    public void findById(Integer id) {
        Student stu = new Student();
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","070112");
            stat = conn.createStatement();
            String sql="SELECT * FROM students\n"+
                    "WHERE sid='"+id+"'";
            rs=stat.executeQuery(sql);
            while (rs.next()){
                Integer sid = rs.getInt("sid");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                String classnum = rs.getString("classnum");

                //封装Student对象
                stu.setId(sid);
                stu.setName(name);
                stu.setAge(age);
                stu.setClassnum(classnum);
                System.out.println("学号："+stu.getId()+'\n'+"姓名："+stu.getName()+'\n'+"年龄："+stu.getAge()+'\n'+"班级："+stu.getClassnum());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void insert(Student stu){
        Connection conn = null;
        Statement stat = null;
        int result = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","070112");
            stat = conn.createStatement();
            String sql = "INSERT INTO students\n"+
                    "VALUES('"+stu.getId()+"','"+stu.getName()+"','"+stu.getAge()+"',"+stu.getClassnum()+")";
            stat.executeUpdate(sql);
        }catch (Exception e){

            result=0;
            e.printStackTrace();
        }finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if(result!=0){
            System.out.println("学生增加成功");
        }else{
            System.out.println("学生增加失败");
        }
    }
    public void update(Student stu){
        Connection conn=null;
        Statement stat =null;
        int result = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","070112");
            stat = conn.createStatement();
            String sql="UPDATE students SET sid='"+stu.getId()+"',name='"+stu.getName()+"',age='"+stu.getAge()+"',classnum='"+stu.getClassnum()+"'WHERE sid='"+stu.getId()+"'";
            stat.executeUpdate(sql);
        }catch (Exception e){
            result = 0;
            e.printStackTrace();
        }finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if(result!=0){
            System.out.println("学生修改成功");
        }else{
            System.out.println("学生修改失败");
        }
    }
    public void delete(Integer id){
        Connection conn = null;
        Statement stat=null;
        int result = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","070112");
            stat = conn.createStatement();
            String sql = "DELETE FROM students WHERE sid='"+id+"'";
            stat.executeUpdate(sql);
        }catch (Exception e){
            result = 0;
            e.printStackTrace();
        }finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if(result!=0){
            System.out.println("学生删除成功");
        }else{
            System.out.println("学生删除失败");
        }
    }
}

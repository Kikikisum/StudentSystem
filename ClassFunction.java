package StudentMangerSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

 class ClassFunction implements ClassService{
    public void   insert_class(classes cla){
        Connection conn = null;
        Statement stat = null;
        int result = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","070112");
            stat = conn.createStatement();
            Date d =cla.getEnter_time();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String time = sdf.format(d);
            String sql = "INSERT INTO class VALUES('"+cla.getNum()+"','"+cla.getStu()+"','"+time+"')";
            result = stat.executeUpdate(sql);
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
        }if(result!=0){
            System.out.println("增加班级成功");
        }else{
            System.out.println("增加班级失败");
        }
    }

    public  void update_class(classes cla){
        Connection conn = null;
        Statement stat = null;
        int result = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","070112");
            stat = conn.createStatement();
            Date d =cla.getEnter_time();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String time = sdf.format(d);
            String sql = "UPDATE class SET num='"+cla.getNum()+"',stu='"+cla.getStu()+"',enter_time='"+cla.getEnter_time()+"'WHERE stu='"+cla.getStu()+"'";
            result = stat.executeUpdate(sql);
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
        }if(result!=0){
            System.out.println("班级修改成功");
        }else{
            System.out.println("班级修改失败");
        }

    }

}

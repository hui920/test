package java中级.集合框架;


import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                        "root", "123456");
                Statement s = c.createStatement();
        )
        {
            //添加
//            for (int i = 0; i < 100; i++) {
//
//                String sql = "insert into hero values(null ," + " '英雄"+i+"'"  + "," + 313.0f + "," + 50 + ")";
                //因为id列是主键，而插入的是null，所以在创建的时候要为其设置id int(11) PRIMARY KEY AUTO_INCREMENT,
            //删除
                //String sql = "delete from hero where id = 5";
            //修改
                String sql = "update hero set name = 'name 5' where id = 3";
                s.execute(sql);
            //}

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
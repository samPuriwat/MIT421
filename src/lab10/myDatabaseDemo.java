package lab10;

import java.sql.*;

public class myDatabaseDemo {
    private Connection connect() {

        String path = "jdbc:sqlite:D:\\MIT421\\src\\lab10\\myDatabase.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(path);
            System.out.println("Database is Connected.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Can't connect to Database.");
        }
        return conn;
    }//connect

    private void readData() {
        String sql = "select * from student";
        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //loop
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("firstname") + "\t" +
                        rs.getString("lastname") + "\t" +
                        rs.getInt("age"));
            }//while
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//readData

    public static void main(String[] args) {
        myDatabaseDemo myDB = new myDatabaseDemo();
        myDB.readData();
    }

}//class

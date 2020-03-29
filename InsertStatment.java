

import java.sql.*;

public class InsertStatment {
  public static void main(String[] args) {
    Connection con = null;
    try {

      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
      // MySQLに接続
      con = DriverManager.getConnection("jdbc:mysql://localhost/sample",
          "root", "9rRq26SD");
      Statement stmt = con.createStatement();

      System.out.println("MySQLに接続できました。");

      // SQL Insert statment
      Statement stm = con.createStatement();
      String sql = "insert into sample values(4, 'Pyton'), (5,'Go')";
      int result = stm.executeUpdate(sql);
      System.out.println("update count is " + result);



      // SQL Insert statment

    } catch (InstantiationException | IllegalAccessException |
        ClassNotFoundException e) {
      System.out.println("JDBCドライバのロードに失敗しました。");
    } catch (SQLException e) {
      System.out.println("MySQLに接続できませんでした。");
    } finally {

      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          System.out.println("MySQLのクローズに失敗しました。");
        }
      }


    }
  }
}

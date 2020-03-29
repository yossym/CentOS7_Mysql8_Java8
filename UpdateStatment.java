

import java.sql.*;

public class UpdateStatment {
  public static void main(String[] args) {
    Connection con = null;
    try {

      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
      // MySQLに接続
      con = DriverManager.getConnection("jdbc:mysql://localhost/sample",
          "root", "9rRq26SD");
      Statement stmt = con.createStatement();

      System.out.println("MySQLに接続できました。");

      // SQL Update statment
      Statement stm = con.createStatement();
      String sql = "update sample set name = 'Perl' where id = 1";
      int result = stm.executeUpdate(sql);
      System.out.println("update count is " + result);

      // SQL Update statment

      // SQL select statment
      sql = "select * from sample";
      ResultSet rs = stm.executeQuery(sql);

      while(rs.next()){
        int id = rs.getInt("id");
        String name = rs.getString("name");
        System.out.println("取得結果 -> " + id + ":" + name);
      } 

      // SQL select statment




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

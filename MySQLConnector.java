

import java.sql.*;

public class MySQLConnector {
    public static void main(String[] args) {
        Connection con = null;
        try {

            // JDBCドライバのロード - JDBC4.0（JDK1.6）以降は不要
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            // MySQLに接続
	    con = DriverManager.getConnection("jdbc:mysql://localhost/mysql",
		"root", "9rRq26SD");


Statement stmt = con.createStatement();

            System.out.println("MySQLに接続できました。");

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

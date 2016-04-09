package test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {

  static final String DB_URL = "jdbc:mysql://localhost/example";

  static final String USER = "shiyanlou";
  static final String PASS = "shiyanlou";

  public static void main(String[] args) {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    String sql;

    try {
      Driver driver = new org.mariadb.jdbc.Driver();
      DriverManager.registerDriver(driver);

      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      System.out.println("Creating statement...");

      sql = "UPDATE Students SET age = ? WHERE id = ?";
      stmt = conn.prepareStatement(sql);

      stmt.setInt(1, 22);
      stmt.setInt(2, 1);

      int rows = stmt.executeUpdate();
      System.out.println("Number of affected lines: " + rows);

      sql = "SELECT id, name, age FROM Students";
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        int id = rs.getInt("id");
        int age = rs.getInt("age");
        String name = rs.getString("name");

        System.out.print("ID: " + id);
        System.out.print(", Age: " + age);
        System.out.print(", Name: " + name);
        System.out.println();
      }
    } catch (SQLException se) {
      se.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (rs != null)
          rs.close();
        if (stmt != null)
          stmt.close();
        if (conn != null)
          conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Goodbye!");
  }

}

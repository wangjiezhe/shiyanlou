package testFromWiki;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBDemo {

  private static final String dbClassName = "org.mariadb.jdbc.Driver";
  private static final String CONNECTION = "jdbc:mysql://127.0.0.1/emotherearth";

  public static void main(String[] args) throws ClassNotFoundException, SQLException {

    System.out.println(dbClassName);
    Class.forName(dbClassName);
    Properties p = new Properties();
    p.put("user", "shiyanlou");
    p.put("password", "shiyanlou");

    Connection c = DriverManager.getConnection(CONNECTION, p);
    System.out.println("It works!");
    c.close();
  }

}

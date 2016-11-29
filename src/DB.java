import java.sql.*;
import java.io.*;
import java.util.*;

public class DB {

String strDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
String strURL = "jdbc:sqlserver://localhost:8080;";
String strUser = "root";
String strPWD = "1234";

Connection DB_con;      // DB접속
Statement DB_stmt;      // DB접근을 위한 statement 저장
ResultSet DB_rs;        // SQL 실행 결과 저장

    public void dbOpen() throws IOException {
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }

    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }
}

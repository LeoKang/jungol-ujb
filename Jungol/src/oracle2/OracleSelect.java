package oracle2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleSelect {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##green";
		String password = "green1234";

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			Statement stmt = conn.createStatement();

			String sql1 = "SELECT * FROM emp";
			ResultSet rs1 = stmt.executeQuery(sql1);
			while (rs1.next()) {
				System.out.print(rs1.getInt("empno") + " ");
				System.out.print(rs1.getString("ename") + " ");
				System.out.print(rs1.getString("job") + " ");
				System.out.print(rs1.getInt("mgr") + " ");
				System.out.print(rs1.getDate("hiredate") + " ");
				System.out.print(rs1.getInt("sal") + " ");
				System.out.print(rs1.getInt("comm") + " ");
				System.out.println(rs1.getInt("deptno") + " ");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

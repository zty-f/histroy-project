package data;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/*���ݿ����������� */
public class Database {
	private static Connection con=null;

		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		// ����JDBC����
		String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=��������ϵͳ";
		// ���ӷ����������ݿ�
		String userName = "sa"; // Ĭ���û���
		String userPwd = "200214"; // ����
		public  Database(){
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(dbURL, userName, userPwd);
			System.out.println("���ݿ���ϵ�ɹ�!");
			// ������ӳɹ� ����̨���Connection Successful!
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	public static Connection getCon() { return con; }

	/* �û���¼ */
	public static boolean adminLogin(String username, String password) {
		String sql = "select * from user_ where uname=? and upassword=?";
		boolean flag = false;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				flag = true;
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
				 

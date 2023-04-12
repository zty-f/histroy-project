package data;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/*数据库连接与运用 */
public class Database {
	private static Connection con=null;

		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		// 加载JDBC驱动
		String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=汽车租赁系统";
		// 连接服务器和数据库
		String userName = "sa"; // 默认用户名
		String userPwd = "200214"; // 密码
		public  Database(){
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(dbURL, userName, userPwd);
			System.out.println("数据库联系成功!");
			// 如果连接成功 控制台输出Connection Successful!
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	public static Connection getCon() { return con; }

	/* 用户登录 */
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
				 

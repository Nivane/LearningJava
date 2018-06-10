package thisisnobody.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicJDBC {

	public static void main(String[] args) throws Exception {
		
		//数据库基本信息
		String user = "root";
		String password = "helloroot";
		String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=GMT&useSSL=false";
		System.out.println("Connecting to MySQL...");
		
		//初始化驱动程序
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//根据驱动管理器获取连接
		Connection con = DriverManager.getConnection(url, user, password);

		//根据连接进行数据库操作
		Statement sta = con.createStatement();
		ResultSet res = sta.executeQuery("select user, id from employees");

		//遍历结果
		System.out.println("User\tID");
		while (res.next()) {
			System.out.println(res.getString("user") + "\t" + res.getInt("id"));
		}

		sta.close();
		res.close();
		con.close();

	}
}

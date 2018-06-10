package thisisnobody.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicJDBC {

	public static void main(String[] args) throws Exception {
		
		//���ݿ������Ϣ
		String user = "root";
		String password = "helloroot";
		String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=GMT&useSSL=false";
		System.out.println("Connecting to MySQL...");
		
		//��ʼ����������
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//����������������ȡ����
		Connection con = DriverManager.getConnection(url, user, password);

		//�������ӽ������ݿ����
		Statement sta = con.createStatement();
		ResultSet res = sta.executeQuery("select user, id from employees");

		//�������
		System.out.println("User\tID");
		while (res.next()) {
			System.out.println(res.getString("user") + "\t" + res.getInt("id"));
		}

		sta.close();
		res.close();
		con.close();

	}
}

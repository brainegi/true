package dao;

import java.sql.*;

import bean.User;

public class userDAO {

	// DB情報
	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/kandadb";
	private static String USER = "root";
	private static String PASSWD = "root123";

	// DB情報からDBへ接続するメソッド
	private Connection getConnection() {
		try {
			// ドライバーのロード Connectionオブジェクト生成
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	//ユーザーを検索するメソッド
	public User selectByUser (String userid , String password) {

		Connection con = null;
		Statement smt =null;

		//呼び出しもとに返すUserオブジェクトの生成
		User userObj = new User();

		try {

			con = getConnection();
			smt = con.createStatement();

			//SQL文を変数sqlに代入
			String sql = "SELECT * FROM userinfo WHERE userid='" + userid + "'AND password='" + password + "'";

			//検索結果を変数rsにセット
			ResultSet rs = smt.executeQuery(sql);

			//結果をオブジェクトに格納
			if (rs.next()) {
				userObj.setUserid(rs.getString("userid"));
				userObj.setPassword(rs.getString("password"));
			}


		} catch (Exception e) {
			throw new IllegalStateException(e);

		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
		return userObj;
	}
}

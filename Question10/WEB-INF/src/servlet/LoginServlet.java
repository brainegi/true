package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.User;
import dao.userDAO;

public class LoginServlet extends HttpServlet {


	// post送信されたものを実行
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// コマンドとエラーの変数の宣言
		String error = "";
		String cmd = "";

		try {

			// 入力パラメータの取得
			String userid = request.getParameter("userid");
			String password = request.getParameter("password");


			// UserDAOをインスタンス化ユーザーの検索を行う
			userDAO userDaoObj = new userDAO();
			User userObj = userDaoObj.selectByUser(userid, password);


			// ユーザー情報のチェック
			if (userObj.getUserid() == null) {
				error = "ID・パスワードが正しくありません。";
				return;
			}


			// ユーザー情報がある時にセッションスコープにuserObjを登録
			HttpSession session = request.getSession();
			session.setAttribute("userObj", userObj);


			// クッキーに入力情報useridとpasswordを登録(期限1日)
			Cookie userCookie = new Cookie("userid", userObj.getUserid());
			userCookie.setMaxAge(60 * 60 * 24 * 1);
			response.addCookie(userCookie);

			Cookie passCookie = new Cookie("password", userObj.getPassword());
			passCookie.setMaxAge(60 * 60 * 24 * 1);
			response.addCookie(passCookie);


		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、ログインできません。";
			cmd = "login";

		} finally {
			//ログイン成功
			if (error.equals("")) {
				request.getRequestDispatcher("/view/main.jsp").forward(request, response);

			} else {
					//ログイン失敗
				if (!cmd.equals("login")) {
					//エラー原因をリクエストスコープに登録
					request.setAttribute("error", error);
					request.getRequestDispatcher("/view/login.jsp").forward(request, response);

					//エラー発生時
				} else {
					//エラー原因をリクエストスコープに登録
					request.setAttribute("error", error);
					request.setAttribute("cmd", cmd);
					request.getRequestDispatcher("/view/error.jsp").forward(request, response);
				}
			}
		}

	}
}

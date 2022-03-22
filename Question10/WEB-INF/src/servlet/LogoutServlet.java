package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {

	public void doGet(HttpServletRequest request , HttpServletResponse response)
	throws ServletException ,IOException {

		//セッション情報をクリアする
		HttpSession session = request.getSession();

		if (session != null) {
			session.invalidate();
		}

		//ログイン画面に画面遷移する
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);
	}
}

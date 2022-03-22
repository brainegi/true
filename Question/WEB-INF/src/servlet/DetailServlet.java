package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.*;
import dao.*;

public class DetailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String error = "";
		String cmd = "";

		try {

			// ①セッションから"userObj"を取得する。(セッション切れの場合はlogin.jspに遷移する)
			HttpSession session = request.getSession();
			User userObj = (User) session.getAttribute("userObj");

			if (userObj == null) {
				error = "ログインし直してください。";
				cmd = "login";
				return;
			}

			// 格納用のオブジェクト生成
			Question question = new Question();
			questionDAO questionDao = new questionDAO();

			// 画面から送られてくるものをエンコーディング
			request.setCharacterEncoding("UTF-8");

			// 未返信などのボタンを押されたときに番号を取得する
			String num = request.getParameter("num");

			// 取得したものを引数としてDAOオブジェクトを呼び出す
			question = questionDao.selectBynum(num);
			request.setAttribute("question", question);

			if (!(question.getName() != null)) {
				error = "表示対象の書籍が存在しない為、詳細情報は表示できませんでした。";
				cmd = "list";
				return;
			}

		} catch (IllegalStateException e) {
			error = "DBに接続できませんでした。";
			cmd = "main";

		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。";
			cmd = "login";

		} finally {
			if (error.equals("")) {
				// send.jspにフォワードする
				request.getRequestDispatcher("/view/send.jsp").forward(request, response);

			} else {
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}

	}
}

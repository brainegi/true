package servlet;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

import bean.Question;
import bean.User;
import dao.questionDAO;

/**
 * @author harashima
 * @version 10 一覧表示をする為のサーブレット
 *
 */
public class ListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String error = "";
		String cmd = "";

		// ①セッションから"userObj"を取得する。(セッション切れの場合はlogin.jspに遷移する)
		HttpSession session = request.getSession();
		User userObj = (User) session.getAttribute("userObj");

		if (userObj == null) {
			error = "ログインし直してください。";
			cmd = "login";
			request.setAttribute("error", error);
			request.setAttribute("cmd", cmd);
			return;
		}

		try {

			// DAOクラスオブジェクト化
			questionDAO qDao = new questionDAO();

			// ArrayList←DAOクラス検索結果
			ArrayList<Question> list = qDao.search();

			// リクエストスコープに登録する
			request.setAttribute("list", list);

		} catch (IllegalStateException e) {
			error = "DBに接続できませんでした。";
			cmd = "";

		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。";
			cmd = "login";

		} finally {

			// エラーがあるかないかで処理を分ける
			if (error.equals("")) {
				// エラーが無い場合→リストjsp
				request.getRequestDispatcher("/view/list.jsp").forward(request, response);
			} else {
				// エラーがある場合→エラーjsp
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}

		}

	}
}

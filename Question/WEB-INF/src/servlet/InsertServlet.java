package servlet;

import java.io.*;
import java.time.*;
import java.time.format.*;

import javax.servlet.*;
import javax.servlet.http.*;

import bean.*;
import dao.*;

public class InsertServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String error = "";
		String cmd = "";

		try {
			// 画面から送られてくる文字をエンコーディング
			request.setCharacterEncoding("UTF-8");

			// オブジェクトの作成
			Question question = new Question();
			questionDAO questionDao = new questionDAO();

			// 現在の日付取得
			DateTimeFormatter day = DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm");
			String date = day.format(LocalDateTime.now());

			// 画面から情報を取得
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String gender = request.getParameter("gender");
			String address = request.getParameter("address");
			String mail = request.getParameter("mail");
			String selected = request.getParameter("selected");
			String text = request.getParameter("text");

			// 取得したものを格納
			question.setName(name);
			question.setAge(age);
			question.setSex(gender);
			question.setAdress(address);
			question.setMail(mail);
			question.setSelected(selected);
			question.setText(text);
			question.setDate(date);

			// 格納したものを基にDAOを呼び出し、登録
			questionDao.insert(question);

		} catch (IllegalStateException e) {
			error = "DBに接続できませんでした。";
			cmd = "customer";

		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。";
			cmd = "customer";

		} finally {
			if (error.equals("")) {
				// formConfirm.jspにフォワードする
				request.getRequestDispatcher("/view/formConfirm.jsp").forward(request, response);

			} else {
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);

			}
		}
	}

}

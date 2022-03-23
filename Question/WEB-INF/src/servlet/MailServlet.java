package servlet;

import java.io.*;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.Question;
import bean.SendMail;
import bean.User;
import dao.questionDAO;

public class MailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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

			// 画面から送られてくる文字をエンコーディング
			request.setCharacterEncoding("UTF-8");

			// mail機能オブジェクト
			SendMail sendMail = new SendMail();

			// 送信元と送信者名をセット
			sendMail.setFromInfo("system.project.team08@kanda-it-school-system.com", "お問い合わせシステム");

			// 送信先をセット
			String mail = request.getParameter("mail");
			sendMail.setRecipients(mail);

			// 件名セット
			String textA = request.getParameter("textA");
			sendMail.setSubject(textA);

			// 本文セット
			String textB = request.getParameter("textB");
			sendMail.setText(textB);

			// 送信するメソッド
			boolean tf = sendMail.forwardMail();

			String num = "";
			// メール送信確認
			if (tf) {
				// 送信済みの更新
				num = request.getParameter("num");
				questionDAO qDao = new questionDAO();
				qDao.update(num);
			} else {
				error = "メール送信エラーの為、送信出来ませんでした";
				cmd = "list";
			}

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、送信は出来ません";
			cmd = "list";

		} finally {
			if (error.equals("")) {
				// エラーがないときフォワード
				request.getRequestDispatcher("/view/sendConfirm.jsp").forward(request, response);

			} else {
				// エラーがあるときエラー画面へ
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}

		}
	}
}

<!-- 管理者用メイン画面 -->
<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.User"%>
<%
	User userObj = (User) session.getAttribute("userObj");
	if (userObj == null) {
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);
	}
%>

<html>
<head>
<title>管理者メニュー</title>
</head>

<header>
	<h1 style="text-align: center; color: blue">お問い合わせシステム</h1>
	<hr style="height: 4px; background-color: blue">
</header>

<body style="text-align: center;" bgcolor=#F0FFF0>
	<h2>管理者メニュー</h2>

	<p style="font-size: 20;">
		<a href="<%=request.getContextPath()%>/list">[お問い合わせ一覧]</a>
	</p>
	<p>
		<a href=""></a>
	</p>
	<p>
		<a href=""></a>
	</p>


	<br>
	<br>
	<br>
	<br>

	<form action="<%=request.getContextPath()%>/logout" method="get">
		<input type="submit" value="ログアウト">
	</form>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<footer>
		<hr style="height: 4px; background-color: blue">
		<p style="text-align: left">2022/03 お問い合わせシステム</p>
	</footer>
</body>
</html>

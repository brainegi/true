<!-- 管理者ログイン画面 -->
<%@page contentType="text/html; charset=UTF-8"%>
<%
	String error = (String) request.getAttribute("error");
%>

<html>
<head>
<title>管理者専用</title>
</head>

<header>
	<h1 style="text-align: center; color: blue">ログイン</h1>
	<hr style="height: 4px; background-color: blue">
</header>

<body bgcolor=#F0FFF0>
	<a href="<%=request.getContextPath()%>/view/form.jsp">フォーム</a>

	<br>
	<br>
	<form name="login" action="<%=request.getContextPath()%>/login"
		method="post">
		<table align="center">
			<tr>
				<td width="200">ID</td>
				<td><input type="text" name="userid" required></td>
			</tr>
			<tr>
				<td>パスワード</td>
				<td><input type="text" name="password" required></td>
			</tr>
		</table>

		<%
			if (error != null) {
		%>
		<p style="text-align: center"><%=error%></p>
		<%
			} else {
		%>
		<br>
		<%
			}
		%>

		<table align="center">
			<tr>
				<td><input button onclick="clickEvent()" type="submit"
					value="ログイン"></td>
			</tr>
		</table>
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
	<br>
	<br>
	<br>


	<footer>
		<hr style="height: 4px; background-color: blue">
		<p>2022/03 お問い合わせシステム</p>
	</footer>
</body>
</html>


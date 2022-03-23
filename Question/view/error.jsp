<!-- 各種エラー表示画面 -->
<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.*"%>
<%
	String error = (String) request.getAttribute("error");
	String cmd = (String) request.getAttribute("cmd");
	String num = (String) request.getAttribute("num");
%>

<html>
<head>
<meta charset="UTF-8">
<title>エラー</title>
</head>

<header>
	<h1 style="text-align: center; color: red">エラー</h1>
	<hr style="height: 4px; background-color: red">
</header>

<body>

	<h2 align="center">◆◆◆エラー◆◆◆</h2>
	<table align="center">
		<tr>
			<td><%=error%></td>
		</tr>
		<tr>
			<td align="center">
				<%
					if (cmd.equals("customer")) {
				%> <a href="<%=request.getContextPath()%>/view/form.jsp">お問い合わせフォームに戻る</a>
				<%
					} else if (cmd.equals("login")) {
				%> <a href="<%=request.getContextPath()%>/view/login.jsp">ログイン画面に戻る</a>
				<%
					} else if (cmd.equals("list")) {
				%> <a href="<%=request.getContextPath()%>/list">一覧画面に戻る</a> <%
 	} else {
 %> <a href="<%=request.getContextPath()%>/view/main.jsp">メイン画面に戻る</a> <%
 	}
 %>
			</td>
		</tr>
	</table>


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
	<br>
	<br>

	<footer>
		<hr style="height: 4px; background-color: red">
		<p>2022/03 お問い合わせシステム</p>
	</footer>
</body>
</html>
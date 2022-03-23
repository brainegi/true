<!-- 管理者用お問い合わせ一覧画面 -->
<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList,bean.*"%>
<%
	User userObj = (User) session.getAttribute("userObj");
	if (userObj == null) {
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);
	}
%>
<%
	ArrayList<Question> list = (ArrayList<Question>) request.getAttribute("list");
%>


<html>
<head>
<title>管理者メニュー</title>
</head>


<body bgcolor=#F0FFF0>
	<!--ヘッダー部分  -->
	<header>
		<h1 style="text-align: center; color: blue">管理者画面</h1>
		<hr style="height: 4px;; background-color: blue">
	</header>


	<table>
		<tr>
			<td><a href="<%=request.getContextPath()%>/view/main.jsp">[メニュー]</a></td>
			<td></td>
			<td><form action="<%=request.getContextPath()%>/logout"
					method="">
					<input type="submit" value="ログアウト">
				</form></td>
		</tr>
	</table>

	<br>
	<h2 align="center">お問い合わせ一覧</h2>

	<%--メイン --%>

	<table align="center" border="4" bgcolor="white"
		style="border-width: 3px; border-style: solid; border-collapse: collapse; border-color: black">

		<tr>
			<th style="width: 100px; color: white;" bgcolor="blue">No.</th>
			<th style="width: 200px; color: white;" bgcolor="blue">名前</th>
			<th style="width: 100px; color: white;" bgcolor="blue">性別</th>
			<th style="width: 150px; color: white;" bgcolor="blue">お問い合わせ日</th>
			<th style="text-align: center; width: 400px; color: white;"
				bgcolor="blue">お問い合わせ内容</th>
			<th style="width: 100px; color: white;" bgcolor="blue">送信/ 未送信</th>
		</tr>

		<%
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					Question qObj = list.get(i);
		%>
		<tr style="text-align: center;">
			<td style="width: 100px;"><%=qObj.getNum()%></td>
			<td style="width: 200px;"><%=qObj.getName()%></td>
			<td style="width: 100px;"><%=qObj.getSex()%></td>
			<td style="width: 150px;"><%=qObj.getDate()%></td>
			<td style="width: 400px;"><%=qObj.getText()%></td>
			<td style="width: 100px;">
				<%
					if (list.get(i).getTf().equals("未送信")) {
				%> <a
				href="<%=request.getContextPath()%>/detail?num=<%=qObj.getNum()%>">
					<input type="submit" value=<%=qObj.getTf()%>
					style="color: dimgray; background-color: ivory;">
			</a> <%
 	} else {
 %> <a
				href="<%=request.getContextPath()%>/detail?num=<%=qObj.getNum()%>">
					<input type="submit" value=<%=qObj.getTf()%>
					style="color: darkred; background-color: sandybrown;">
			</a> <%
 	}
 %>
			</td>
		</tr>
		<%
			}
			}
		%>

	</table>

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
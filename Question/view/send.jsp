<!-- 管理者用詳細画面・返信画面 -->
<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.*"%>
<%
	User userObj = (User) session.getAttribute("userObj");
	if (userObj == null) {
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);
	}
%>

<%
	Question question = (Question) request.getAttribute("question");
%>

<html>
<head>
<title>管理者メニュー</title>
</head>

<header>
	<h1 style="text-align: center; color: blue">管理者画面</h1>
	<hr style="height: 4px; background-color: blue">
</header>

<table>
	<tr>
		<td><a href="<%=request.getContextPath()%>/view/main.jsp">[メニュー]</a></td>
		<td></td>
		<td><a href="<%=request.getContextPath()%>/list">[一覧]</a></td>
		<td></td>
		<td>
			<form action="<%=request.getContextPath()%>/logout">
				<input type="hidden" name="cmd" value="logout"> <input
					type="submit" value="ログアウト">
			</form>
		</td>
	</tr>
</table>

<body>
	<h2 align="center">お問い合わせ返信</h2>
	<br>
	<h4 align="center">お客様情報詳細</h4>

	<table align="center" border="1">
		<tr style="text-align:center">
			<td style="color:white; width:50px;" bgcolor="blue">No</td>
			<td style="color:white; width:100px;" bgcolor="blue">名前</td>
			<td style="color:white; width:50px;" bgcolor="blue">年齢</td>
			<td style="color:white; width:50px;" bgcolor="blue">性別</td>
			<td style="color:white; width:100px;" bgcolor="blue">住所</td>
			<td style="color:white; width:200px;" bgcolor="blue">メールアドレス</td>
			<td style="color:white; width:240px;" bgcolor="blue">お問い合わせ内容</td>
			<td style="color:white; width:360px;" bgcolor="blue">その他</td>
			<td style="color:white; width:150px;" bgcolor="blue">お問い合わせ日時</td>
			<td style="color:white; width:100px;" bgcolor="blue">送信/未送信</td>
		</tr>

		<tr style="text-align:center">
			<td><%=question.getNum()%></td>
			<td><%=question.getName()%></td>
			<td><%=question.getAge()%></td>
			<td><%=question.getSex()%></td>
			<td><%=question.getAdress()%></td>
			<td><%=question.getMail()%></td>
			<td><%=question.getSelected()%></td>
			<td style="text-align:left"><%=question.getText()%></td>
			<td><%=question.getDate()%></td>
			<td><%=question.getTf()%></td>
		</tr>
	</table>

	<br>
	<br>

	<form action="<%=request.getContextPath()%>/mail" method="get">
		<table align="center">
			<input type="hidden" name="num" value="<%=question.getNum()%>">
			<input type="hidden" name="mail" value="<%=question.getMail()%>">
			<tr>
				<td>件名：</td>
				<td><input id="textA" type="text" name="textA"></td>
			</tr>
			<tr>
				<td>本文：</td>
				<td colspan="5"><textarea id="textB" name="textB" cols="80"
						rows="10" name="replay" placeholder="※返信内容を記入"></textarea></td>
		</table>
		<br>
		<table align="center">
			<tr>
				<td><input button onclick="clickEvent()" type="submit"
					value="送信"></td>
			</tr>
		</table>
	</form>

	<script type="text/javascript">
		function clickEvent() {

			var textA = document.getElementById("textA").value;
			var textB = document.getElementById("textB").value;

			var str = "";
			if (textA.length <= 0) {
				alert('件名が空白です。');
				str = prompt("件名を入力してください。");
				document.getElementById("textA").value = str;
			}

			if (textB.length <= 0) {
				alert('メール本文が空白です。');
				str = prompt("送信内容を入力してください。");
				document.getElementById("textB").value = str;
			}

		};
	</script>
</body>
</html>
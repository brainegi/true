<!-- 管理者用送信完了画面 -->
<%@page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
			<title>管理者メニュー</title>
	</head>

	<header>
			<h1 style="text-align: center;color: blue">お問い合わせシステム</h1>
			<hr style="height: 4px; background-color: blue">
	</header>

		<table>
			<tr>
				<td><a href="<%=request.getContextPath()%>/view/main.jsp">[メニュー]</a></td>
				<td></td>
				<td><a href="<%=request.getContextPath()%>/list">[一覧]</a></td>
				<td></td>
				<td>
					<form action="<%=request.getContextPath() %>/logout">
						<input type="submit" value="ログアウト">
					</form>
				</td>
			</tr>
		</table>

		<body bgcolor=#F0FFF0>
			<h2 align="center">お問い合わせ完了</h2>
			<table align="center">
				<tr>
					<td>お客様に送信されました。</td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr align="center">
					<td>
						<p><a href="<%=request.getContextPath() %>/list">一覧画面に戻る</a></p>
					</td>
				</tr>
			</table>
		</body>
</html>
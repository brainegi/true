<!-- お客様用送信完了画面 -->

<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>お問い合わせフォーム</title>
</head>

<header>
	<h1 style="text-align: center">お問い合わせシステム</h1>
	<hr style="height: 4px; background-color: black">
</header>

<body bgcolor="pink">
	<h2 align="center">お問い合わせ完了</h2>
	<table align="center">
		<tr>
			<td>送信されました。</td>
		</tr>
		<tr>
			<td>回答は登録されたメールアドレスに</td>
		</tr>
		<tr>
			<td>お送りさせていただきます。</td>
		</tr>
		<tr>
			<td></td>
		</tr>
		<tr>
			<td><a href="<%=request.getContextPath()%>/view/form.jsp">
					<p>メニュー画面に戻る</p>
			</a></td>
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


	<footer>
		<hr style="height: 4px; background-color: black">
		<p>2022/03 お問い合わせシステム</p>
	</footer>

</body>
</html>
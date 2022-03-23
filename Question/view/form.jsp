<!-- お問い合わせフォーム画面 -->
<%@page contentType="text/html; charset=UTF-8"%>

<html>
<!--head情報-->
<head>
<title>お問合せフォーム</title>
</head>

<header>
	<h1 style="text-align: center; color:saddlebrown">お問い合わせフォーム</h1>
	<hr style="height: 4px; background-color: saddlebrown">
</header>

<!--body情報-->
<body bgcolor=#FFE4C4>

	<form action="<%=request.getContextPath()%>/insert" method="get">
		<table align="center">

			<tr>
				<td>名前：<input id="name" type="text" name="name" required /></td>
			</tr>

			<td>年齢： <select name="age" required>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30" selected>30</option>
					<option value="31">31</option>
					<option value="32">32</option>
					<option value="33">33</option>
					<option value="34">34</option>
					<option value="35">35</option>
					<option value="36">36</option>
					<option value="37">37</option>
					<option value="38">38</option>
					<option value="39">39</option>
					<option value="40">40</option>
					<option value="41">41</option>
					<option value="42">42</option>
					<option value="43">43</option>
					<option value="44">44</option>
					<option value="45">45</option>
					<option value="46">46</option>
					<option value="47">47</option>
					<option value="48">48</option>
					<option value="49">49</option>
					<option value="50">50</option>
					<option value="51">51</option>
					<option value="52">52</option>
					<option value="53">53</option>
					<option value="54">54</option>
					<option value="55">55</option>
					<option value="56">56</option>
					<option value="57">57</option>
					<option value="58">58</option>
					<option value="59">59</option>
					<option value="60">60</option>
					<option value="61">61</option>
					<option value="62">62</option>
					<option value="63">63</option>
					<option value="64">64</option>
					<option value="65">65</option>
					<option value="66">66</option>
					<option value="67">67</option>
					<option value="68">68</option>
					<option value="69">69</option>
					<option value="70">70</option>
					<option value="71">71</option>
					<option value="72">72</option>
					<option value="73">73</option>
					<option value="74">74</option>
					<option value="75">75</option>
					<option value="76">76</option>
					<option value="77">77</option>
					<option value="78">78</option>
					<option value="79">79</option>
					<option value="80">80</option>
					<option value="81">81</option>
					<option value="82">82</option>
					<option value="83">83</option>
					<option value="84">84</option>
					<option value="85">85</option>
					<option value="86">86</option>
					<option value="87">87</option>
					<option value="88">88</option>
					<option value="89">89</option>
					<option value="90">90</option>
					<option value="91">91</option>
					<option value="92">92</option>
					<option value="93">93</option>
					<option value="94">94</option>
					<option value="95">95</option>
					<option value="96">96</option>
					<option value="97">97</option>
					<option value="98">98</option>
					<option value="99">99</option>
			</select>
			</td>

			<tr>
				<td>性別： 男性<input type="radio" name="gender" value="男性" required>
					女性<input type="radio" name="gender" value="女性" required>
				</td>
			</tr>

			<tr>
				<td>住所：<input id="adress" type="text" name="address" required></td>
			</tr>

			<tr>
				<td>メールアドレス：<input id="mail" type="text" name="mail" required></td>
			</tr>

			<tr>
				<td>お問合せ内容 <select name="selected" required>
						<option value="料金・お支払いについて">① 料金・お支払いについて</option>
						<option value="講座、コース、教材について">② 講座、コース、教材について</option>
						<option value="学習の進め方について">③ 学習の進め方について</option>
						<option value="受講期限について">④ 受講期限について</option>
						<option value="受講終了後のサポートについて">⑤ 受講終了後のサポートについて</option>
				</select>
				</td>
			</tr>


			<tr>
				<td>メッセージ:</td>
			</tr>
			<tr>
				<td>その他伝達事項等があればご記入ください。</td>
			</tr>
			<tr>
				<td><textarea id="text" name="text" rows="5" cols="40"
						placeholder="※返信内容を記入"></textarea></td>
			</tr>
			<tr>
				<td><input type="hidden" name="tf" value="未返信"></td>
			</tr>
			<tr>
				<td align="center"><input button onclick="clickEvent()"
					type="submit" value="送信"></td>
			</tr>
		</table>

	</form>

	<script type="text/javascript">
		function clickEvent() {
			var name = document.getElementById("name").value;
			var adress = document.getElementById("adress").value;
			var mail = document.getElementById("mail").value;
			var text = document.getElementById("text").value;

			var str = "";
			if (name.length > 10) {
				str = prompt("名前の文字数が入力制限を超えています。再度入力してください。");
				document.getElementById("name").value = str;
			}

			if (adress.length > 100) {
				str = prompt("アドレスの文字数が入力制限を超えています。再度入力してください。");
				document.getElementById("adress").value = str;
			}

			if (mail.length > 100) {
				str = prompt("メールの文字数が入力制限を超えています。再度入力してください。");
				document.getElementById("mail").value = str;
			}

			if (text.length > 50) {
				str = prompt("メッセージの文字数が入力制限を超えています。（最大50文字まで）再度入力してください。");
				document.getElementById("text").value = str;
			}

		};
	</script>


	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<footer>

		<hr style="height: 4px; background-color: saddlebrown">
		<p>2022/03 お問い合わせシステム</p>
		<a href="<%=request.getContextPath()%>/view/login.jsp">管理者用ログイン</a>
	</footer>


</body>

</html>
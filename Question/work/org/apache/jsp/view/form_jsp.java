/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2022-03-22 05:26:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- お問い合わせフォーム画面 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<!--head情報-->\r\n");
      out.write("<head>\r\n");
      out.write("<title>お問合せフォーム</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("\t<h1 style=\"text-align: center\">お問い合わせフォーム</h1>\r\n");
      out.write("\t<hr style=\"height: 4px; background-color: black\">\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!--body情報-->\r\n");
      out.write("<body bgcolor=\"pink\">\r\n");
      out.write("\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/view/login.jsp\">管理者用ログイン</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/insert\" method=\"get\">\r\n");
      out.write("\t\t<table align=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>名前：<input id=\"name\" type=\"text\" name=\"name\" required /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td>年齢： <select name=\"age\" required>\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"6\">6</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"7\">7</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"8\">8</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"9\">9</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"10\">10</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"11\">11</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"12\">12</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"13\">13</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"14\">14</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"15\">15</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"16\">16</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"17\">17</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"18\">18</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"19\">19</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"20\">20</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"21\">21</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"22\">22</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"23\">23</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"24\">24</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"25\">25</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"26\">26</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"27\">27</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"28\">28</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"29\">29</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"30\" selected>30</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"31\">31</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"32\">32</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"33\">33</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"34\">34</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"35\">35</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"36\">36</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"37\">37</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"38\">38</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"39\">39</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"40\">40</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"41\">41</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"42\">42</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"43\">43</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"44\">44</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"45\">45</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"46\">46</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"47\">47</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"48\">48</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"49\">49</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"50\">50</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"51\">51</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"52\">52</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"53\">53</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"54\">54</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"55\">55</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"56\">56</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"57\">57</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"58\">58</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"59\">59</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"60\">60</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"61\">61</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"62\">62</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"63\">63</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"64\">64</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"65\">65</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"66\">66</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"67\">67</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"68\">68</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"69\">69</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"70\">70</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"71\">71</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"72\">72</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"73\">73</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"74\">74</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"75\">75</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"76\">76</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"77\">77</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"78\">78</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"79\">79</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"80\">80</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"81\">81</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"82\">82</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"83\">83</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"84\">84</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"85\">85</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"86\">86</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"87\">87</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"88\">88</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"89\">89</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"90\">90</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"91\">91</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"92\">92</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"93\">93</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"94\">94</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"95\">95</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"96\">96</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"97\">97</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"98\">98</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"99\">99</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>性別： 男性<input type=\"radio\" name=\"gender\" value=\"男性\" required>\r\n");
      out.write("\t\t\t\t\t女性<input type=\"radio\" name=\"gender\" value=\"女性\" required>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>住所：<input id=\"adress\" type=\"text\" name=\"address\" required></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>メールアドレス：<input id=\"mail\" type=\"text\" name=\"mail\" required></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>お問合せ内容 <select name=\"selected\" required>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"料金・お支払いについて\">① 料金・お支払いについて</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"講座、コース、教材について\">② 講座、コース、教材について</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"学習の進め方について\">③ 学習の進め方について</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"受講期限について\">④ 受講期限について</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"受講終了後のサポートについて\">⑤ 受講終了後のサポートについて</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>メッセージ:</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>その他伝達事項等があればご記入ください。</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><textarea id=\"text\" name=\"text\" rows=\"5\" cols=\"40\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"※返信内容を記入\"></textarea></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"hidden\" name=\"tf\" value=\"未返信\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><input button onclick=\"clickEvent()\"\r\n");
      out.write("\t\t\t\t\ttype=\"submit\" value=\"送信\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction clickEvent() {\r\n");
      out.write("\t\t\tvar name = document.getElementById(\"name\").value;\r\n");
      out.write("\t\t\tvar adress = document.getElementById(\"adress\").value;\r\n");
      out.write("\t\t\tvar mail = document.getElementById(\"mail\").value;\r\n");
      out.write("\t\t\tvar text = document.getElementById(\"text\").value;\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar str = \"\";\r\n");
      out.write("\t\t\tif (name.length > 10) {\r\n");
      out.write("\t\t\t\tstr = prompt(\"名前の文字数が入力制限を超えています。再度入力してください。\");\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"name\").value = str;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (adress.length > 100) {\r\n");
      out.write("\t\t\t\tstr = prompt(\"アドレスの文字数が入力制限を超えています。再度入力してください。\");\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"adress\").value = str;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (mail.length > 100) {\r\n");
      out.write("\t\t\t\tstr = prompt(\"メールの文字数が入力制限を超えています。再度入力してください。\");\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"mail\").value = str;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (text.length > 50) {\r\n");
      out.write("\t\t\t\tstr = prompt(\"メッセージの文字数が入力制限を超えています。（最大50文字まで）再度入力してください。\");\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"text\").value = str;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t};\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<hr style=\"height: 4px; background-color: black\">\r\n");
      out.write("\t\t<p>2022/03 お問い合わせシステム</p>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

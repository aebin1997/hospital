/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2021-01-07 03:00:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userEnroll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/user/../../views/common/footer.jsp", Long.valueOf(1609658644552L));
  }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>직산 가정의학 의원</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/jiksan/resources/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function validate(){\r\n");
      out.write("\t//유효성 검사 코드 작성함\r\n");
      out.write("\t//서버 컨트롤러로 전송할 값들이 요구한 조건을 모두 만족하였는지 검사하는 것\r\n");
      out.write("\r\n");
      out.write("\t//암호와 암호확인이 일치하지 않는지 확인함\r\n");
      out.write("\tvar pwValue1 = document.getElementById(\"user_pw1\").value;\r\n");
      out.write("\tvar pwValue2 = document.getElementById(\"user_pw2\").value;\r\n");
      out.write("\tif(pwValue1 !== pwValue2){\r\n");
      out.write("\t\talert(\"암호와 암호확인이 일치하지 않습니다. 다시 입력해 주세요.\");\r\n");
      out.write("\t\tdocument.getElementById(\"user_pw1\").select();\r\n");
      out.write("\t\treturn false;  //전송 취소함\r\n");
      out.write("\t} //if\r\n");
      out.write("\t\r\n");
      out.write("\treturn true;  //전송처리됨\r\n");
      out.write("}  //validate()\r\n");
      out.write("\r\n");
      out.write("//아이디 중복 체크 확인을 위한 ajax 실행 처리용 함수\r\n");
      out.write("function dupIdCheck(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: \"/jiksan/idchk\",\r\n");
      out.write("\t\ttype: \"post\",\r\n");
      out.write("\t\tdata: {user_id : $(\"#user_id\").val() },\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t//처리결과를 문자열로 받음\r\n");
      out.write("\t\t\tconsole.log(\"success : \" + data);\r\n");
      out.write("\t\t\tif(data == \"ok\"){\r\n");
      out.write("\t\t\t\talert(\"사용 가능한 아이디입니다.\");\r\n");
      out.write("\t\t\t\t$(\"#user_pw1\").focus();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"이미 사용중인 아이디입니다.\\n다시 입력하세요.\");\r\n");
      out.write("\t\t\t\t$(\"#user_id\").select();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror: function(jqXHR, textstatus, errorthrown){\r\n");
      out.write("\t\t\t//에러 발생시 구동되는 콜백함수임\r\n");
      out.write("\t\t\tconsole.log(\"error : \" + jqXHR + \", \" + textstatus \r\n");
      out.write("\t\t\t\t\t+ \", \" + errorthrown);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//닉네임 중복 체크 확인을 위한 ajax 실행 처리용 함수\r\n");
      out.write("function dupNnmCheck(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: \"/jiksan/nnmchk\",\r\n");
      out.write("\t\ttype: \"post\",\r\n");
      out.write("\t\tdata: {nick_nm : $(\"#nick_nm\").val() },\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t//처리결과를 문자열로 받음\r\n");
      out.write("\t\t\tconsole.log(\"success : \" + data);\r\n");
      out.write("\t\t\tif(data == \"ok\"){\r\n");
      out.write("\t\t\t\talert(\"사용 가능한 닉네임입니다.\");\r\n");
      out.write("\t\t\t\t$(\"#birthday\").focus();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"이미 사용중인 닉네임입니다.\\n다시 입력하세요.\");\r\n");
      out.write("\t\t\t\t$(\"#nick_nm\").select();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror: function(jqXHR, textstatus, errorthrown){\r\n");
      out.write("\t\t\t//에러 발생시 구동되는 콜백함수임\r\n");
      out.write("\t\t\tconsole.log(\"error : \" + jqXHR + \", \" + textstatus \r\n");
      out.write("\t\t\t\t\t+ \", \" + errorthrown);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//회원가입 취소 버튼 - 취소 시 모든 데이터가 사라집니다.\r\n");
      out.write("function btn(){ \r\n");
      out.write("\talert('회원가입을 종료하시겠습니까?');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.\r\n");
      out.write("\tfunction sample4_execDaumPostcode() {\r\n");
      out.write("\t\tnew daum.Postcode(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\toncomplete : function(data) {\r\n");
      out.write("\t\t\t\t\t\t// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t// 도로명 주소의 노출 규칙에 따라 주소를 표시한다.\r\n");
      out.write("\t\t\t\t\t\t// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("\t\t\t\t\t\tvar roadAddr = data.roadAddress; // 도로명 주소 변수\r\n");
      out.write("\t\t\t\t\t\tvar extraRoadAddr = ''; // 참고 항목 변수\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t// 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("\t\t\t\t\t\t// 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("\t\t\t\t\t\tif (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {\r\n");
      out.write("\t\t\t\t\t\t\textraRoadAddr += data.bname;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t// 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("\t\t\t\t\t\tif (data.buildingName !== '' && data.apartment === 'Y') {\r\n");
      out.write("\t\t\t\t\t\t\textraRoadAddr += (extraRoadAddr !== '' ? ', '\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ data.buildingName : data.buildingName);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("\t\t\t\t\t\tif (extraRoadAddr !== '') {\r\n");
      out.write("\t\t\t\t\t\t\textraRoadAddr = ' (' + extraRoadAddr + ')';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t// 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById('sample4_postcode').value = data.zonecode;\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"sample4_roadAddress\").value = roadAddr;\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"sample4_jibunAddress\").value = data.jibunAddress;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"sample4_engAddress\").value = data.addressEnglish;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t// 참고항목 문자열이 있을 경우 해당 필드에 넣는다.\r\n");
      out.write("\t\t\t\t\t\tif (roadAddr !== '') {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"sample4_extraAddress\").value = extraRoadAddr;\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById(\"sample4_extraAddress\").value = '';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar guideTextBox = document.getElementById(\"guide\");\r\n");
      out.write("\t\t\t\t\t\t// 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.\r\n");
      out.write("\t\t\t\t\t\tif (data.autoRoadAddress) {\r\n");
      out.write("\t\t\t\t\t\t\tvar expRoadAddr = data.autoRoadAddress\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ extraRoadAddr;\r\n");
      out.write("\t\t\t\t\t\t\tguideTextBox.innerHTML = '(예상 도로명 주소 : '\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ expRoadAddr + ')';\r\n");
      out.write("\t\t\t\t\t\t\tguideTextBox.style.display = 'block';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t} else if (data.autoJibunAddress) {\r\n");
      out.write("\t\t\t\t\t\t\tvar expJibunAddr = data.autoJibunAddress;\r\n");
      out.write("\t\t\t\t\t\t\tguideTextBox.innerHTML = '(예상 지번 주소 : '\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ expJibunAddr + ')';\r\n");
      out.write("\t\t\t\t\t\t\tguideTextBox.style.display = 'block';\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tguideTextBox.innerHTML = '';\r\n");
      out.write("\t\t\t\t\t\t\tguideTextBox.style.display = 'none';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}).open();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("section table#loginTbl {\r\n");
      out.write("\tfloat: center;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("<div><h1><a href=\"/jiksan/index.jsp\"><img src=\"/jiksan/resources/main_images/jiksan_logo.png\" alt=\"직산 가정의학과 의원\"></a></h1></div>\r\n");
      out.write("</header>\r\n");
      out.write("<section>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/jiksan/enroll.cp\" method=\"post\">\r\n");
      out.write("<table id=\"userEnroll\">\r\n");
      out.write("\t<caption>회원가입</caption>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr><th width=\"120\">회원구분</th>\r\n");
      out.write("\t\t<td><input type=\"radio\" name=\"user_lv\" value=\"1\" checked>일반</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr><th width=\"120\">본인인증</th></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr><th width=\"120\">이름</th>\r\n");
      out.write("\t<td><input type=\"text\" name=\"user_nm\" id=\"user_nm\" placeholder=\"본인인증 시 자동입력\" required></td></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr><th width=\"120\">휴대폰</th>\r\n");
      out.write("\t<td ><input type=\"tel\" name=\"phone\" placeholder=\"휴대폰인증 시 자동입력\" required></td></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr><th width=\"120\">아이디</th>\r\n");
      out.write("\t<td><input type=\"text\" name=\"user_id\" id=\"user_id\" placeholder=\"영문소문자/숫자, 4~16자\" required> &nbsp; \r\n");
      out.write("\t<input required id=\"checkId\" type=\"button\" value=\"중복확인\" onclick=\"dupIdCheck();\"></td></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\t<th width=\"120\">비밀번호</th>\r\n");
      out.write("\t<td><input type=\"password\" name=\"user_pw\" id=\"user_pw1\" placeholder=\"영문 대소문자/숫자/특수문자 중 2가지 이상 조합, 8자~20자\" required></td></tr>\r\n");
      out.write("\t<tr><th width=\"120\">비밀번호 확인</th>\r\n");
      out.write("\t<td><input type=\"password\" id=\"user_pw2\"></td></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<th width=\"120\">주소</th>\r\n");
      out.write("\t<td><input type=\"text\" id=\"sample4_postcode\" name=\"address\" placeholder=\"우편번호\"> \r\n");
      out.write("\t<input type=\"button\" onclick=\"sample4_execDaumPostcode()\" value=\"우편번호 찾기\"> \r\n");
      out.write("\t<br>\r\n");
      out.write("\t<input type=\"text\" id=\"sample4_roadAddress\" name=\"address\" placeholder=\"도로명주소\" size=\"60\">\r\n");
      out.write("\t<br> <input type=\"hidden\" id=\"sample4_jibunAddress\" name=\"address\" placeholder=\"지번주소\" size=\"60\"> \r\n");
      out.write("\t<span id=\"guide\" style=\"color: #999; display: none\"></span> \r\n");
      out.write("\t<input type=\"text\" id=\"sample4_detailAddress\" name=\"address\" placeholder=\"상세주소\" size=\"60\"> <br>\r\n");
      out.write("\t<input type=\"hidden\" id=\"sample4_extraAddress\" name=\"address\" placeholder=\"참고항목\" size=\"60\">\r\n");
      out.write("    <input type=\"hidden\" id=\"sample4_engAddress\" name=\"address\" placeholder=\"영문주소\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr><th width=\"120\">닉네임</th>\r\n");
      out.write("\t<td><input type=\"text\" name=\"nick_nm\" id=\"nick_nm\" required> &nbsp;\r\n");
      out.write("\t<input type=\"checkbox\" name=\"nick_nm\" value=\"nick_nm\">아이디와 동일 &nbsp;\r\n");
      out.write("\t<input required id=\"checkNnm\" type=\"button\" value=\"중복확인\" onclick=\"dupNnmCheck();\"></td></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr><th width=\"120\">생년월일</th>\r\n");
      out.write("\t<td><input style=\"width:40px;\" type=\"text\" name=\"birthday\" placeholder=\"yyyy\" id=\"birthday\" required>&nbsp;\r\n");
      out.write("\t\t<input type=\"text\" placeholder=\"mm\" name=\"birthday\" list=\"month\" style=\"width:40px;\">\r\n");
      out.write("<datalist id=\"month\">\r\n");
      out.write("\t<option value=\"01\">\r\n");
      out.write("\t<option value=\"02\">\r\n");
      out.write("\t<option value=\"03\">\r\n");
      out.write("\t<option value=\"04\">\r\n");
      out.write("\t<option value=\"05\">\r\n");
      out.write("\t<option value=\"06\">\r\n");
      out.write("\t<option value=\"07\">\r\n");
      out.write("\t<option value=\"08\">\r\n");
      out.write("\t<option value=\"09\">\r\n");
      out.write("\t<option value=\"10\">\r\n");
      out.write("\t<option value=\"11\">\r\n");
      out.write("\t<option value=\"12\">\r\n");
      out.write("</datalist> &nbsp;\r\n");
      out.write("<input type=\"text\" placeholder=\"dd\" name=\"birthday\" list=\"day\" style=\"width:40px;\">\r\n");
      out.write("<datalist id=\"day\">\r\n");
      out.write("\t<option value=\"01\">\r\n");
      out.write("\t<option value=\"02\">\r\n");
      out.write("\t<option value=\"03\">\r\n");
      out.write("\t<option value=\"04\">\r\n");
      out.write("\t<option value=\"05\">\r\n");
      out.write("\t<option value=\"06\">\r\n");
      out.write("\t<option value=\"07\">\r\n");
      out.write("\t<option value=\"08\">\r\n");
      out.write("\t<option value=\"09\">\r\n");
      out.write("\t<option value=\"10\">\r\n");
      out.write("\t<option value=\"11\">\r\n");
      out.write("\t<option value=\"12\">\r\n");
      out.write("\t<option value=\"13\">\r\n");
      out.write("\t<option value=\"14\">\r\n");
      out.write("\t<option value=\"15\">\r\n");
      out.write("\t<option value=\"16\">\r\n");
      out.write("\t<option value=\"17\">\r\n");
      out.write("\t<option value=\"18\">\r\n");
      out.write("\t<option value=\"19\">\r\n");
      out.write("\t<option value=\"20\">\r\n");
      out.write("\t<option value=\"21\">\r\n");
      out.write("\t<option value=\"22\">\r\n");
      out.write("\t<option value=\"23\">\r\n");
      out.write("\t<option value=\"24\">\r\n");
      out.write("\t<option value=\"25\">\r\n");
      out.write("\t<option value=\"26\">\r\n");
      out.write("\t<option value=\"27\">\r\n");
      out.write("\t<option value=\"28\">\r\n");
      out.write("\t<option value=\"29\">\r\n");
      out.write("\t<option value=\"30\">\r\n");
      out.write("\t<option value=\"31\">\r\n");
      out.write("</datalist>\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr><th width=\"120\">성 별</th>\r\n");
      out.write("\t<td>\t\r\n");
      out.write("\t\t<input type=\"radio\" name=\"gender\" value=\"M\" checked> 남자 &nbsp; \r\n");
      out.write("\t\t<input type=\"radio\" name=\"gender\" value=\"F\"> 여자\t\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("<!-- \r\n");
      out.write("<div class=\"agreement\">\r\n");
      out.write("    <h3>AGREEMENT</h3>\r\n");
      out.write("    <div style=\"overflow-y:scroll; width:300px; height:150px; padding:10px; border:1px solid black;\">\r\n");
      out.write("            <p><span style=\"font-family: 돋움,dotum;\">제1조 ...<br>\r\n");
      out.write("            테스트<br>테스트<br>테스트<br>테스트<br>테스트<br>테스트<br>테스트<br>테스트<br>테스트<br>테스트<br>테스트<br>테스트<br>테스트<br>테스트<br></span></div>\r\n");
      out.write("        <p class=\"check\"><span>이용약관에 동의하십니까?</span> <input id=\"agree1\" name=\"agree_service_check[]\" fw-filter=\"/1/\" fw-label=\"이용약관 동의\" fw-msg=\"이용약관에 동의 하세요\" class=\"ec-base-chk\" value=\"1\" type=\"checkbox\" rquired /><label for=\"agree_service_check0\" >동의함</label></p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"pircacyPolicy\">\r\n");
      out.write("    <h3>PRIVACY POLICY</h3>\r\n");
      out.write("    <div style=\"overflow-y:scroll; width:300px; height:150px; padding:10px; border:1px solid black;\">\r\n");
      out.write("            <p><span style=\"font-family: 돋움,dotum;\">제1조 ...</span>        </div>\r\n");
      out.write("        <p class=\"check\"><span>개인정보 수집 및 이용에 동의하십니까?</span><input id=\"agree2\" name=\"agree_privacy_check[]\" fw-filter=\"/1/\" fw-label=\"개인정보 수집 및 이용 방침\" fw-msg=\"개인정보 수집 및 이용 방침에 동의하세요\" class=\"ec-base-chk\" value=\"1\" type=\"checkbox\" requried /><label for=\"agree_privacy_check0\" >동의함</label></p>\r\n");
      out.write("    </div>\r\n");
      out.write("-->\r\n");
      out.write("<table id=\"enrollFinish\">\r\n");
      out.write("<tr><th><input type=\"button\" value=\"회원가입 취소\" onclick=\"\"> &nbsp; <input type=\"submit\" value=\"회원가입\"></th></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("footer {\r\n");
      out.write("   background:#3e4247;\r\n");
      out.write("   text-align : center;\r\n");
      out.write("   width : 100%;\r\n");
      out.write("   height : 10%;\r\n");
      out.write("   color: #d1d1d1;\r\n");
      out.write("   font-size : 0.8em;\r\n");
      out.write("   padding-top : 2%;   \r\n");
      out.write("   padding-bottom : 2%;   \r\n");
      out.write("   line-height:1;\r\n");
      out.write("}\r\n");
      out.write("footer div h3 {\r\n");
      out.write("   color: #fff;\r\n");
      out.write("   font-size : 1.2em;\r\n");
      out.write("   font-weight : none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer_btn_list li {\r\n");
      out.write(" float: auto; overflow: hidden;\r\n");
      out.write(" padding-right: 10px;\r\n");
      out.write(" display:inline;\r\n");
      out.write(" line-height:2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#copyright, .footer_btn_list, address{\r\n");
      out.write("   color: #9AA0A6 /* #80868B */\r\n");
      out.write("} \r\n");
      out.write("hr { clear : both; }\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   //개인정보처리방침\r\n");
      out.write("   function OpenMemberPrivate() { // \"개인정보처리방침\" 만들기? 가져오기\r\n");
      out.write("      window.open(\r\n");
      out.write("                  \"/jiksan/resources/js/개인정보처리방침.asp\",\r\n");
      out.write("                  \"MemberPrivate\",\r\n");
      out.write("                  \"toolbar=0, left=100, top=50, location=0, directories=0, status=0, menubar=0, scrollbars=1, resizable=0, copyhistory=0, width=600 ,height=600\");\r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("<div>\r\n");
      out.write("            <h3>직산 가정의학과 의원 Jiksan Family Medicine Clinic</h3><br>\r\n");
      out.write("            <address>충남 천안시 서북구 직산읍 직산로 31 직산농협 2층 &nbsp;&nbsp;&nbsp;&nbsp; (041) 583-8500\r\n");
      out.write("            </address>\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            <p>\r\n");
      out.write("               평일 08:30 ~ 18:00 &nbsp;&nbsp;&nbsp;&nbsp; 토요일 09:00 ~ 13:00\r\n");
      out.write("               &nbsp;&nbsp;&nbsp;&nbsp; 점심시간 13:00 ~ 14:00\r\n");
      out.write("               &nbsp;&nbsp;&nbsp;&nbsp; 화요일 야간진료 21:00 까지 &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("               <i>일요일/공휴일은 휴무입니다.</i>\r\n");
      out.write("            </p>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label id=\"copyright\">Copyright ⓒ 2020 by Jiksan Family Medicine Clinic. All rights reserved.</label>\r\n");
      out.write("            <br>\r\n");
      out.write("         </div>\r\n");
      out.write("            <ul class=\"footer_btn_list\">\r\n");
      out.write("               <li><a href=\"#\" onclick=\"OpenMemberPrivate();\" style=\"cursor: pointer;\">개인정보처리방침</a></li>\r\n");
      out.write("               <li> | </li>\r\n");
      out.write("               <li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("               <li> | </li>\r\n");
      out.write("               <li><a href=\"/jiksan/contact-us\">찾아오시는길</a></li>         ");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
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

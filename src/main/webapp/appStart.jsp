<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    request.setCharacterEncoding("UTF-8");
    String result = (String) request.getAttribute("result") ;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題5-1</title>
<style>
body {
  border: solid 2px #000080;
  padding: 5px;
}
.result {
  background: #fffacd;
  display: inline-block;
  margin: 5px;
  padding: 10px;
}
</style>
</head>
<body>

  <h1>Java応用 - 演習問題5-1</h1>

  <h2>ゲームアプリ実行ページ</h2>
  
  <c:if test = "${not empty result}">
  <div class="result">  
    <h3>アプリの実行結果</h3>
   	<p>${requestScope.result}</p> 
   	<c:if test = "${t =0}">
	<p>実行時間：${requestScope.t}</p>
	</c:if> 
	 </div>
	</c:if>


  <form action="StartAppServlet" method="post">
    <label>ユーザ名：</label>
    <input type="text" name="name">
    <br>
    <label for="ap">アプリ : </label>
    <input type = "radio" name = "game" value = "to" checked>トランプ
    <input type = "radio" name = "game" value = "ge" >ダーツ
    <input type = "radio" name = "game" value = "ti"> 時計
    <input type = "radio" name = "game" value = "oth"> その他
    <br>
    <button type="submit">実行</button>
  </form>
</body>
</html>
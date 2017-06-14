<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>文件列表</title>   
  </head>
  <body>
    <table border="1px" width="600px">
    	<tr>
    		<th>文件名称</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${requestScope.list }" var="filename">
    		<tr>
    			<td>${filename }</td>
    			<td><a href="${pageContext.request.contextPath }/down_load?filename=${filename}">下载</a></td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>

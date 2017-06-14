<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>文件上传</title>   
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath }/upload" method="post" enctype="multipart/form-data">
    	文件:<input type="file" name="file"><br>
    	描述：<input type="text" name="info"><br>
    	<input type="submit" value="提交">
    </form>
  </body>
</html>

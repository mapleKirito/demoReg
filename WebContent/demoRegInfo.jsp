<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>填写注册信息</title>
</head>
<body>
填写注册信息<br/>
<form action="DemoRegServlet" method="post">
安装单位信息:<input name="installCompany" type="text"><br/>
负责人姓名:<input name="managerName" type="text"><br/>
联系方式:<input name="managerPhone" type="text"><br/>
机器码:<input name="machineCode" type="text"><br/>
序列号:<input name="serialNumber" type="text"><br/>
<input type="submit" value="提交">
</form>
</body>
</html>
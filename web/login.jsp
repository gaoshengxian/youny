<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<meta http-equiv="Content-Encoding" content="gzip"/>
		<title>gaeainfo</title>
	</head>
	<body>
		login...${message}    
		
		<form action="http://localhost:8080/gaeaback/controller/ul/login" method="post">
			<input name="username" type="text"/>
			<br/>
			<input name="password" type="password"/>
			<br/>
			<input value="登陆" type="submit" />
		</form>
		
	</body>	
</html>




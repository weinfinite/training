<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session Tracking Profile Page</title>
</head>
<body>
	<% Object name = session.getAttribute("uname"); %>
	<% Object date = session.getAttribute("lastVisited");  %> 
	<h1>Welcome <%= name %> </h1>
	<p>This is sample Page for session tracking using HTTP session </p>
	<p>Your Last accessed time <b><%= date %> </b>  </p>
	<a href="sessionLogout">Click Here Logout</a>
</body>
</html>
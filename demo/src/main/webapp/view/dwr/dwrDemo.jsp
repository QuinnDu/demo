<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
	<head>  
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />  
	<title>Insert title here</title>  
	<script src='<c:url value="/dwr/engine.js"/>'></script>  
	<script src='<c:url value="/dwr/util.js" />'></script>  
	<script src='<c:url value="/dwr/interface/dwrDemo.js" />'></script>  
	<script type="text/javascript">  
		dwrDemo.sayHello(function(data){
			alert(data);
		}); 
	</script>  
	</head>  
	<body>  
	</body>  
</html>  
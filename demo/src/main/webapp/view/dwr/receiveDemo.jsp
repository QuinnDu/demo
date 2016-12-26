<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

        <script src="<%=path%>/common/js/jquery-3.1.1.js"></script>

        <script src='<c:url value="/dwr/engine.js"/>'></script>
        <script src='<c:url value="/dwr/util.js" />'></script>
        <script src='<c:url value="/dwr/interface/dwrPushServer.js" />'></script>
    </head>
    <title>消息推送</title>
    </head>
    <body>
        <h2>接受消息推送</h2>
    </body>
    <script>
        $(function() {
            dwr.engine.setActiveReverseAjax(true);
            dwr.engine.setNotifyServerOnPageUnload(true);
            dwrPushServer.onPageLoad('dwrUser');
        });

        function showMessage(autoMessage) {
            console.log(autoMessage);
        }
    </script>
</html>
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
        <title>消息推送</title>
    </head>
    <body>
        <h2>发送消息推送</h2>
        <div id="p" class="easyui-panel" style="width:400px; height:100x; padding:10px;">
            <div>
                ID：<input id="uid" style="width: 40%; height: 25px">
                消息：<input id="msg" style="width: 40%; height: 25px"></br>
                     </br>
                    <a href="javascript:void(0)" style="width:30%; height:25px" onclick="sendMsg()">发送</a>
            </div>
        </div>
    </body>
    <script>
        function sendMsg() {
            dwrPushServer.pushMessage($('#uid').val(), $('#msg').val());
            $('#uid').val('');
            $('#msg').val('');
        }
    </script>
</html>
</html>  
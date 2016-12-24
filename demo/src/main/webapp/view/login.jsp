<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; UTF-8">
	<title>登录</title>
<%-- 	<%@ include file="head/common.jsp"%> --%>
	<!-- CSS -->	
	<link rel="stylesheet" href="css/supersized.css">
	<link rel="stylesheet" href="css/login.css">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
		<script src="js/html5.js"></script>
	<![endif]-->
	<script type="text/javascript" src="js/jquery.form.js"></script>
	<script type="text/javascript" src="js/tooltips.js"></script>
	<script type="text/javascript" src="js/login.js"></script>
	<script src="js/supersized.3.2.7.min.js"></script>
	<script src="js/supersized-init.js"></script>
	<script src="js/scripts.js"></script>
	</head>
	<body>
	<div class="page-container">
		<div class="main_box">
			<div class="login_box">
				<div class="login_logo">
					<img src="images/login/logo.png" >
				</div>
				<div class="login_form">
					<form action="login.do" id="login_form" method="post">
						<div class="form-group">
							<label for="j_username" class="t">帐　户：</label> 
							<input id="userName" value="" name="userName" type="text" class="form-control x319 in">
						</div>
						<div class="form-group">
							<label for="j_password" class="t">密　码：</label> 
							<input id="password" value="" name="password" type="password" 
							class="password form-control x319 in">
						</div>
						<div class="form-group">
							<label for="j_captcha" class="t">验证码：</label>
							 <input id="j_captcha" name="j_captcha" type="text" class="form-control x164 in">
							<img id="captcha_img" alt="点击更换" title="点击更换" src="images/login/captcha.jpeg" class="m">
						</div>
						<div class="form-group">
							<label class="t"></label>
							<label for="j_remember" class="m">
							<input id="j_remember" type="checkbox" value="true">&nbsp;记住登陆账号!</label>
						</div>
						<div class="form-group space">
							<label class="t"></label>　　　
							<button type="button"  id="submit_btn" class="btn btn-primary btn-lg">&nbsp;登&nbsp;录&nbsp;</button>
							<input type="reset" value="&nbsp;重&nbsp;置&nbsp;" class="btn btn-default btn-lg btn-reset">
						</div>
					</form>
				</div>
			</div>
			<div class="bottom">Copyright &copy; 2015 - 2016 <a href="#">杜保坤</a></div>
		</div>
	</div>
	</body>
</html>
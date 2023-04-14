<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add client</title>
<script type="text/javascript"src="http://libs.baidu.com/jquery/1.8.3/jquery.min.js"></script>
</head>
<body>
	<div class="content-box-header">
		<h3>新增用户信息</h3>
	</div>

	<div class="content-box-content">
		<form name="form1" action="fund/fundAddRes.action" method="post"
		onSubmit="return checkNull()">
			<p>
				名字：<input class="text-input large-input" type="text" name="name" />
			</p>
			<p>
				性别：<input class="text-input large-input" type="text" name="sex" />
			</p>			
			<p>
				身份证：<input class="text-input large-input" type="text" name="idcard" />
			</p>
			<p>
				电话：<input class="text-input large-input" type="text" name="phone" />
			</p>
			<p>
				地址：<input class="text-input large-input" type="text" name="address" />
			</p>
			<p>
				e-mail：<input class="text-input large-input" type="text" name="email" />
			</p>
			<p>
				爱好：<input class="text-input large-input" type="text" name="hobby" />
			</p>
			<p>
				<input id="add_client_btn" class="button" type="submit" value="新增" /> <input
					class="button" type="reset" value="取消" />
			</p>
		</form>
	</div>
<script type="text/javascript"  src="./client_add.js"> </script>
</body>
</html>
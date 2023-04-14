
$(document).ready(function(){	//$(document).ready()，这是为了防止文档在完全加载（就绪）之前运行 jQuery 代码。
	$("#add_client_btn").click(function(){	//给id控件绑定点击事件
		var map = {};//定义一个空对象
		var formValue= $('form').serializeArray();
		$.each(formValue, function() {//...
		  map[this.name] = this.value;//为对象添加属性
		});
		alert(JSON.stringify(map));//对象转json
	})
})
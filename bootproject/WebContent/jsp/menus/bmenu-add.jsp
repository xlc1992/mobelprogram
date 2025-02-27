<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>网站后台</title>
<link rel="stylesheet" type="text/css"
	href="../../static/layui/css/layui.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/admin.css" />
</head>
<body>
	<div class="wrap-container">
		<form class="layui-form" style="width: 90%; padding-top: 20px;">
			<div class="layui-form-item">
				<label class="layui-form-label">菜单分类：</label>
				<div class="layui-input-block">
					<select name="category" lay-verify="required">
						<option value="0">作为顶级菜单</option>
						<option value="010">关于我们</option>
						<option value="021">产品中心</option>
						<option value="021">新闻中心</option>
						<option value="021">业务范围</option>
						<option value="021">联系我们</option>
						<option value="021">在线留言</option>
					</select>
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">父级：</label>
				<div class="layui-input-block">
					<select name="category2" lay-verify="required">
						<option value="0">/</option>
						<option value="010">首页</option>
						<option value="010">关于我们</option>
						<option value="021">产品中心</option>
						<option value="021">新闻中心</option>
						<option value="021">业务范围</option>
						<option value="021">联系我们</option>
						<option value="021">在线留言</option>
					</select>
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">标签：</label>
				<div class="layui-input-block">
					<input type="text" name="label" required lay-verify="required"
						placeholder="请输入标签" autocomplete="off" class="layui-input"
						value="关于我们">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">内部跳转：</label>
				<div class="layui-input-block">
					<select name="link1">
						<option value="">请选择跳转项</option>
						<optgroup label="栏目">
							<option value="010">首页</option>
							<option value="010">关于我们</option>
							<option value="021">产品中心</option>
							<option value="021">新闻中心</option>
						</optgroup>
						<optgroup label="单页">
							<option value="021">业务范围</option>
							<option value="021">联系我们</option>
							<option value="021">在线留言</option>
						</optgroup>
					</select>
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">外部链接：</label>
				<div class="layui-input-block">
					<input type="text" name="link2" required lay-verify="required"
						placeholder="请输入外部链接" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">打开方式：</label>
				<div class="layui-input-block">
					<select name="category" lay-verify="required">
						<option value="0">默认</option>
						<option value="010">新窗口打开</option>

					</select>
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">图标：</label>
				<div class="layui-input-block">
					<input type="text" name="title" required lay-verify="required"
						placeholder="请输入图标" autocomplete="off" class="layui-input">
				</div>

			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">状态：</label>
				<div class="layui-input-block">
					<input type="radio" name="status" value="1" title="显示" checked>
					<input type="radio" name="status" value="0" title="隐藏">
				</div>

			</div>

			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn layui-btn-normal" lay-submit
						lay-filter="formDemo">立即提交</button>
					<button type="reset" class="layui-btn layui-btn-primary">重置</button>
				</div>
			</div>
		</form>
	</div>

	<script src="../../static/layui/layui.js" type="text/javascript"
		charset="utf-8"></script>
	<script>
		//Demo
		layui.use([ 'form' ], function() {
			var form = layui.form();
			form.render();
			//监听提交
			form.on('submit(formDemo)', function(data) {
				layer.msg(JSON.stringify(data.field));
				return false;
			});
		});
	</script>
</body>
</html>
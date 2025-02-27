<%@page import="com.hbtcsrzzx.utils.ConfigConsts.Constants"%>
<%@page import="com.hbtcsrzzx.ssm.po.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<c:set var="ctx" scope="session"
	value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="iframe-h">

<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>机构列表</title>

<script src="../../static/js/jquery.min.js" type="text/javascript"
        charset="utf-8"></script>

<script src="../../static/layui/layui.all.js" type="text/javascript"
        charset="utf-8"></script>
<script src="../../static/js/common.js" type="text/javascript"
        charset="utf-8"></script>
        <script type="text/javascript"
    src="../../static/lib/ueditor/ueditor.config.js"></script>
<script type="text/javascript"
    src="../../static/lib/ueditor/ueditor.all.js"></script>
<script type="text/javascript"
    src="../../static/lib/ueditor/ueditor_my.js"></script>
<link rel="stylesheet" type="text/css"
    href="../../static/layui/css/layui.css" />
</head>
<%
	Admin admin = (Admin) session.getAttribute("admin");
%>
<body>


	<div class="layui-upload">
		<button type="button" class="layui-btn layui-btn-normal" id="testList">选择指定格式的xsl文件</button>
		<div class="layui-upload-list">
			<table class="layui-table">
				<thead>
					<tr>
						<th>文件名</th>
						<th>大小</th>
						<th>状态</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody id="demoList"></tbody>
			</table>
		</div>
		<button type="button" class="layui-btn" id="testListAction">开始导入</button>
	</div>
   
	
	<script>
	 
	     
	layui.use(['form','upload','layedit'], function(){
		
		  var $ = layui.jquery
		  ,upload = layui.upload;
		  
			//多文件列表示例
			var demoListView = $('#demoList')
			,uploadListIns = upload.render({
			  elem: '#testList'
			  ,data:{
				 text:""
			  }
			  ,url: '../files/fileuploadInstitution.action'
			  ,accept: 'file'
			  ,multiple: true,
			  async: false
			  ,auto: false
			  ,bindAction: '#testListAction'
			  ,choose: function(obj){   
			    var files = this.files = obj.pushFile(); //将每次选择的文件追加到文件队列
			    //读取本地文件
			    obj.preview(function(index, file, result){
			      var tr = $(['<tr id="upload-'+ index +'">'
			        ,'<td>'+ file.name +'</td>'
			        ,'<td>'+ (file.size/1014).toFixed(1) +'kb</td>'
			        ,'<td>等待上传</td>'
			        ,'<td>'
			          ,'<button class="layui-btn layui-btn-xs demo-reload layui-hide">重传</button>'
			          ,'<button class="layui-btn layui-btn-xs layui-btn-danger demo-delete">删除</button>'
			        ,'</td>'
			      ,'</tr>'].join(''));
			      
			      //单个重传
			      tr.find('.demo-reload').on('click', function(){
			        obj.upload(index, file);
			      });
			      
			      //删除
			      tr.find('.demo-delete').on('click', function(){
			        delete files[index]; //删除对应的文件
			        tr.remove();
			        uploadListIns.config.elem.next()[0].value = ''; //清空 input file 值，以免删除后出现同名文件不可选
			      });
			      
			      demoListView.append(tr);
			    });
			  }
			  ,done: function(res, index, upload){
			    if(res.code === 200){ 
			    	var dataUrl = res.data;
			    	var dataUrls  = dataUrl.split('.');
			    	if(dataUrls[1] === "xsl"){
			    		xslUrl = dataUrl;
			    	}else if(dataUrls[1] === "jpg" || dataUrls[1] ===  "png"){
			    		imgUrl = dataUrl;
			    	}
			    	//上传成功
			      var tr = demoListView.find('tr#upload-'+ index)
			      ,tds = tr.children();
			      tds.eq(2).html('<span style="color: #5FB878;">上传成功</span>');
			      tds.eq(3).html(''); //清空操作
			      return delete this.files[index]; //删除文件队列已经上传成功的文件
			    }
			    this.error(index, upload);
			  }
			  ,error: function(index, upload){
			    var tr = demoListView.find('tr#upload-'+ index)
			    ,tds = tr.children();
			    tds.eq(2).html('<span style="color: #FF5722;">上传失败</span>');
			    tds.eq(3).find('.demo-reload').removeClass('layui-hide'); //显示重传
			  }
			});
     });
	
	
</script>
</body>

</html>

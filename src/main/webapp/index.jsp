<%@ page contentType="text/html;charset=UTF-8" language="java" %><html><body><h2>Hello World!</h2>springmvc上传文件<form name="form1" action="/manage/product/upload_file.do" method="post" enctype="multipart/form-data">    <input type="file" name="upload_file">    <input type="submit" value="Spring MVC上传文件"></form>springmvc富文本图片上传文件<form name="form1" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">    <input type="file" name="upload_file">    <input type="submit" value="Spring MVC上传文件"></form></body></html>
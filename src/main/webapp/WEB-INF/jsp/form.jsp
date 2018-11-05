<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/rest/get" method="get">
    <input type="submit" value="get 方式提交">
</form>

<form action="/rest/post" method="post">
    <input type="submit" value="post 方式提交">
</form>

<form action="/rest/put" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="put 方式提交">
</form>

<form action="/rest/delete" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="delete 方式提交">
</form>

</body>
</html>

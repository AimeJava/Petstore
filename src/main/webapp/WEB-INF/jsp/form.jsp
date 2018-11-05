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
<table class="table">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">种类id和名称</th>
        <th scope="col">名称</th>
        <th scope="col">图片url</th>
        <th scope="col">标签id和名称</th>
        <th scope="col">状态</th>
    </tr>
    </thead>
    <tbody id="tbody1">
    <tr scope="col">
        <td><input type='text' path='pId'/></td>
        <td><input type='text' path='cid' />
            <input type='text' path='cname' /></td>
        <td><input type='text' path='pname'/></td>
        <td><input type='text' path='pphotoUrls'/></td>
        <td><input type='text' path='tid' />
            <input type='text' path='tname' /></td>
        <td><input type='text' path='pstatus'/></td>
    </tr>
    </tbody>
</table>
</body>
</html>

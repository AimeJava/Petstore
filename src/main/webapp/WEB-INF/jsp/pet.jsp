<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宠物测试</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>种类id和名称</th>
        <th>名称</th>
        <th>图片url</th>
        <th>标签id和名称</th>
        <th>状态</th>
    </tr>
    </thead>
    <tbody id="tbody1">
    <tr>
        <td><form:input type='text' path='pId'/></td>
        <td><form:input type='text' path='cid' />
            <form:input type='text' path='cname' /></td>
        <td><form:input type='text' path='pname'/></td>
        <td><form:input type='text' path='pphotoUrls'/></td>
        <td><form:input type='text' path='tid' />
            <form:input type='text' path='tname' /></td>
        <td><form:input type='text' path='pstatus'/></td>
    </tr>
    </tbody>
</table>
</body>
</html>

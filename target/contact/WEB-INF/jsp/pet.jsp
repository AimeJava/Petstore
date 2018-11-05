<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<html>
<head>
    <title>宠物测试</title>
    <script >
        $(function () {
            $(".deleteCss").click(function () {
                var action = $(this).attr("href");
                 $("#deleteForm").attr("action", action).submit();

                // <!-- 取消 click 的默认事件 -->
                return false;
            });


        });

    </script>
</head>
<body>
<nav class="navbar navbar-light bg-light">
    <form id="statusForm" class="form-inline" action="/pet/petState" method="get">
        <input name="status" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
    <div style="color: red">
        ${err}
    </div>
</nav>

<table class="table">
    <tr>
        <th scope="col">id</th>
        <th scope="col">种类id</th>
        <th scope="col">名称</th>
        <th scope="col">标签id</th>
        <th scope="col">状态</th>
        <th scope="col">操作</th>
    </tr>
    <c:forEach items="${psPets}" var="p">
        <tr>
            <td> ${p.id} </td>
            <td> ${p.categoryId} </td>
            <td> ${p.name} </td>
            <td> ${p.tagsId} </td>
            <td> ${p.status} </td>
            <td>
                <a class="deleteCss" href="/pet/deleteById/${p.id}" >删除</a></td>

        </tr>
    </c:forEach>
</table>
<form id="deleteForm" action="" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
</form>


</body>
</html>

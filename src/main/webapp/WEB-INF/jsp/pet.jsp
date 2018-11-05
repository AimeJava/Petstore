<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>宠物测试</title>
    <script>
        $(function () {
            $(".deleteCss").click(function () {
                var action = $(this).attr("href");
                $("#deleteForm").attr("action", action).submit();

                //
                <!-- 取消 click 的默认事件 -->
                return false;
            });


        });

    </script>
</head>
<body>
<nav class="navbar navbar-light bg-light">
    <form class="form-inline" action="/pet/findByStatus" method="get">
        <input name="status" class="form-control mr-sm-2" type="search" placeholder="状态" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">状态搜索</button>
        <div style="color: red">
            ${err}
        </div>
    </form>
    <form class="form-inline" action="/pet/" method="get">
        <input name="status" class="form-control mr-sm-2" type="search" placeholder="ID" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">ID搜索</button>
        <div style="color: red">
            ${err}
        </div>
    </form>
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalLong">
        新增
    </button>
</nav>
<!-- Button trigger modal -->

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
                <a class="deleteCss" href="/pet/${p.id}">删除</a></td>

        </tr>
    </c:forEach>
</table>
<form id="deleteForm" action="" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
</form>
<!-- Modal -->
<div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLongTitle">新增宠物</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form method="post" action="" id="addForm">
                <div class="modal-body"><br/>
                    宠物id: <input type='text' name='id'/><br/>
                    种类id: <input type='text' name='categoryId'/><br/>
                    种类名称: <input type='text' name='cname'/><br/>
                    名称: <input type='text' name='name'/><br/>
                    图片url: <input type='file' name='photoUrls'/><br/>
                    标签id: <input type='text' name='tagsId'/><br/>
                    标签名称: <input type='text' name='tName'/><br/>
                    状态: <input type='text' name='status'/>
                </div>
            </form>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                <button id="addPet" type="button" class="btn btn-primary">新增</button>
            </div>
        </div>
    </div>
</div>
<script>
    $(function () {
        $("#addPet").click(function () {
            $("#addForm").attr("action", "/pet/add").submit();
        });
    });

</script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: my
  Date: 2019/1/4
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加产品</title>
</head>
<body>
   <form action="<%=request.getContextPath()%>/items/addItem" method="post">
       name:<input type="text" name="name"><br>
       price:<input type="text" name="price"><br>
       pic:<input type="text" name="pic"><br>
       createtime:<input type="text" name="createtime"><br>
       detail:<input type="text" name="detail"><br>
       <input type="submit" value="添加">
   </form>
</body>
</html>

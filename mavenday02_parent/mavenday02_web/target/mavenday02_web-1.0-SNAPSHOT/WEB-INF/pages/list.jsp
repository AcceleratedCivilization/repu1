
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <table>
      <tr>
          <td><a href="<%=request.getContextPath()%>/items/toAdd">添加信息</a></td>
      </tr>
  </table>
  <table border="1">
      <thead>
         <tr>
             <td>id</td><td>name</td><td>price</td><td>pic</td><td>createTime</td><td>detail</td><td>删除</td>

         </tr>
      </thead>
      <tbody>
         <c:forEach items="${itemsList}" var="items">
             <tr>
                 <td>${items.id}</td>
                 <td>${items.name}</td>
                 <td>${items.price}</td>
                 <td>${items.pic}</td>
                 <td><fmt:formatDate value="${items.createtime}" pattern="yyyy-MM-dd"/> </td>
                 <td>${items.detail}</td>
                 <td><a href="<%=request.getContextPath()%>/items/deleteItem?id=${items.id}">删除</a></td>
             </tr>
         </c:forEach>
      </tbody>
  </table>
</body>
</html>

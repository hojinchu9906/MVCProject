<%--
  Created by IntelliJ IDEA.
  User: sist
  Date: 2016-03-31
  Time: ���� 4:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <table border="1" width="350">
            <tr>
                <th>�̸�</th>
                <th>����</th>
                <th>�ּ�</th>
            </tr>

            <c:forEach var="dto" items="${list}">
                <tr>
                    <td>${dto.name}</td>
                    <td>${dto.gender}</td>
                    <td>${dto.addr}</td>
                </tr>
            </c:forEach>
        </table>
    </center>
</body>
</html>





































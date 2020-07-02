<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.07.2020
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="m"  uri="/WEB-INF/tld/taglib.tld" %>
<html>
<head>
    title>Index</title>
    <meta http-equiv="Content-Type" contentType="text/html;charset=UTF-8">
</head>
<br>
<jsp:useBean id="userbean" class="by.nareiko.tag.bean.JSPSetBean" scope="request"/>
<m:jspset set="${userbean}"/>
</br>
<m:bodyjspset num="${userbean.size}">
    ${userbean.element}
</m:bodyjspset>



</body>
</html>

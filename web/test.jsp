<%@ page import="org.springframework.core.io.Resource" %>
<%@ page import="org.springframework.core.io.ClassPathResource" %>
<%@ page import="org.springframework.beans.factory.BeanFactory" %>
<%@ page import="org.springframework.beans.factory.xml.XmlBeanFactory" %>
<%@ page import="com.test.stbe.Employee" %><%--
  Created by IntelliJ IDEA.
  User: stbe
  Date: 29.06.2018
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Hi </p>
<textarea>3333333</textarea>
<%
    Resource resource = new ClassPathResource("emloy.xml");
    BeanFactory factory = new XmlBeanFactory(resource);
    Employee employee1 = factory.getBean("emp1",Employee.class);7
%>
<p> <%=employee1.getName()%></p>
</body>
</html>

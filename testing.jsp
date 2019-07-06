<%@page import="com.ProjectClassFiles.*"%>

 <%
   String s = (String)(request.getAttribute("test"));
   response.sendRedirect("testing.html?id="+s);

 %>
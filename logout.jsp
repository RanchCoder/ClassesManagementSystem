<%@page import="java.io.*,java.util.*,com.ProjectClassFiles.*"%>

<%
   session.removeAttribute("username");
   session.invalidate();
   response.sendRedirect("login.html");
  
%>
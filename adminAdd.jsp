<%@page import="com.ProjectClassFiles.*"%>

 <%
  int id = Integer.parseInt(request.getParameter("id"));
  String name = request.getParameter("name");
  String userId = request.getParameter("userId");
  String password = request.getParameter("password");
  
  Tution t = new Tution();
  t.setAdminId(id);
  t.setAdminName(name);
  t.setAdminUserId(userId);
  t.setAdminPassword(password);
  String r = TutionWorker.addAdmin(t);

 if(r.equals("success")){
 response.sendRedirect("AddAdmin.jsp");
 }
else{
     response.sendRedirect("Error.html");
    }
 %>

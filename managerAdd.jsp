<%@page import="com.ProjectClassFiles.*"%>

 <%
  int id = Integer.parseInt(request.getParameter("id"));
  String name = request.getParameter("name");
  String userId = request.getParameter("userId");
  String password = request.getParameter("password");
  
  Tution t = new Tution();
  t.setManagerId(id);
  t.setManagerName(name);
  t.setManagerUserId(userId);
  t.setManagerPassword(password);
  String r = TutionWorker.addManager(t);

 if(r.equals("success")){
 response.sendRedirect("AddManager.jsp");
 }
else{
     response.sendRedirect("Error.html");
    }
 %>
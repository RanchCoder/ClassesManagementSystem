<%@page import="com.ProjectClassFiles.*"%>

 <%
  int id = Integer.parseInt(request.getParameter("id"));
  String name = request.getParameter("name");
  int batch_id = Integer.parseInt(request.getParameter("batchId"));
  
  
  Tution t = new Tution();
  t.setTeacherId(id);
  t.setTeacherName(name);
  t.setTeacherBatchId(batch_id);
  
  String r = TutionWorker.addTeacher(t);

 if(r.equals("success")){
 response.sendRedirect("AddTeacher.jsp");
 }
else{
     response.sendRedirect("Error.html");
    }
 %>
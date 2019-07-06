<%@page import="com.ProjectClassFiles.*"%>

 <%
  int id = Integer.parseInt(request.getParameter("id"));
  String name = request.getParameter("name");
  String time = request.getParameter("time");
  String subject = request.getParameter("subject");

  Tution t = new Tution();
  t.setBatchId(id);
  t.setBatchName(name);
  t.setBatchTiming(time);
  t.setBatchSubject(subject);
  String r = TutionWorker.addBatch(t);
 if(r.equals("success")){
 response.sendRedirect("AddBatch.jsp");
 }
else{
     response.sendRedirect("Error.html");
    }
 %>
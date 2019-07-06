<%@page import="com.ProjectClassFiles.*"%>

 <%
  int id = Integer.parseInt(request.getParameter("id"));
  String name = request.getParameter("name");
  int batchId = Integer.parseInt(request.getParameter("Sid"));
  
  
  Tution t = new Tution();
  t.setStudentId(id);
  t.setStudentName(name);
  t.setStudentBatchId(batchId);

  String r = TutionWorker.addStudent(t);

 if(r.equals("success")){
     
    %>
    <html>
        <script>
            alert("successfully Added Student");
            </script>
</html>
<%
 response.sendRedirect("AddStudent1.jsp");
 }
else{
     response.sendRedirect("Error.html");
    }
 %>

<%@page import="com.ProjectClassFiles.*"%>
<%
  int id = Integer.parseInt(request.getParameter("delete"));
   
    String s = TutionWorker.deleteStudent(id);

	 if(s.equals("success")){
	   
	    response.sendRedirect("DeleteStudent1.jsp");
	 }
	 else{
	    response.sendRedirect("Error.html");
	 }
%>
<%@page import="com.ProjectClassFiles.*"%>
<%
  int id = Integer.parseInt(request.getParameter("delete"));
   
    String s = TutionWorker.deleteTeacher(id);

	 if(s.equals("success")){
	   
	    response.sendRedirect("DeleteTeacher1.jsp");
	 }
	 else{
	    response.sendRedirect(s);
	 }
%>
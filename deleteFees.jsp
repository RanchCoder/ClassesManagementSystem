<%@page import="com.ProjectClassFiles.*"%>
<%
  int id = Integer.parseInt(request.getParameter("delete"));
   
    String s = TutionWorker.deleteFees(id);

	 if(s.equals("success")){
	   
	    response.sendRedirect("DeleteFees1.jsp");
	 }
	 else{
	    response.sendRedirect("Error.html");
	 }
%>
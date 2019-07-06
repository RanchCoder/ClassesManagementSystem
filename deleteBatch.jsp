<%@page import="com.ProjectClassFiles.*"%>
<%
  int id = Integer.parseInt(request.getParameter("delete"));
   
    String s = TutionWorker.deleteBatch(id);

	 if(s.equals("success")){
	   
	    response.sendRedirect("DeleteBatch1.jsp");
	 }
	 else{
	    response.sendRedirect("Error.html");
	 }
%>
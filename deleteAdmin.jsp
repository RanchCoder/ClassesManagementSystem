<%@page import="com.ProjectClassFiles.*"%>
<%
  int id = Integer.parseInt(request.getParameter("delete"));
   
    String s = TutionWorker.deleteAdmin(id);

	 if(s.equals("success")){
	   
	    
		

          response.sendRedirect("DeleteAdmin1.jsp");
	 }
	 else{
	    response.sendRedirect("Error.html");
	 }
%>
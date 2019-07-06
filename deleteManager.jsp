<%@page import="com.ProjectClassFiles.*"%>
<%
  int id = Integer.parseInt(request.getParameter("delete"));
   
    String s = TutionWorker.deleteManager(id);

	 if(s.equals("success")){
	   
	    response.sendRedirect("DeleteManager1.jsp");
	 }
	 else{
	    response.sendRedirect(s);
	 }
%>
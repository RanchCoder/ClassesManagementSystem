<%@page import="com.ProjectClassFiles.*"%>

 <%
    int i = Integer.parseInt(request.getParameter("Aid"));
	
	String name = request.getParameter("Aname");
	String userId = request.getParameter("AuserId");

	Tution t = new Tution();
	 t.setAdminId(i);
	 t.setAdminName(name);
	 t.setAdminUserId(userId);
     String s = TutionWorker.updateAdmin(t); 
	 if(s.equals("success")){
	    response.sendRedirect("AdminByIdAdd.jsp");

	 }
	 else{
	     response.sendRedirect("Error.html");
	 }
 %>
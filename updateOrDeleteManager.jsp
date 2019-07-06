<%@page import="com.ProjectClassFiles.*"%>

 <%
    int i = Integer.parseInt(request.getParameter("Mid"));
	
	String name = request.getParameter("Mname");
	String userId = request.getParameter("MuserId");

	Tution t = new Tution();
	 t.setManagerId(i);
	 t.setManagerName(name);
	 t.setManagerUserId(userId);
     String s = TutionWorker.updateManager(t); 
	 if(s.equals("success")){
	    response.sendRedirect("ManagerById1.jsp");


	 }
	 else{
	     response.sendRedirect("Error.html");
	 }
 %>
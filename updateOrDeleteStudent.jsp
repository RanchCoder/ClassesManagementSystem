<%@page import="com.ProjectClassFiles.*"%>

 <%
    int i = Integer.parseInt(request.getParameter("Sid"));
	
	String name = request.getParameter("Sname");
	int batchid = Integer.parseInt(request.getParameter("SbatchId"));

	Tution t = new Tution();
	 t.setStudentId(i);
	 t.setStudentName(name);
	 t.setStudentBatchId(batchid);
     String s = TutionWorker.updateStudent(t); 
	 if(s.equals("success")){
	    response.sendRedirect("StudentById1.jsp");


	 }
	 else{
	     response.sendRedirect("Error.html");
	 }
 %>
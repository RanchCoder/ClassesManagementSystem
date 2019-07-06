<%@page import="com.ProjectClassFiles.*"%>

 <%
    int i = Integer.parseInt(request.getParameter("Tid"));
	
	String name = request.getParameter("Tname");
	int batchid = Integer.parseInt(request.getParameter("TbatchId"));

	Tution t = new Tution();
	 t.setTeacherId(i);
	 t.setTeacherName(name);
	 t.setTeacherBatchId(batchid);
     String s = TutionWorker.updateTeacher(t); 
	 if(s.equals("success")){
	    response.sendRedirect("TeacherById1.jsp");


	 }
	 else{
	     response.sendRedirect("Error.html");
	 }
 %>
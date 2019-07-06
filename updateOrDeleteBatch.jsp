<%@page import="com.ProjectClassFiles.*"%>

 <%
    int i = Integer.parseInt(request.getParameter("Bid"));
	
	String name = request.getParameter("Bname");
	String time = request.getParameter("Btime");
    String subject = request.getParameter("Bsubject");
	Tution t = new Tution();
	 t.setBatchId(i);
	 t.setBatchName(name);
	 t.setBatchTiming(time);
	 t.setBatchSubject(subject);
     String s = TutionWorker.updateBatch(t); 
	 if(s.equals("success")){
	    response.sendRedirect("BatchById1.jsp");


	 }
	 else{
	     response.sendRedirect("Error.html");
	 }
 %>
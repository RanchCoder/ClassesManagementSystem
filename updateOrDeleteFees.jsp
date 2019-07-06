<%@page import="com.ProjectClassFiles.*"%>

 <%
    int i = Integer.parseInt(request.getParameter("Fid"));
	
	float amount = Float.parseFloat(request.getParameter("Famount"));
    float pending = Float.parseFloat(request.getParameter("Fpending"));
    float paid = Float.parseFloat(request.getParameter("Fpaid"));
	Tution t = new Tution();
	 t.setFeesId(i);
	 t.setFeesAmount(amount);
	 t.setFeesAmountPending(pending);
	 t.setFeesAmountPaid(paid);
     String s = TutionWorker.updateFees(t); 
	 if(s.equals("success")){
	    response.sendRedirect("FeesById1.jsp");


	 }
	 else{
	     response.sendRedirect("Error.html");
	 }
 %>
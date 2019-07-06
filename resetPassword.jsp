<%@page import="com.ProjectClassFiles.*"%>
<%
	 
    Tution t = new Tution();
	
    String pass1 = request.getParameter("first");
    String get = request.getParameter("emailId");
    t.setAdminUserId(get);
    t.setAdminPassword(pass1);
    String res = TutionWorker.updatePassword(t);
if(res.equals("success")){
   
response.sendRedirect("AddAdmin.html");									
}
else{response.sendRedirect(get);}

        
%>
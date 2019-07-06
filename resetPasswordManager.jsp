<%@page import="com.ProjectClassFiles.*"%>
<%
	 
    Tution t = new Tution();
	
    String pass1 = request.getParameter("first");
    String get = request.getParameter("emailId");
    t.setManagerUserId(get);
    t.setManagerPassword(pass1);
    String res = TutionWorker.updatePasswordManager(t);
if(res.equals("success")){
   
response.sendRedirect("AddManager.html");									
}
else{response.sendRedirect("Error.html");}

        
%>
<%@page import="com.ProjectClassFiles.*,java.io.*,java.util.*"%>

<%
    
String userName = request.getParameter("username");
String pass = request.getParameter("password");
  String option = request.getParameter("id");

  if(option.equals("admin")){
    Tution t = new Tution();
    t.setAdminUserId(userName);
    t.setAdminPassword(pass);
   
   String result = TutionWorker.checkCredentialsAdmin(t);
  
   if(result.equals("success")){
        
      
      session.setAttribute("username",userName);
        response.sendRedirect("Navbar.jsp");
  
   }
   else{
  
       response.sendRedirect("login.html");
  
   }
  }

else if(option.equals("manager")){
  
  Tution t = new Tution();
  t.setManagerUserId(userName);
  t.setManagerPassword(pass);
 
 String result = TutionWorker.checkCredentialsManager(t);

 if(result.equals("success")){
      
    
    session.setAttribute("username",userName);
      response.sendRedirect("Navbar1.jsp");

 }
 else{

     response.sendRedirect("login.html");

 }


}

else{
  response.sendRedirect("login.html");
}
  
%>
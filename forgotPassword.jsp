<%@page import="com.ProjectClassFiles.*"%>

<%
  String option = request.getParameter("account");
    String email = request.getParameter("emailId");
	if(option.equals("admin")){
            
			
              String result = TutionWorker.forgotPasswordAdmin(email);
	   
	          if(result.equals("success")){
								
							%>
				
							<!doctype html>
							<html lang="en">
							 <head>
									<meta charset="utf-8">
									<meta name="viewport" content="width=device-width, initial-scale=1">
									<link  href="../bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
									<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
									<script src="../bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
									<link rel="stylesheet" type="text/css" href="Styling.css">
								  
								<title>Change Password</title>
							 
									
								 <script>
												function validate() {
									var x = document.forms["myForm"]["first"].value;
								 var y = document.forms["myForm"]["confirm"].value;
									if (x == y) {
											alert("Password Matches");
											return true;
									}
								else{
											 alert("Password do not Match");
										 return false;
								}
							}
							
							
								</script>
							 
							 
							 
							 </head>
							 <body>
								 
									<form name="myForm"  action="resetPassword.jsp" onsubmit="return validate()"  method="post">
										 <p>Resetting your new Password</p>
										 <input type="hidden" name="emailId" value="<%=email%>">
									 <input type="password" class="form-control" name="first" id="first" required placeholder="enter new password"><br/>
									 <input type="password" class="form-control" name="confirm" id="confirm" required placeholder="re enter the same password"> <br/>
									 <input type="submit" value="confirm">
										 </form>
							
							 </body>
							
								
							
							
							<%

							  						
			  }
			  else{
			    response.sendRedirect("Error.html");
				}
				
														
	}


	else if(option.equals("manager")){
            
			
              String result = TutionWorker.forgotPasswordManager(email);
	   
	          if(result.equals("success")){
			    %>
				
				 <!doctype html>
<html lang="en">
 <head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link  href="../bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="../bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="Styling.css">
	  
  <title>Change Password</title>
 
    
	 <script>
          function validate() {
    var x = document.forms["myForm"]["first"].value;
	 var y = document.forms["myForm"]["confirm"].value;
    if (x == y) {
        alert("Password Matches");
        return true;
    }
	else{
	       alert("Password do not Match");
		   return false;
	}
}


  </script>
 
 
 
 </head>
 <body>
   
    <form name="myForm"  action="resetPasswordManager.jsp" onsubmit="return validate()"  method="post">
       <p>Resetting your new Password</p>
	   <input type="hidden" name="emailId" value="<%=email%>">
	
	   <input type="password" name="first" id="first" class="form-control" required placeholder="enter new password"><br/>
	   <input type="password" name="confirm" id="confirm" class="form-control" required placeholder="re enter the same password"> <br/>
	   <input type="submit" value="confirm">
       </form>

 </body>

  
</html>

<%
			    
			  }
			  else{
			    response.sendRedirect("Error.html");
			  }
	}
	else{
	   
	    response.sendRedirect("Error.html");
	
	}
    
%>

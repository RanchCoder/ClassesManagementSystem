<%@page import="com.ProjectClassFiles.*"%>

<html>
<body>
								 
        <form name="myForm"  action="Test.jsp" onsubmit="return validate()"  method="post">
             <p>Resetting your new Password</p>
         <input type="password" name="first" id="first" required placeholder="enter new password"><br/>
         <input type="password" name="confirm" id="confirm" required placeholder="re enter the same password"> <br/>
         <input type="submit" value="confirm">
             </form>

 
 <%
   
String s =  request.getParameter("first");
  response.sendRedirect(s);

 %>
</body>
</html>

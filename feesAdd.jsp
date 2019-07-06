<%@page import="com.ProjectClassFiles.*"%>

 <%
  int id = Integer.parseInt(request.getParameter("id"));
   float amt = Float.parseFloat(request.getParameter("amount"));
   float paid = Float.parseFloat(request.getParameter("paid"));
    float pending = Float.parseFloat(request.getParameter("pending"));
  
  
  Tution t = new Tution();
  t.setFeesId(id);
  t.setFeesAmount(amt);
  t.setFeesAmountPaid(paid);
  t.setFeesAmountPending(pending);

  String r = TutionWorker.addFees(t);

 if(r.equals("success")){
 response.sendRedirect("AddFees.html");
 }
else{
     response.sendRedirect("Error.html");
    }
 %>
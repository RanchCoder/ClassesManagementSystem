<%@page import="java.util.*"%>
<% 
 int i = Integer.parseInt(request.getParameter("number"));
  String s = (String)request.getParameter("opt");
    if(i < 0){
     
       response.sendRedirect("Error.html");

    }
  if(s.equalsIgnoreCase("reverse")){
         int ans = 0;
         int rev = 0;
     
       while(i!=0){
              
         rev = (rev * 10) + (i%10);
         
          i = i/10; 
       }
     
       out.println("reverse is : "+rev);
  }
  else if(s.equalsIgnoreCase("squarert")){

     double result = Math.sqrt(i);
     out.println("square root is : "+result);
  }

  else if(s.equalsIgnoreCase("factorial")){
      
     int fact = 1;

      for(int j=1 ; j<=i ;j++){
            fact = fact * i;
            

      }
       out.println("factorial is :"+fact);
  }

  else if(s.equalsIgnoreCase("sum")){
    int rev = 0;
     int sum = 0;
     while(i!=0){
            
         
    //  rev = (rev * 10) + (i%10);
      sum = sum + i%10;       
      i = i/10; 

  
     }
  out.println(sum);
  }

  else{
  
     response.sendRedirect("Error.html");

  }

  
%>
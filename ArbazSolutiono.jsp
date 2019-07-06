<%@page import="com.ProjectClassFiles.*,java.sql.*,java.io.*,java.util.*"%>

<%
  
    
   
    
   try{
         Class.forName("com.mysql.jdbc.Driver");  
  	   
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classesmanagementsystem","root","root");  
       HashMap<String , ArrayList<String>> hts = new HashMap<String , ArrayList<String>>();
	   
       if(!con.isClosed()){
		   
		   System.out.println("SuccessfullyConnected");
		   
		   
		   String query = "Select * from arbaz";
		   Statement st = con.createStatement();
		   ResultSet rs = st.executeQuery(query);
		   while(rs.next()){
			    ArrayList<String> names = new ArrayList<>();
				String city1 = rs.getString("city");
			    String name = rs.getString("name");
				
				names.add(name);
				
				if(hts.containsKey(city1)){
             
                 hts.get(city1).add(name);
             
             }
             // if not existing then we add the new record to the hashmap
             else{
                 
                 hts.put(city1, names);
             
             
             }
				
		   }
		   
		   System.out.println("CiTY   ::   Values");
         for(Map.Entry m : hts.entrySet()){
         
         
             System.out.print(m.getKey()+ "  " +m.getValue() + "\n");
         
         }
		   
		   
		   
	   }
	   else{
		   
		   response.sendRedirect("Error.html");
		   
	   }
       con.close(); 
	   
}
 catch(Exception e){ e.printStackTrace();}  
   
	

%>


package com.ProjectClassFiles;

 import java.sql.*;
 import java.util.*;
 
  public class TutionWorker {
	  
	   public static String addAdmin(Tution t){
	     
		  String result="";
		   try{
			   String query = "Insert into admin values (?,?,?,?)";
			   PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
			   ps.setInt(1,t.getAdminId());
			   ps.setString(2,t.getAdminName());
		           ps.setString(3,t.getAdminUserId());
                           ps.setString(4,t.getAdminPassword());
               
			   int i = ps.executeUpdate();
			   if(i == 1){
			          result = "success";

			    }
				else{
				      result = "failure";
				}
		      }

			  catch(Exception e){
			                     e.printStackTrace();
								 result = "problem";
			   }
			   return result;
	   
	   }
	   public static String deleteAdmin(int id){
	      
		   String result="";
		   try{
		       String query = "delete from admin where a_id=?";
			   PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
			   ps.setInt(1,id);
			   int i = ps.executeUpdate();
			   if(i == 1){
			      result = "success";
			   }
			   else{
			            result="failure";
			       }
			   
		   }
		   catch(Exception e){e.printStackTrace();}
		   return result;
	   }
	  
	   public static String updateAdmin(Tution t){
		   String result = "";
		    
			 try{
			     String query ="update admin set a_name=?,a_user=? where a_id=?";
				 PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				 ps.setString(1,t.getAdminName());
				 ps.setString(2,t.getAdminUserId());
				
				 ps.setInt(3,t.getAdminId());

				 int i = ps.executeUpdate();
				 if(i == 1){
				             result = "success";
				           }
						   else{
						         result="failure";
						       }
                   

			    }
			 catch(Exception e){
			   
			    e.printStackTrace();


			 }
			 return result;
              
			   
				   
	    }
			
		public static String updatePassword(Tution t){
			String result = "";
			 
			  try{
				  String query ="update admin set a_password=? where a_user=?";
				  PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				  ps.setString(1,t.getAdminPassword());
				  				  ps.setString(2,t.getAdminUserId());
				 
				  
				  int i = ps.executeUpdate();
				  if(i == 1){
							  result = "success";
							}
							else{
								  result="failure";
								}
					
 
				 }
			  catch(Exception e){
				
				 e.printStackTrace();
 
 
			  }
			  return result;
			   
				
					
		 }
 

	   public static Tution getAdminById(int id){
	      
		   Tution t = null;
		   try{
		       String query="Select a_id,a_name,a_user from admin where a_id ="+id;
			   ResultSet rs = DatabaseConnector.getResultSet(query);
			   if(rs.next()){
			    t = new Tution();
				t.setAdminId(rs.getInt("a_id"));
				t.setAdminName(rs.getString("a_name"));
				t.setAdminUserId(rs.getString("a_user"));
				
                  
			   }
		      }
	          catch(Exception e){
			   e.printStackTrace();

			  }
			  return t;
	   }
	   public static ArrayList<Tution> showAllAdmin(){
	      
		   ArrayList<Tution> elist = new ArrayList<>();
		   Tution t = null;
              try{
				   String query = "select a_id,a_name,a_user from admin";
				    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
                          t = new Tution();
						  t.setAdminId(rs.getInt("a_id"));
						  t.setAdminName(rs.getString("a_name"));
						  t.setAdminUserId(rs.getString("a_user"));
						  elist.add(t);
 					}
			     }
			  catch(Exception e){
			    e.printStackTrace();

			  }
			  return elist;
	   }

	     
		 public static ArrayList<Tution> selectIdOfAdmin(){
		    
			 ArrayList<Tution> elist = new ArrayList<>();
		     Tution t = null;
			 try{
			       
				   String query="Select a_id from admin";
                    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
					  t = new Tution();
					  t.setAdminId(rs.getInt("a_id"));
					  elist.add(t);
					}
			 }
			 catch(Exception e){e.printStackTrace();}
			 return elist;
		 }
	         
	  
	     


		    public static String forgotPasswordAdmin(String emailId){
			   
			     String result = "";
                   
				 try{
					  String query ="select a_id from admin where a_user = '"+emailId+"'";
				      
					  ResultSet ps = DatabaseConnector.getResultSet(query);
					  if(ps.next()){
				    result ="success";
					  }
					  else{
					     result="failure";
					  }
				 }
				  catch(Exception e){
					  e.printStackTrace();
				      result = "failure";
					 
				  }
			      return result;   
			}
		    

	   public static String addManager(Tution t){
                 String result="";
				 try{
					 String query ="Insert into manager values(?,?,?,?)";
					 PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
                      ps.setInt(1,t.getManagerId());
					  ps.setString(2,t.getManagerName());
					  ps.setString(3,t.getManagerUserId());
					  ps.setString(4,t.getManagerPassword());

					  int i = ps.executeUpdate();
					  if(i == 1){
					        result = "success";
					  }
					  else{
					      result ="failure";
					  }
                     }
					 catch(Exception e){
					     e.printStackTrace();
						 result="problem";
					 }
					 return result;
               }
	  
           public static String deleteManager(int id){
		      
			    String result="";
		   try{
		       String query = "delete from manager where m_id=?";
			   PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
			   ps.setInt(1,id);
			   int i = ps.executeUpdate();
			   if(i == 1){
			      result = "success";
			   }
			   else{
			            result="failure";
			       }
			   
		   }
		   catch(Exception e){e.printStackTrace();}
		   return result;
		   
		   }
	   public static String updateManager(Tution t){
	    
		    String result = "";
		    
			 try{
			     String query ="update manager set m_name=?,m_userId=? where m_id=?";
				 PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				 ps.setString(1,t.getManagerName());
				 ps.setString(2,t.getManagerUserId());
				
				 ps.setInt(3,t.getManagerId());

				 int i = ps.executeUpdate();
				 if(i == 1){
				             result = "success";
				           }
						   else{
						         result="failure";
						       }
                   

			    }
			 catch(Exception e){
			   
			    e.printStackTrace();


			 }
			 return result;
              
	   }

	   
		public static String updatePasswordManager(Tution t){
			String result = "";
			 
			  try{
				  String query ="update manager set m_password=? where m_userId=?";
				  PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				  ps.setString(1,t.getManagerPassword());
				  				  ps.setString(2,t.getManagerUserId());
				 
				  
				  int i = ps.executeUpdate();
				  if(i == 1){
							  result = "success";
							}
							else{
								  result="failure";
								}
					
       
				 }
			  catch(Exception e){
				
				 e.printStackTrace();
 
 
			  }
			  return result;
			   
				
					
		 }
 
	   
	   public static Tution getManagerById(int id){
                 
						   Tution t = null;
		   try{
		       String query="Select m_id,m_name,m_userId from manager where m_id ="+id;
			   ResultSet rs = DatabaseConnector.getResultSet(query);
			   if(rs.next()){
			    t = new Tution();
				t.setManagerId(rs.getInt("m_id"));
				t.setManagerName(rs.getString("m_name"));
				t.setManagerUserId(rs.getString("m_userId"));
				
                  
			   }
		      }
	          catch(Exception e){
			   e.printStackTrace();

			  }
			  return t;

		   
		   
	   
	   }
	   
	   public static ArrayList<Tution> showAllManager(){
	     
		  ArrayList<Tution> elist = new ArrayList<>();
		   Tution t = null;
              try{
				   String query = "select m_id,m_name,m_userId from manager";
				    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
                          t = new Tution();
						  t.setManagerId(rs.getInt("m_id"));
						  t.setManagerName(rs.getString("m_name"));
						  t.setManagerUserId(rs.getString("m_userId"));
						  elist.add(t);
 					}
			     }
			  catch(Exception e){
			    e.printStackTrace();

			  }
			  return elist;

	   
	   }
          
		  
	    public static ArrayList<Tution> selectIdOfManager(){
		    
			 ArrayList<Tution> elist = new ArrayList<>();
		     Tution t = null;
			 try{
			       
				   String query="Select m_id from manager";
                    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
					  t = new Tution();
					  t.setManagerId(rs.getInt("m_id"));
					  elist.add(t);
					}
			 }
			 catch(Exception e){e.printStackTrace();}
			 return elist;
		 }
	  

	    public static String forgotPasswordManager(String emailId){
			   
			     String result = "";
                   
				 try{
					  String query ="select m_id from manager where m_userId = '"+emailId+"'";
				      
					  ResultSet ps = DatabaseConnector.getResultSet(query);
					  if(ps.next()){
				    result ="success";
					  }
					  else{
					     result="failure";
					  }
				 }
				  catch(Exception e){
					  e.printStackTrace();
				      result = "failure";
					 
				  }
			      return result;   
			}
		   
	   
	   
	   public static String addTeacher(Tution t){
	   
		   String result="";
		   try{
			   String query = "Insert into teacher values (?,?,?)";
			   PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
			   ps.setInt(1,t.getTeacherId());
			   ps.setString(2,t.getTeacherName());
		           ps.setInt(3,t.getTeacherBatchId());
                           
               
			   int i = ps.executeUpdate();
			   if(i == 1){
			          result = "success";

			    }
				else{
				      result = "failure";
				}
		      }

			  catch(Exception e){
			                     e.printStackTrace();
								 result = "problem";
			   }
			   return result;
	   
		   
	   }
	   
	   public static String deleteTeacher(int id){

              String result="";
		   try{
		       String query = "delete from teacher where t_id=?";
			   PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
			   ps.setInt(1,id);
			   int i = ps.executeUpdate();
			   if(i == 1){
			      result = "success";
			   }
			   else{
			            result="failure";
			       }
			   
		   }
		   catch(Exception e){e.printStackTrace();}
		   return result;
	 

	   
	   }
	   
	   public static String updateTeacher(Tution t){
	   
	    String result = "";
		    
			 try{
			     String query ="update teacher set t_name=?,t_batch_id=? where t_id=?";
				 PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				 ps.setString(1,t.getTeacherName());
				 ps.setInt(2,t.getTeacherBatchId());
				 //ps.setString(3,t.getBatchSubject());
				 ps.setInt(3,t.getTeacherId());

				 int i = ps.executeUpdate();
				 if(i == 1){
				             result = "success";
				           }
						   else{
						         result="failure";
						       }
                   

			    }
			 catch(Exception e){
			   
			    e.printStackTrace();


			 }
			 return result;
        
	   
	   }
	   
	   public static Tution getTeacherById(int id){

		      Tution t = null;
		   try{
		       String query="Select t_id,t_name,t_batch_id from teacher where t_id="+id;
			   ResultSet rs = DatabaseConnector.getResultSet(query);
			   if(rs.next()){
			    t = new Tution();
				t.setTeacherId(rs.getInt("t_id"));
				t.setTeacherName(rs.getString("t_name"));
				t.setTeacherBatchId(rs.getInt("t_batch_id"));
				
				
                  
			   }
		      }
	          catch(Exception e){
			   e.printStackTrace();

			  }
			  return t;
	       
		      
	   }
	   
	   public static ArrayList<Tution> showAllTeacher(){
	     
		   ArrayList<Tution> elist = new ArrayList<>();
		   Tution t = null;
              try{
				   String query = "select t_id,t_name,t_batch_id from teacher";
				    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
                          t = new Tution();
						  t.setTeacherId(rs.getInt("t_id"));
						  t.setTeacherName(rs.getString("t_name"));
						  t.setTeacherBatchId(rs.getInt("t_batch_id"));
						 
						  elist.add(t);
 					}
			     }
			  catch(Exception e){
			    e.printStackTrace();

			  }
			  return elist;
		
	 
	   }

	    public static ArrayList<Tution> selectIdOfTeacher(){
		    
			 ArrayList<Tution> elist = new ArrayList<>();
		     Tution t = null;
			 try{
			       
				   String query="Select t_id from teacher";
                    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
					  t = new Tution();
					  t.setTeacherId(rs.getInt("t_id"));
					  elist.add(t);
					}
			 }
			 catch(Exception e){e.printStackTrace();}
			 return elist;
		 }
	  
	  
	   
	   public static String addStudent(Tution t){
	       
			String result="";
		  try{    
			    String query = "Insert into student values(?,?,?)";
		         PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				 ps.setInt(1,t.getStudentId());
				 ps.setString(2,t.getStudentName());
				 ps.setInt(3,t.getStudentBatchId());
				 

				 int i = ps.executeUpdate();
				 if(i == 1){result ="success";}
				 else{result="failure";}
		    }
		  catch(Exception e){
			                  e.printStackTrace();
                               result = "problem";
                            }
	       return result;
		  
	   }
	   public static String deleteStudent(int id){
	   
	    String result="";
		   try{
		       String query = "delete from student where s_id=?";
			   PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
			   ps.setInt(1,id);
			   int i = ps.executeUpdate();
			   if(i == 1){
			      result = "success";
			   }
			   else{
			            result="failure";
			       }
			   
		   }
		   catch(Exception e){e.printStackTrace();}
		   return result;

	   
	   }
	   public static String updateStudent(Tution t){
	        
			 String result = "";
		    
			 try{
			     String query ="update student set s_name=?,s_batch_id=? where s_id=?";
				 PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				 ps.setString(1,t.getStudentName());
				 ps.setInt(2,t.getStudentBatchId());
				 //ps.setString(3,t.getBatchSubject());
				 ps.setInt(3,t.getStudentId());

				 int i = ps.executeUpdate();
				 if(i == 1){
				             result = "success";
				           }
						   else{
						         result="failure";
						       }
                   

			    }
			 catch(Exception e){
			   
			    e.printStackTrace();


			 }
			 return result;
        
	   
	     
	   
	   
	   }
	   public static Tution getStudentById(int id){

		   Tution t = null;
		   try{
		       String query="Select s_id,s_name,s_batch_id from student where s_id="+id;
			   ResultSet rs = DatabaseConnector.getResultSet(query);
			   if(rs.next()){
			    t = new Tution();
				t.setStudentId(rs.getInt("s_id"));
				t.setStudentName(rs.getString("s_name"));
				t.setStudentBatchId(rs.getInt("s_batch_id"));
				
				
                  
			   }
		      }
	          catch(Exception e){
			   e.printStackTrace();

			  }
			  return t;
	       
		      
	   
	   
	   
	   }
	  
	   public static ArrayList<Tution> showAllStudent(){
	     
		   ArrayList<Tution> elist = new ArrayList<>();
		   Tution t = null;
              try{
				   String query = "select * from student";
				    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
                          t = new Tution();
						  t.setStudentId(rs.getInt("s_id"));
						  t.setStudentName(rs.getString("s_name"));
						  t.setStudentBatchId(rs.getInt("s_batch_id"));
						  //t.setFeesAmountPaid(rs.getFloat("f_paid"));
						  elist.add(t);
 					}
			     }
			  catch(Exception e){
			    e.printStackTrace();

			  }
			  return elist;
		
	   
	   }
        

		
	    public static ArrayList<Tution> selectIdOfStudent(){
		    
			 ArrayList<Tution> elist = new ArrayList<>();
		     Tution t = null;
			 try{
			       
				   String query="Select s_id from student";
                    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
					  t = new Tution();
					  t.setStudentId(rs.getInt("s_id"));
					  elist.add(t);
					}
			 }
			 catch(Exception e){e.printStackTrace();}
			 return elist;
		 }

	   
	   
	   
	   public static String addBatch(Tution t){
	   
	      String result="";
		  try{    
			    String query = "Insert into batch values(?,?,?,?)";
		         PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				 ps.setInt(1,t.getBatchId());
				 ps.setString(2,t.getBatchName());
				 ps.setString(3,t.getBatchTiming());
				 ps.setString(4,t.getBatchSubject());

				 int i = ps.executeUpdate();
				 if(i == 1){result ="success";}
				 else{result="failure";}
		    }
		  catch(Exception e){
			                  e.printStackTrace();
                               result = "problem";
                            }
	       return result;   
	   }
	   
	   public static String deleteBatch(int id){

		    String result="";
		   try{
		       String query = "delete from batch where b_id=?";
			   PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
			   ps.setInt(1,id);
			   int i = ps.executeUpdate();
			   if(i == 1){
			      result = "success";
			   }
			   else{
			            result="failure";
			       }
			   
		   }
		   catch(Exception e){e.printStackTrace();}
		   return result;
	     
	   
	   }
	   
	   public static String updateBatch(Tution t){
	   
	    String result = "";
		    
			 try{
			     String query ="update batch set b_name=?,b_time=?,b_subject=? where b_id=?";
				 PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				 ps.setString(1,t.getBatchName());
				 ps.setString(2,t.getBatchTiming());
				ps.setString(3,t.getBatchSubject());
				 ps.setInt(4,t.getBatchId());

				 int i = ps.executeUpdate();
				 if(i == 1){
				             result = "success";
				           }
						   else{
						         result="failure";
						       }
                   

			    }
			 catch(Exception e){
			   
			    e.printStackTrace();


			 }
			 return result;
               
	   }
	   

	   public static Tution getBatchById(int id){
	                
						   Tution t = null;
		   try{
		       String query="Select b_id,b_name,b_time,b_subject from batch where b_id="+id;
			   ResultSet rs = DatabaseConnector.getResultSet(query);
			   if(rs.next()){
			    t = new Tution();
				t.setBatchId(rs.getInt("b_id"));
				t.setBatchName(rs.getString("b_name"));
				t.setBatchTiming(rs.getString("b_time"));
				t.setBatchSubject(rs.getString("b_subject"));
				
                  
			   }
		      }
	          catch(Exception e){
			   e.printStackTrace();

			  }
			  return t;
	   }

	    public static ArrayList<Tution> showAllBatch(){
                
				   ArrayList<Tution> elist = new ArrayList<>();
		   Tution t = null;
              try{
				   String query = "select b_id,b_name,b_time,b_subject from batch";
				    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
                          t = new Tution();
						  t.setBatchId(rs.getInt("b_id"));
						  t.setBatchName(rs.getString("b_name"));
						  t.setBatchTiming(rs.getString("b_time"));
						  t.setBatchSubject(rs.getString("b_subject"));
						  elist.add(t);
 					}
			     }
			  catch(Exception e){
			    e.printStackTrace();

			  }
			  return elist;
		
	 
		
		}
	 

            public static ArrayList<Tution> selectIdOfBatch(){
		    
			 ArrayList<Tution> elist = new ArrayList<>();
		     Tution t = null;
			 try{
			       
				   String query="Select b_id from batch";
                    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
					  t = new Tution();
					  t.setBatchId(rs.getInt("b_id"));
					  elist.add(t);
					}
			 }
			 catch(Exception e){e.printStackTrace();}
			 return elist;
		 }
	  
	    
	  

	   public static String addFees(Tution t){

		   	String result="";
		  try{    
			    String query = "Insert into fees values(?,?,?,?)";
		         PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				 ps.setInt(1,t.getFeesId());
				 ps.setFloat(2,t.getFeesAmount());
				 ps.setFloat(3,t.getFeesAmountPending());
				 ps.setFloat(4,t.getFeesAmountPaid());
				 

				 int i = ps.executeUpdate();
				 if(i == 1){result ="success";}
				 else{result="failure";}
		    }
		  catch(Exception e){
			                  e.printStackTrace();
                               result = "problem";
                            }
	       return result;
		  
	   
	   }
	   
	   public static String deleteFees(int id){
	     
		   String result="";
		   try{
		       String query = "delete from fees where f_id=?";
			   PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
			   ps.setInt(1,id);
			   int i = ps.executeUpdate();
			   if(i == 1){
			      result = "success";
			   }
			   else{
			            result="failure";
			       }
			   
		   }
		   catch(Exception e){e.printStackTrace();}
		   return result;
		  
	   
	   }
	   public static String updateFees(Tution t){
	      
		   String result = "";
		    
			 try{
			     String query ="update fees set f_amount=?,f_pending=?,f_paid=? where f_id=?";
				 PreparedStatement ps = DatabaseConnector.getPreparedStatement(query);
				 ps.setFloat(1,t.getFeesAmount());
				 ps.setFloat(2,t.getFeesAmountPending());
				 ps.setFloat(3,t.getFeesAmountPaid());
				 ps.setInt(4,t.getFeesId());

				 int i = ps.executeUpdate();
				 if(i == 1){
				             result = "success";
				           }
						   else{
						         result="failure";
						       }
                   

			    }
			 catch(Exception e){
			   
			    e.printStackTrace();


			 }
			 return result;
        
	   
	   
	   }
	   public static Tution getFeesById(int id){
	       
	        Tution t = null;
		   try{
		       String query="Select f_id,f_amount,f_pending,f_paid from fees where f_id="+id;
			   ResultSet rs = DatabaseConnector.getResultSet(query);
			   if(rs.next()){
			    t = new Tution();
				t.setFeesId(rs.getInt("f_id"));
				t.setFeesAmount(rs.getFloat("f_amount"));
				t.setFeesAmountPending(rs.getFloat("f_pending"));
				t.setFeesAmountPaid(rs.getFloat("f_paid"));
				
                  
			   }
		      }
	          catch(Exception e){
			   e.printStackTrace();

			  }
			  return t;
	   
	   }
	   public static ArrayList<Tution> showAllFees(){
	     
		    ArrayList<Tution> elist = new ArrayList<>();
		   Tution t = null;
              try{
				   String query = "select * from fees";
				    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
                          t = new Tution();
						  t.setFeesId(rs.getInt("f_id"));
						  t.setFeesAmount(rs.getFloat("f_amount"));
						  t.setFeesAmountPending(rs.getFloat("f_pending"));
						  t.setFeesAmountPaid(rs.getFloat("f_paid"));
						  elist.add(t);
 					}
			     }
			  catch(Exception e){
			    e.printStackTrace();

			  }
			  return elist;
		
	   
	   }


	    public static ArrayList<Tution> selectIdOfFees(){
		    
			 ArrayList<Tution> elist = new ArrayList<>();
		     Tution t = null;
			 try{
			       
				   String query="Select f_id from fees";
                    ResultSet rs = DatabaseConnector.getResultSet(query);
					while(rs.next()){
					  t = new Tution();
					  t.setFeesId(rs.getInt("f_id"));
					  elist.add(t);
					}
			 }
			 catch(Exception e){e.printStackTrace();}
			 return elist;
		 }
	 
		 public static ArrayList<Tution> feesNotUpdated(){
			 
			ArrayList<Tution> elist = new ArrayList<>();
			Tution t = null;
			try{

				String query ="select student.s_id,student.s_name from  student left join fees ON fees.f_id = s_id where f_id IS NULL";

				ResultSet rs = DatabaseConnector.getResultSet(query);
				while(rs.next()){
					 
					t = new Tution(); 
					t.setStudentId(rs.getInt("s_id"));
					t.setStudentName(rs.getString("s_name"));
					elist.add(t);
				}
			}
			catch(Exception e){e.printStackTrace();}
			
			return elist;
		 }

		 
		 public static ArrayList<Tution> feesPending(){
			 
			ArrayList<Tution> elist = new ArrayList<>();
			Tution t = null;
			try{

				String query ="select student.s_id,student.s_name,fees.f_amount,fees.f_pending from  student inner join fees ON fees.f_id = s_id";

				ResultSet rs = DatabaseConnector.getResultSet(query);
				while(rs.next()){
					 
					t = new Tution(); 
					t.setStudentId(rs.getInt("s_id"));
					t.setStudentName(rs.getString("s_name"));
					t.setFeesAmount(rs.getFloat("f_amount"));
					t.setFeesAmountPending(rs.getFloat("f_pending"));
					elist.add(t);
				}
			}
			catch(Exception e){e.printStackTrace();}
			
			return elist;
		 }
					
		 public static String checkCredentialsAdmin(Tution t){

			String result="";
			try{
				String query="select * from admin where a_user='"+t.getAdminUserId()+"' and a_password='"+t.getAdminPassword()+"'";
				ResultSet rs = DatabaseConnector.getResultSet(query);

				while(rs.next()){
					
					result = "success";

				}

			}
			catch(Exception e){
				 e.printStackTrace();
				 result="failure";
			}
			return result;
		 }
			
		  
		 public static String checkCredentialsManager(Tution t){

			String result="";
			try{
				String query="select * from manager where m_userId='"+t.getManagerUserId()+"' and m_password='"+t.getManagerPassword()+"'";
				ResultSet rs = DatabaseConnector.getResultSet(query);

				while(rs.next()){
					
					result = "success";

				}

			}
			catch(Exception e){
				 e.printStackTrace();
				 result="failure";
			}
			return result;
		 }


		}
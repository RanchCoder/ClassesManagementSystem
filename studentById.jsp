<%@page import="com.ProjectClassFiles.*,java.io.*,java.util.*"%>

<%
response.setHeader("Cache-control","no-cache, no-store, must-revalidate");
    if(session.getAttribute("username")==null){
        
      

          response.sendRedirect("login.html");
          
    }


   int identity = Integer.parseInt(request.getParameter("id"));
   
    
	Tution t = new Tution();
	 t = TutionWorker.getStudentById(identity);
  %>
  <html>
      
	  	  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <link rel="stylesheet" type="text/css" href="Styling.css">
 



 <style> 
	h2 {
			width: 100px;
			height: 50px;
			background-color :antiquewhite;
			font-weight: bold;
			position: relative;
			-webkit-animation: mymove 5s infinite; /* Safari 4.0 - 8.0 */
			animation: mymove 5s infinite;
	}
	
	/* Safari 4.0 - 8.0 */
	#h2 {-webkit-animation-timing-function: linear;}
	
	/* Standard syntax */
	#h2 {animation-timing-function: linear;}
	
	/* Safari 4.0 - 8.0 */
	@-webkit-keyframes mymove {
			from {left: 0px;}
			to {left: 300px;}
	}
	
	/* Standard syntax */
	@keyframes mymove {
			from {left: 0px;}
			to {left: 300px;}
	}
	</style>		


</head>

   
   <body onload="getData()">

  



		<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
					<a class="navbar-brand" href="Navbar.jsp">Singh's Institute</a>
					</div>
					<ul class="nav navbar-nav navbar-left">
					 
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="Navbar.jsp">Admin
						<span class="caret"></span></a>
						<ul class="dropdown-menu">
						<li><a href="AddAdmin.jsp">Add Admin</a></li>
						<li><a href="deleteAdmin1.jsp">Delete Admin</a></li>
						<li><a href="AdminByIdAdd.jsp">Update Admin</a></li>
						<li><a href="ShowAllAdmin.jsp">Show All Admin</a></li>
						<li><a href="AdminByIdAdd.jsp">Admin By Id</a></li>
						</ul>
					</li>    
				
						
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="Navbar.jsp">Manager
						<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="AddManager.jsp">Add Manager</a></li>
							<li><a href="DeleteManager1.jsp">Delete Manager</a></li>
							<li><a href="ManagerById1.jsp">Update Manager</a></li>
							<li><a href="ShowAllManager.jsp">Show All Manager</a></li>
							<li><a href="ManagerById1.jsp">Manager By Id</a></li>
						</ul>
					</li>    
				
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="Navbar.jsp">Batch
						<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="AddBatch.jsp">Add Batch</a></li>
							<li><a href="DeleteBatch1.jsp">Delete Batch</a></li>
							<li><a href="BatchById1.jsp">Update Batch</a></li>
							<li><a href="ShowAllBatch.jsp">Show All Batch</a></li>
							<li><a href="BatchById1.jsp">Batch By Id</a></li>
						</ul>
					</li>    
					
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="Navbar.jsp">Teacher
						<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="AddTeacher.jsp">Add Teacher</a></li>
							<li><a href="DeleteTeacher1.jsp">Delete Teacher</a></li>
							<li><a href="TeacherById1.jsp">Update Teacher</a></li>
							<li><a href="ShowAllTeacher.jsp">Show All Teachers</a></li>
							<li><a href="TeacherById1.jsp">Teacher By Id</a></li>
						</ul>
					</li>    
					
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="Navbar.jsp">Student
						<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="AddStudent1.jsp">Add Student</a></li>
							<li><a href="DeleteStudent1.jsp">Delete Student</a></li>
							<li><a href="StudentById1.jsp">Update Student</a></li>
							<li><a href="ShowAllStudent.jsp">Show All Student</a></li>
							<li><a href="StudentById1.jsp">Student By Id</a></li>
						</ul>
				
					</li>    
					 
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="Navbar.jsp">Fees
						<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="AddFees1.jsp">Add Fees</a></li>
							<li><a href="DeleteFees1.jsp">Delete Fees</a></li>
							<li><a href="FeesById1.jsp">Update Fees</a></li>
							<li><a href="ShowAllFees.jsp">Show All Fees</a></li>
							<li><a href="FeesById1.jsp">Fees By Id</a></li>
													<li><a href="feesNotUpdated.jsp">Fees Not Updated</a></li>
													<li><a href="feesPending.jsp">Fees Pending</a></li>
			
													
													<li class="divider"></li>
												</ul>
										</li>
										   
										
										<li>
											<a href="Print.html">Print Certificate</a>
									   </li>
			
			
										<li>
											 <a href="logout.jsp">logout</a>
										</li>
					  
			
					</ul>
				</div>
				</nav>			  
		 <h2>WELCOME...</h2>		
		
	   
	   	

        
	  <div class="row">
          
		  <div class="col-sm-6">
          
		         <div class="container">

             <h1>Student BY ID</h1> <br /><br />

    
       <form method="post" action="updateOrDeleteStudent.jsp">
	    <div class="form-group">
		   <label for="IDE"> Id</label>
		   <input type="text" name="Sid" id="IDE" class="form-control" required> 
           </div>
		   
		   <div class="form-group">
			<label  for="name"> Name</label>
			<input type="text" name="Sname" id="name" class="form-control" required>
            </div>

			 <div class="form-group">
			<label  for="batchId">Batch ID</label>
            <input type="text" name="SbatchId" id="userId" class="form-control" required>
             </div>
           <input type="submit" value="update" name="action"> &nbsp;&nbsp;&nbsp;<input type="submit" value="update" name="action">
	   </form>
        
		  </div>

  
     </div>
    <div class="col-sm-3"></div> 
    </div>
   
	    
      <script>
	  function getData(){
	         document.getElementById("name").value="<%= t.getStudentName()%>";
			 document.getElementById("IDE").value="<%= t.getStudentId()%>";
			 document.getElementById("userId").value="<%= t.getStudentBatchId()%>";
              
			    }
       </script>
    </body>
</html>
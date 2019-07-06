
<%@page import="com.ProjectClassFiles.*"%>
<%
       String a  = request.getParameter("Name");
       String b = request.getParameter("course");
%>


<html>
        
    <head>
	      
        <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../bootstrap-3.3.7/dist/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="../bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="Styling.css">

<style>

     
        body  {
            background-image: url("images/1.jpg");
            background-color: #cccccc;
        }
        </style>
        
      
   </head>


     <body onload="infeed()">
                 
        <div class="row">
            <div class="col-sm-1"><img src="58593.png" style="width:130%" class="img-rounded" alt="Cinque Terre">
            </div>
            <div class="col-sm-6"><h1><font color="blue">Singh's Institute</font></h1>
               
            </div>
                      
            <div class="col-sm-4"></div>
          </div>
          
        <div class="row">
            <div class="col-sm-4">
            </div>
            <div class="col-sm-6">
                
                <h1>This is to certify that</h1>
                    <h1 id="rules" style="color:red"></font></h1>
                    <p>--------------------------------------------------------------------------------------</p>  
                    <h1>has successfully completed our training course in</h1>
                    <h1 id="rules1" style="color:red"></font></h1>
                    <p>--------------------------------------------------------------------------------------</p> 
                   <h1 id="date" > Issued On:-                </h1>
                  <br/>
                  
                     
                  <img src="images/ab2.jpg" style="width:40%" class="img-rounded" alt="Cinque Terre">                 
                  <br/>
                  <p>--------------------------------------------------------------------------------------</p>
                   <h3 ><font color="red">Mr. Riyaz Khan</font></h3>
                   <h3>Founder And Ceo</h3>
                   <h3>Asterix Solution</h3>           
                          <a href="images/certificatePage.rtf" title="Print Certificate" onclick="window.print();" target="_blank">Print Certificate</a> 
            </div>
                      
            <div class="col-sm-2">
                     
       

            </div>
          </div>
                  
        
          <div class="row">
          <div class="col-sm-4"><p><font size="5px" color="red">www.SinghsInstitute.com</p> </div>
          <div class="col-sm-4"> </div>
          <div class="col-sm-4"> </div>
          </div>
         
    </body>

     <script>
            
             function infeed(){
                         document.getElementById("rules").innerHTML ="<%=a%>";
                         document.getElementById("rules1").innerHTML ="<%=b%>";

             }

         </script>

</html>
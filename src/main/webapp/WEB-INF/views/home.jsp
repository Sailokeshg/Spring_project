<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>Hello Spring MVC</title>
      <%@include file="./base.jsp"%>
      <style>
      #combined {
        margin: auto;
        width: 60%;
        padding: 10px;
      }
      .wrapper {
          text-align: center;
      }
      </style>
      <style>
      body {
                background-image: url('https://image.freepik.com/free-vector/recruit-agent-analyzing-candidates_74855-4565.jpg');
                background-repeat:no-repeat;
                background-size: cover;
      </style>
   </head>
   
   <body>
      <h2>${message}</h2>
     <h2 style="color:blue;text-align:center;"> Welcome Admin , start managing your employee data</h2>
      <br><br>
      <div class="container mt-3 wrapper" id="combined" >

      <a href="employeeReport" class="btn btn-success">  Employee </a> &nbsp;
      <a href="studentReport" class="btn btn-success">  Student </a>
      
      </div>
   </body>
</html>
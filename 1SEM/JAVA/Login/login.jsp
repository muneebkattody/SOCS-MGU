<%   
     String username = request.getParameter("uname");
     String pass = request.getParameter("pass");
     
     if(username.equals("akshay") && pass.equals("123"))
     {
         
         out.println("Login Success");
     }
     else
     {
           out.println("Login Fail");
     }
%>
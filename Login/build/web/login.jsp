<%-- 
    Document   : login
    Created on : 13 Jul, 2017, 7:12:09 PM
    Author     : root
--%>

<%@page import="dao.UserDao,dto.UserBean;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
         String uid = request.getParameter("txtMAIL");
         String pass = request.getParameter("txtPASS");
         %>
         
         <jsp:useBean id="user" class="dto.UserBean">
         </jsp:useBean> 
         
<jsp:setProperty name="user" property="user_Mail" value="<%=uid%>"/>
<jsp:setProperty name="user" property="user_Pass" value="<%=pass%>"/>
        
         
         <%
                UserDao obj = new UserDao();
                boolean b = obj.isUserValid(user);
                
                 if(b) { %>
                 <jsp:forward page="indexc.html"/>
                 <% }
                    else{
                   %>
                   <font color="red"> <b>User_Id or Password didn't match</b> </font>
                   <jsp:include page="indexl.html"/>
                   <%
                    }
                    %>
    </body>
</html>

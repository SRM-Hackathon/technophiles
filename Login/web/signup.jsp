<%-- 
    Document   : login
    Created on : 13 Jul, 2017, 7:12:09 PM
    Author     : root
--%>

<%@page import="dao.SignDao,dto.SignBean;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
         String ufname = request.getParameter("txtFNAME");
         String ulname = request.getParameter("txtLNAME");
         String uid = request.getParameter("txtMAIL");
         String upass = request.getParameter("txtPASS");
         %>
         
         <jsp:useBean id="sign" class="dto.SignBean">
         </jsp:useBean> 
         
<jsp:setProperty name="sign" property="user_FNAME" value="<%=ufname%>"/>
<jsp:setProperty name="sign" property="user_LNAME" value="<%=ulname%>"/>
<jsp:setProperty name="sign" property="user_Mail" value="<%=uid%>"/>
<jsp:setProperty name="sign" property="user_Pass" value="<%=upass%>"/>
        
         
         <%
                SignDao obj = new SignDao();
                int b = obj.createUser(sign);
                
                 if(b>0) { %>
                 <jsp:forward page="indexc.html"/>
                 <% }
                    else{
                   %>
                   <font color="red"> <b>Email id already exists</b> </font>
                   <jsp:include page="index.html"/>
                   <%
                    }
                    %>
    </body>
</html>

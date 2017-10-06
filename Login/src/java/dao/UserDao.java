package dao;

import dto.UserBean;
import java.sql.*;

public class UserDao {
 Connection con;
 boolean b; 

 public boolean isUserValid(UserBean u)
 {
    String q = "select * from hello where user_Mail='"
            +u.getuser_Mail()+"' and user_Pass='"
            +u.getuser_Pass()+"'";
    try{
     Class.forName("com.mysql.jdbc.Driver");
     
     Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/GreenPeace","root","");
     
    PreparedStatement pst = con.prepareStatement(q);
    
    ResultSet rs = pst.executeQuery();
    
    if(rs.isBeforeFirst())
    { 
       b = true;
    }
    else
    {
      b = false;
    }
 }
 catch(Exception e)
 {
  e.printStackTrace();
 }
    return b;
 }
 
}


/*
 public Connection getConnection()
 {
     try
     {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/logindb","root","root");
     }
     catch(Exception e)
     {
       e.printStackTrace();
     }
     
     return con;
 }
 */
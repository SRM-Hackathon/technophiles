package dao;
import java.sql.*;
import dto.SignBean;
import java.sql.*;

public class SignDao {
 Connection con;
 boolean b; 

 public int createUser(SignBean u)
 {
/*    String q = "select * from entry where user_Mail='"
            +u.getuser_Mail()+"' and user_Pass='"
            +u.getuser_Pass()+"'";
    try{
     Class.forName("com.mysql.jdbc.Driver");
     
     Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/loginweb","root"," ");
     
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
 */
             String pfn= u.getuser_FNAME();
             String pln= u.getuser_LNAME();
             String pmi= u.getuser_Mail();
             String ps= u.getuser_Pass();

   int count=0;  
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GreenPeace","root","");

       /*Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery("Select * from Product");*/
            //this query is to execute or select all the records form db;
            
              
            PreparedStatement pstm = con.prepareStatement("insert into hello values(?,?,?,?)");
   //this query is to select particular id from db;
      pstm.setString(1,pfn);
      pstm.setString(2,pln);
      pstm.setString(3,pmi);
      pstm.setString(4,ps);
      
   count=pstm.executeUpdate();
   
   con.close();
  }
        catch(Exception e)
        {
            e.printStackTrace();
        }
  return count;
    }
    
}















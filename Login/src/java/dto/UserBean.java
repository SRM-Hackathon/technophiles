package dto;

import java.io.Serializable;

public class UserBean implements Serializable{
 
 private String user_Mail;
 private String user_Pass;

 public UserBean() {
 }

 public String getuser_Mail() {
  return user_Mail;
 }

 public void setuser_Mail(String user_Mail) {
  this.user_Mail = user_Mail;
 }

 public String getuser_Pass() {
  return user_Pass;
 }

 public void setuser_Pass(String user_Pass) {
  this.user_Pass = user_Pass;
 }

 
}

package dto;

import java.io.Serializable;

public class SignBean implements Serializable{
 
 private String user_Mail;
 private String user_Pass;
 private String user_FNAME;
 private String user_LNAME;


 public SignBean() {
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
 public String getuser_FNAME() {
  return user_FNAME;
 }

 public void setuser_FNAME(String user_FNAME) {
  this.user_FNAME = user_FNAME;
 }
 public String getuser_LNAME() {
  return user_LNAME;
 }

 public void setuser_LNAME(String user_LNAME) {
  this.user_LNAME = user_LNAME;
 }

 
}

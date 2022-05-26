<%-- 
    Document   : userreg
    Created on : Mar 1, 2022, 12:10:33 AM
    Author     : raksh
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
       String username= request.getParameter("username");
        String pass = request.getParameter("pass");
        String email = request.getParameter("email");


try
{
         Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "Abitarak@123");
           Statement st=conn.createStatement();
           int i=st.executeUpdate("insert into user(uname,pass,email)values('"+username+"','"+pass+"','"+email+"')");
        out.println("user added successfully!!");
        }
        catch(Exception e)
        {
        System.out.print(e);
        e.printStackTrace();
        }
 %>
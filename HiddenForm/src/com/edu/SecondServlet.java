package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {  
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException { 
        
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        //Getting the value from the hidden field  
        String n=request.getParameter("uname");  
        out.print("Hello "+n);  
  
        out.close();  
                }


    }  

package com.telusko;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        Cookie[] cookie=req.getCookies();
        int k=0;
        for(Cookie c:cookie) {
        	if(c.getName().equals("k")) {
        		k=Integer.parseInt(c.getValue());
        	}
        }
//		HttpSession ses=req.getSession();
//		int k=(int)ses.getAttribute("k");
		res.getWriter().println(k*k);
	}
}

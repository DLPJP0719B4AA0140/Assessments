

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("loginId");  
	    String p=request.getParameter("password");  
	          
	    if(LoginDAO.validate(n, p)){ 
	        RequestDispatcher rd=request.getRequestDispatcher("MainPage");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Invalidate Credentials");  
	        RequestDispatcher rd=request.getRequestDispatcher("FirstPage.html");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();  
	}  
}



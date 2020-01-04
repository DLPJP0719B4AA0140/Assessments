

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MainPage")
public class MainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();
	    out.print("<center><h1>Welcome to Ecommerce</h1></center>");
	    out.print("<br>");
	    out.print("<a href='SearchForm.html'>Search Form</a>&nbsp;");
	    out.print("<a href='ProductList.html'>Product List</a>");
	    
	}

}



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductList")
public class ProductList extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	Connection con;
	PreparedStatement pre;
	
	public ProductList(){
		try
    	{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
		}
    	catch(Exception e)
    	{
    		e.printStackTrace();    		
    	}
        
    }
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    ResultSet rs = null;
	    try {
			PreparedStatement ps=con.prepareStatement("select * from products");
			
			rs=ps.executeQuery();
			out.println("<table border=3><tr><th>Product id</th><th>Product Name</th><th>Price</th><th>Category</th></tr>");
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getString("id")+"</td>");
				out.println("<td>"+rs.getString("name")+"</td>");
				out.println("<td>"+rs.getString("price")+"</td>");
				out.println("<td>"+rs.getString("category")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

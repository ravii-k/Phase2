package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class retrive
 */
public class RetrieveData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RetrieveData() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw=response.getWriter();
		 ProductClass pb=new ProductClass();
		 pb.setId(Integer.parseInt(request.getParameter("id")));
  		 pw.println("<html><body>");  
  		 response.setContentType("text/html");
  		
 
       		try {
       			Connection con =Setconnection.dbConn();
       		 String sql="select * from products where id=(?)";
    		 PreparedStatement ps=con.prepareStatement(sql);
    		 ps.setInt(1,pb.getId());
    		 ResultSet rs=ps.executeQuery();
    		 RequestDispatcher rd=request.getRequestDispatcher("index.html");
    		 rd.include(request, response);
       		// pw.print("<br><center><h3>Pr</h3><br></center>");
      		
       		 pw.println("<center><table border=1 width=14% height=10%>");  
             pw.println("<tr><th>Product Id</th><th>Product Name</th><th>Price</th>"); 
       		 while(rs.next()) {
       			
       			 //pw.println(rs.getInt(1)+"   "+rs.getString(2));
       			 pw.println("<tr><td>" + rs.getInt(1)+ "</td><td>" + rs.getString(2) +"</td><td>"+ rs.getInt(3)+"</td></tr></center>");   
       			 
       		 }
       		 pw.println("</table>");  
       		 pw.println("</html></body>");  
       		 //rd.include(request, response);
       		 
       	 } catch (SQLException e) {
       		 // TODO Auto-generated catch block
       		 e.printStackTrace();
       	 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}

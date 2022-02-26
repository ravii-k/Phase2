package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Product;
import com.utility.HibernateUtility;

/**
 * Servlet implementation class productInsert
 */
@WebServlet("/productInsert")
public class productInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public productInsert() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> dbMessages = new HashMap<String, String>();
		
		Session session = HibernateUtility.getSession();
		
		Transaction tx = session.beginTransaction();
		
		Product p1 = new Product(Integer.parseInt(request.getParameter("productId")), request.getParameter("productName"));
		session.save(p1);
		tx.commit();
		
		dbMessages.put("success", "Product inserted");
	
		request.setAttribute("dbMessages", dbMessages);
		request.getRequestDispatcher("productform.jsp").forward(request,response);
	}

}

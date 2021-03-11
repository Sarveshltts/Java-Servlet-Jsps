package com.ltts.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.DAO.AuctionDAO;
import com.ltts.model.Auction;

/**
 * Servlet implementation class InsertAuctionServlet
 */
@WebServlet("/InsertAuctionServlet")
public class InsertAuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAuctionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int aucid=Integer.parseInt(request.getParameter("aucid"));
		int pid=Integer.parseInt(request.getParameter("pid"));

		int tid=Integer.parseInt(request.getParameter("tid"));

		int year=Integer.parseInt(request.getParameter("year"));
		int cost=Integer.parseInt(request.getParameter("price"));

		Auction p=new Auction(aucid,pid,tid,year,cost);
		RequestDispatcher rd=null;
		AuctionDAO po=new AuctionDAO();
		try {
			po.insertauction(p);
			out.print("Updated Successfully");
			rd=request.getRequestDispatcher("Success.html");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rd=request.getRequestDispatcher("home.html");
			rd.include(request, response);
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

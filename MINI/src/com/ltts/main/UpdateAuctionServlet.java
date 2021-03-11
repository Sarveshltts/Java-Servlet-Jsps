package com.ltts.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.DAO.AuctionDAO;

/**
 * Servlet implementation class UpdateAuctionServlet
 */
@WebServlet("/UpdateAuctionServlet")
public class UpdateAuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAuctionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		int id=Integer.parseInt(request.getParameter("id"));
		int tid=Integer.parseInt(request.getParameter("tid"));
		int pid=Integer.parseInt(request.getParameter("pid"));
		int year=Integer.parseInt(request.getParameter("year"));
		int cost=Integer.parseInt(request.getParameter("cost"));
		RequestDispatcher rd=null;
		AuctionDAO po=new AuctionDAO();
		try {
			po.updateAuction(id,tid,pid,year,cost);
			rd=request.getRequestDispatcher("Success.html");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			rd=request.getRequestDispatcher("home.html");
			rd.include(request, response);
			e.printStackTrace();
		}
	}

}

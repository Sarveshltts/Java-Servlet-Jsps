package com.ltts.main;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.DAO.PlayerDAO;

/**
 * Servlet implementation class UpdatePlayerServlet
 */
@WebServlet("/UpdatePlayerServlet")
public class UpdatePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		int id=Integer.parseInt(request.getParameter("id"));
		String pname=request.getParameter("pname");
		int tid=Integer.parseInt(request.getParameter("tid"));
		String d=request.getParameter("dob");
		Date dob=Date.valueOf(d);
		String sk=request.getParameter("skill");
		int nom=Integer.parseInt(request.getParameter("noof"));
		int run=Integer.parseInt(request.getParameter("runs"));
		int wick=Integer.parseInt(request.getParameter("wickets"));
		String count=request.getParameter("pcountry");
		RequestDispatcher rd=null;
		PlayerDAO po=new PlayerDAO();
		try {
			po.updateplayer(id,pname,tid,dob,sk,nom,run,wick,count);
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

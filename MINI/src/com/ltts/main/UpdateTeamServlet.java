package com.ltts.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.DAO.TeamDAO;

/**
 * Servlet implementation class UpdateTeamServlet
 */
@WebServlet("/UpdateTeamServlet")
public class UpdateTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeamServlet() {
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
		String pname=request.getParameter("tname");
		String oname=request.getParameter("oname");
		String cname=request.getParameter("cname");
		RequestDispatcher rd=null;
		TeamDAO po=new TeamDAO();
		try {
			po.updateteam(id,pname,oname,cname);
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

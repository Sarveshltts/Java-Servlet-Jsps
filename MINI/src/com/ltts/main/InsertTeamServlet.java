package com.ltts.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.DAO.TeamDAO;
import com.ltts.model.Team;

/**
 * Servlet implementation class InsertTeamServlet
 */
@WebServlet("/InsertTeamServlet")
public class InsertTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int tid=Integer.parseInt(request.getParameter("tid"));
		String name=request.getParameter("tname");

		String own=request.getParameter("oname");

		String coa=request.getParameter("cname");;

		Team p=new Team(tid,name,own,coa);
		RequestDispatcher rd=null;
		TeamDAO po=new TeamDAO();
		try {
			po.insertteam(p);
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

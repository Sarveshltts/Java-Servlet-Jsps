package com.ltts.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.DAO.PlayerDAO;
import com.ltts.model.Player;

/**
 * Servlet implementation class InsertPlayerServlet
 */
@WebServlet("/InsertPlayerServlet")
public class InsertPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InsertPlayerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String name=request.getParameter("name");
		int tid=Integer.parseInt(request.getParameter("tid"));
		String dbb=request.getParameter("dob");
		Date dob=Date.valueOf(dbb);
		String count=request.getParameter("count");
		String sk=request.getParameter("skill");
		int mat=Integer.parseInt(request.getParameter("mp"));
		int run=Integer.parseInt(request.getParameter("run"));
		int wic=Integer.parseInt(request.getParameter("wicket"));

		Player p=new Player(pid,name,tid,dob,sk,mat,run,wic,count);
		RequestDispatcher rd=null;
		PlayerDAO po=new PlayerDAO();
		try {
			po.insertplayer(p);
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

package com.maple.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maple.utils.ConsolePrint;
import com.maple.utils.DemoRegUtil;

/**
 * Servlet implementation class DemoRegServlet
 */
public class DemoRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoRegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String installCompany=request.getParameter("installCompany");
		String managerName=request.getParameter("managerName");
		String managerPhone=request.getParameter("managerPhone");
		String machineCode=request.getParameter("machineCode");
		String serialNumber=request.getParameter("serialNumber");
		//¥Ú”°»’÷æ
		ConsolePrint.PrintLog("installCompany---"+installCompany);
		ConsolePrint.PrintLog("managerName---"+managerName);
		ConsolePrint.PrintLog("managerPhone---"+managerPhone);
		ConsolePrint.PrintLog("machineCode---"+machineCode);
		ConsolePrint.PrintLog("serialNumber---"+serialNumber);
		
		String str=DemoRegUtil.getDemoRegCode(machineCode, serialNumber);
		
		request.setAttribute("str", str);
		request.getRequestDispatcher("demoRegView.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

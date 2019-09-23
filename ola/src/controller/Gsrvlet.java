package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ola.entity.OlaEmployee;
import com.ola.service.OlaService;
import com.ola.service.OlaServiceInterface;



public class Gsrvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response, Object option) throws ServletException, IOException {
		
		String sc=request.getParameter("ac");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		if(option.equals("register")){
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			String email=request.getParameter("email");
			String address=request.getParameter("address");
		OlaEmployee oe=new OlaEmployee();
		oe.setName(name);
		oe.setPass(pass);
		oe.setEmail(email);
		oe.setAddress(address);
		OlaServiceInterface os=OlaService.createServiceObject();
		int i=os.createProfile(oe);
		if(i>0){
			out.println("profile created");
			}else
			{
				out.println("profile can't created");
			}
	}
		if(option.equals("login")){
			}
	if(option.equals(" time line")){
		}
		out.println("</body>ss</html>");
}
}

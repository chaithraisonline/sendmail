

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Fp
 */
public class Fp extends HttpServlet
{
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email=request.getParameter("email");
		String notp=request.getParameter("notp");
		
		String otp = null;
		if(otp==notp)
		{
			
		}
		
		HttpSession sn=request.getSession(true);
		sn.setAttribute("email", email);
		sn.setAttribute("notp", notp);

		response.sendRedirect("/sendmail/mail.jsp");

	}

}

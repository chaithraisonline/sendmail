

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.Regmodal;
import sendmail.Mailmodal;

/**
 * Servlet implementation class Fprp
 */
public class Fprp extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String mail=request.getParameter("mail");
		String password=request.getParameter("npassword");
		
		Mailmodal m = new Mailmodal();
		m.setmail(mail);
		m.setpassword(password);
		int x=m.register();
		if(x==1)
		{
			response.sendRedirect("/registration/sucess.html");
		}
		else
		{
			response.sendRedirect("/registration/fail.html");
			
		}
		
		
	}

}



import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Fprpfilter
 */
public class Fprpfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Fprpfilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String npassword=request.getParameter("npassword");
		String cpassword=request.getParameter("cpassword");
		
		if(npassword.length()!=0 && cpassword.length()!=0)
		{
			if(npassword.equals(cpassword)==true)
			{
				((HttpServletResponse) response).sendRedirect("/sendmail/Fprp.java");

			}
			chain.doFilter(request, response);

			
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/sendmail/fprp.html");
			
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

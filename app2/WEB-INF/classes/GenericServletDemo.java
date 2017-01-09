import javax.servlet.*;
import java.io.*;
public class GenericServletDemo extends GenericServlet
{
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
		pw.println("This servlet devloped by extending GenericServlet");
	}
}
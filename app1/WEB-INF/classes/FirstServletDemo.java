import javax.servlet.*;
import java.io.*;
public class FirstServletDemo implements Servlet
{
public void init(ServletConfig config)throws ServletException
{
	System.out.println("This is init method");
}
public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
{
	PrintWriter pw=response.getWriter();
	pw.println("This is first servlet developed by implementing servlet interface");
}
public void destroy()
{
System.out.println("destroy method called");
}
public ServletConfig getServletConfig()
{
	return null;
}
public String getServletInfo()
{
	return "This is servletInfo";
}
	
}
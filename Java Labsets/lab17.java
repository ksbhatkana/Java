  import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class lab17 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		String name,addr;
		response.setContentType("text/html");
		name=request.getParameter("uname");
		addr=request.getParameter("address");
		PrintWriter out=response.getWriter();
		out.println("<html><body-bgcolor='#ffffff' text='#000000'>");
		out.println("<h1 align=center>hello..."+name+"</h1><hr>Address:"+addr);
		out.close();
	}
}


<html>
<head>
<title>greeting...</title>
</head>
<body-bgcolor='#ffffff' text='#000000'>
<h1 align=center>GREETING A USER</h1>
<hr>
<form method=get action="http://localhost:8080/examples/servlets/servlet/lab">
<b>NAME:</b>
<input type=text name=uname />
<b>Address:</b>
<input type=text name=address />
<input type=submit value=SUBMIT />
</hr>
</form>
</body>
</html>




localhost:8080
javac lab.java -classpath /usr/share/tomcat7/lib/servlet-api.jar
sudo cp lab.class /usr/share/tomcat7-examples/examples/WEB-INF/classes
sudo cp lab.html /var/www
sudo cp lab.html /usr/share/tomcat7-examples/examples/WEB-INF/web.xml /usr/share/tomcat7-examples/examples/WEB-INF/web.xml.bak
sudo gedit /usr/share/tomcat7-examples/examples/WEB-INF/web.xml

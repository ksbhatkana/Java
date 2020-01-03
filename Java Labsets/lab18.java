import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.text.DateFormat;
public class lab2 extends HttpServlet
{
 public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, java.io.IOException
 {
    response.setContentType("text/html");
    java.io.PrintWriter out=response.getWriter();
    HttpSession session= request.getSession();
    Date creationTime= new Date(session.getCreationTime());
    Date lastAccessed= new Date(session.getLastAccessedTime());
    Date now= new Date();
    DateFormat formatter=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
    out.println("<html>");
     out.println("<head>");
      out.println("<title>Displaying session creation and last accessed time</title>");

     out.println("</head>");

     out.println("<body>");

     out.println("<h2>session creation and last accessed</h2>");
      out.println("the time and date now is:"+formatter.format(now)+"<br>");
       out.println("the session creation time:HttpSession.getCreationTime():"+formatter.format(creationTime));
    out.println("the last time the session was accessed:HttpSession.getLastAccessedTime():"+formatter.format(lastAccessed));
    out.println("</body>");
    out.println("</html>");

    }
 }




 localhost:8080
javac lab2.java -classpath /usr/share/tomcat7/lib/servlet-api.jar
sudo cp lab2.class /usr/share/tomcat7-examples/examples/WEB-INF/classes
sudo cp lab2.html /usr/share/tomcat7-examples/examples/WEB-INF/web.xml /usr/share/tomcat7-examples/examples/WEB-INF/web.xml.bak
sudo gedit /usr/share/tomcat7-examples/examples/WEB-INF/web.xml

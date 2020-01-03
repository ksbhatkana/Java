 import java.net.*;
import java.io.*;
public class ContentServer
{
  public static void main(String args[]) throws Exception
  {

     ServerSocket sersock = new ServerSocket(4000);
     System.out.println("Server ready for connection");
     Socket sock = sersock.accept();
          System.out.println("Connection is successful ");
     InputStream istream = sock.getInputStream( );
     BufferedReader fileRead =new BufferedReader(newInputStreamReader(istream));
     String fname = fileRead.readLine( );
     System.out.println(fname);

FileReader fr=new FileReader(fname);
BufferedReader contentRead = new BufferedReader(fr) ;
     OutputStream ostream = sock.getOutputStream( );
     PrintWriter pwrite = new PrintWriter(ostream, true);
try{
     while((str = contentRead.readLine()) !=  null)
     {
        pwrite.println(str);
     }
}
catch(IOException e)
{
 pwrite.println(" EXIT");
}
     sock.close();
     sersock.close();
     pwrite.close();
     fileRead.close();
     contentRead.close();
     System.out.println("Connection Terminated");

  }
}

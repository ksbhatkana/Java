import java.io.File;
import java.util.*;
import java.text.*;
class lab13
{
   static void P(String s)
   {
     System.out.println(s);
   }
   public static void main(String [] args)
   {
     File f1=new File(args[0]);
     P("file name :"+f1.getName());
     P("Path :"+f1.getPath());
     P("absPath :"+f1.getAbsolutePath());
     P("Parent :"+f1.getParent());
     P(f1.exists()?"exixts":" does not exists");
     P(f1.canWrite()?"is writeable":" is not writeable");
     P(f1.canRead()?"is readable":" is not readable");
     P("is"+(f1.isDirectory()?"":" not") +" a directory");
     P(f1.isAbsolute()?" is absolute":"is not absolute");
     P("file last modified "+f1.lastModified());
     SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
     P("File last modified in simple format :"+s.format(f1.lastModified()));
     P("file size :"+f1.length()+" Bytes");
   }
}

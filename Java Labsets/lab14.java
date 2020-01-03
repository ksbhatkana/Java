import java.io.*;
import java.util.*;
class labset14
{
 public static void main(String[] args) throws IOException
 {
    //File file = new File("Myfile.txt");
    File file = new File("lab17.html");
    FileInputStream fin = null;
    String s=null;
        try {
            fin = new FileInputStream(file);
            byte fileContent[] = new byte[(int)file.length()];
            fin.read(fileContent);
            s = new String(fileContent);
            System.out.println("File content: \n" + s);
        }
       catch (FileNotFoundException e)
        {
            System.out.println("File not found" + e);
            System.exit(0);
        }
        catch (IOException ioe)
        {
            System.out.println("Exception while reading file " + ioe);
        }
    System.out.println("Creating file1.txt: which contains every other or alternate bytes.") ;
    byte buf[]=s.getBytes();
    OutputStream f0=new FileOutputStream("file1.txt");
    for(int i=0;i<buf.length;i+=2)
    {
        f0.write(buf[i]);
    }
    f0.close();
    System.out.println("Creating file2.txt: which contains entire set of bytes.") ;
    OutputStream f1=new FileOutputStream("file2.txt");
    f1.write(buf);
    f1.close();
    System.out.println("Creating file3.txt: which contains only the last quarter.")  ;
    OutputStream f2=new FileOutputStream("file3.txt");
    f2.write(buf, buf.length-buf.length/4, buf.length/4);
    f2.close();
    fin.close();
}
}


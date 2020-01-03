import java.awt.*;
import java.applet.*;
import java.util.Scanner;
public class SimpleBanner extends Applet implements Runnable
{
   //String msg="JavaLaboratory";
   public String msg;
   Thread t=null;
   int state;
   volatile boolean stopFlag;
   public void init()
   {
      System.out.println("Enter the message");
      Scanner s = new Scanner(System.in);
      msg=s.next();
      setBackground(Color.green);
      setForeground(Color.red);
   }
   public void start()
   {
      t=new Thread(this);
      stopFlag=false;
      t.start();
   }
   public void stop()
   {
      stopFlag=true;
      t=null;
   }
   public void run()
   {
       char ch;
      for( ; ; )
      {
         try
         {
            repaint();
            Thread.sleep(500);
            ch=msg.charAt(0);
            msg=msg.substring(1,msg.length());
            msg=msg+ch;
            if(stopFlag)
               break;

         }
         catch(InterruptedException e)
         {
            System.out.println("Exception caught");
         }
      }
   }
   public void paint(Graphics g)
   {
      Font f;
      Color c1=getForeground();
      System.out.println(c1);
      g.setColor(c1);
      g.drawString(msg,10,30);
   }
}

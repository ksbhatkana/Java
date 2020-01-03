//to demonstrate all the mouse
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class lab15 extends Applet
implements MouseListener, MouseMotionListener
{
     String msg = "";
     int mouseX = 0, mouseY = 0; // coordinates of mouse
    public void init()
    {
      addMouseListener(this);
      addMouseMotionListener(this);
    }
    // Handle mouse clicked.
    public void mouseClicked(MouseEvent me)
    {
      // save coordinates
       mouseX = 0;
       mouseY = 10;
       msg = "Mouse clicked.";
       repaint();
    }
    // Handle mouse entered.
    public void mouseEntered(MouseEvent me)
    {
      // save coordinates
       mouseX = 0;
       mouseY = 10;
       msg = "Mouse entered.";
       repaint();
    }
    // Handle mouse exited.
    public void mouseExited(MouseEvent me)
   {
     // save coordinates
     mouseX = 0;
     mouseY = 10;     msg = "Mouse exited.";
     repaint();
   }

   public void mousePressed(MouseEvent me)
   {

      mouseX = me.getX();
      mouseY = me.getY();
      msg = "Down";
      repaint();
   }

    public void mouseReleased(MouseEvent me)
   {

     mouseX = me.getX();
     mouseY = me.getY();
     msg = "Up";
     repaint();
   }

    public void mouseDragged(MouseEvent me)
    {

     mouseX = me.getX();
      mouseY = me.getY();
      msg = "*";
     showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
     repaint();
    }
   public void mouseMoved(MouseEvent me)
   {

     showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
   }

   public void paint(Graphics g)
   {
     g.drawString(msg, mouseX, mouseY);
    }
}


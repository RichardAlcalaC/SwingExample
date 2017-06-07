import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.event.*;
import java.awt.geom.*;

public class test extends JFrame implements ActionListener, MouseListener {
    Shape circle = new Ellipse2D.Float(10, 10, 10, 10);

    public test () {
        setSize(600,600);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        //TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                   test frame = new test();
                   frame.setVisible(true);
              }
        });
    }

    public void actionPerformed(ActionEvent ae) {

    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(c);
        int xCenter = getWidth()/2;
        int yCenter = getHeight()/2;
        
        g.fillOval(xCenter - (50/2) , yCenter - (50/2), 50, 50);
    }
    

    public void drawCircle(int x, int y) {
        Graphics g = this.getGraphics();
        //g.drawOval(x, y, x, y);
    }

    int x, y;
    Color c;
    

    public void mouseClicked(MouseEvent e) {
       x = e.getX();
       y = e.getY();
       
       if(x>300)
           c = Color.yellow;
       System.out.println(String.format("click at: %s, %s", 
                                                 e.getX(), e.getY()));

       repaint();
    }

    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }
}

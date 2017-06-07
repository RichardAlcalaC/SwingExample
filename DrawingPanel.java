import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author Richard Alcala C. 
 * @version 0.1 (06/07/2017)
 */
public class DrawingPanel extends JPanel
{
    private Ellipse2D circle;
    private Color colorCircle;
    
    public DrawingPanel() {
        circle = new Ellipse2D.Double();
        colorCircle = Color.RED;
        
        setBackground(Color.GRAY);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent event) {
                //System.out.println(String.format("click at: %s, %s", 
                //                                 event.getX(), event.getY()));
                if (circle.contains(event.getPoint())) {
                    System.out.println("you clicked inside the circle, changing the Color..."); 
                    changeColorCircle();
                }
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.yellow);
        int xCenter = getWidth()/2;
        int yCenter = getHeight()/2;
        //g.fillOval(xCenter - (50/2) , yCenter - (50/2), 50, 50);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
       
        int xCirclePos = getWidth()/2 - 50/2;
        int yCirclePos = getHeight()/2 - 50/2;
        circle = new Ellipse2D.Double(xCirclePos, yCirclePos, 50, 50);
        
        g2.setColor(colorCircle);
        g2.fill(circle);
    }
    
    private void changeColorCircle() {
        if (colorCircle == Color.YELLOW) {
            colorCircle = Color.GREEN;
        } else {
            colorCircle = Color.YELLOW;
        }
        repaint();
    }
}

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

/**
 * Write a description of class DrawingWindow here.
 * 
 * @author Richard Alcala Cuba 
 * @version 0.1 06/09/2017
 */

public class DrawingPanel extends JPanel
{
    //private Circle circle;
    private Collection<Circle> circles;
    
    public DrawingPanel() {
        
        //circle = new Circle(25, Color.yellow);
        circles = new Vector<Circle>();
        
        setBackground(Color.GRAY);
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent event) {
                if (!clickIsInsideAnyCircle(event)) {
                    addNewCircle(event);
                }
                repaint();
            }
        });
    }
    
    private boolean clickIsInsideAnyCircle(MouseEvent event) {
        boolean isInsideAnyCircle = false;
        for (Circle circle: circles) {
            circle.clickAt(event.getX(), event.getY());
            if (circle.isInsideCircle(event.getX(), event.getY())) {
                isInsideAnyCircle = true;
            }            
        }
        return isInsideAnyCircle;
    }
    
    private void addNewCircle(MouseEvent event) {
        circles.add(new Circle(event.getX(), event.getY()));
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Collections.sort((Vector)circles);
        
        for (Circle circle: circles) {
            circle.draw(g);
        }
    }
}

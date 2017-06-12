import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class DrawingWindow here.
 * 
 * @author Richard Alcala Cuba 
 * @version 0.1 06/12/2017
 */

public class Square extends AbstractShape implements Comparable<Square>
{
    private int side;
    private int x;
    private int y;
    private Color color;
    private boolean changeAspect;
    
    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }
    
    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        color = getNextColor();
        side = 30;
    }
    
    /*
    public int getRadius() {
        return radius;
    }
    */
   
    public void draw(Graphics g, int x, int y) {
        this.draw(g);
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics g) {
        g.setColor(color);
        
        //g.fillOval(x - radius , y - radius, radius * 2, radius * 2);
        
        g.fillRect(x-side, y-side, side*2, side*2);
        
        
        if (changeAspect) {
            color = getNextColor();
            changeAspect = false;
            //radius = (int)(200 * Math.random());
        }
        
    }
    
    public void clickAt(int x, int y) {
        changeAspect = contains(x, y);
    }
    
    public boolean contains(int x, int y) {
        int xCenter = this.x;
        int yCenter = this.y;
        //double d = Math.hypot(yCenter - y, xCenter - x);
        //return d <= radius;
        
        //double d = Math.hypot(yCenter - y, xCenter - x);
        
        
        return false;
    }
    
    @Override
    public int compareTo(Square compareSquare) {
        //int compareRadius = ((Square) compareSquare ).getRadius();
        //return compareRadius - this.radius;
        return -1;
    }    
}

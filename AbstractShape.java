
/**
 * Write a description of class DrawingWindow here.
 * 
 * @author Richard Alcala Cuba 
 * @version 0.1 06/12/2017
 */

import java.awt.Color;
public abstract class AbstractShape
{
    protected int x;
    protected int y;
    protected Color color;
    protected boolean changeAspect;
    
    protected Color getNextColor() {
        int red = (int) (255 * Math.random());
        int green = (int) (255 * Math.random());
        int blue = (int) (255 * Math.random());
        
        return new Color(red, green, blue);
    }
}

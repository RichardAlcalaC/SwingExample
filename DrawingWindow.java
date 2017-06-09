
import javax.swing.JFrame;

/**
 * Write a description of class DrawingWindow here.
 * 
 * @author Richard Alcala Cuba 
 * @version 0.1 06/09/2017
 */
public class DrawingWindow extends JFrame
{
    
    private DrawingPanel panel;
    
    public DrawingWindow(String title) {
        super(title);
        panel = new DrawingPanel();
        
        panel.setSize(50, 100);
        
        //getContentPane().setLayout(null);
        getContentPane().add(panel);
    }
    
    public static void main(String args[]) {
        DrawingWindow window = new DrawingWindow("Drawing Example");
        window.setSize(500, 150);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

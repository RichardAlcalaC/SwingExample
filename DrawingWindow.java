
import javax.swing.JFrame;

/**
 * Write a description of class DrawingWindow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingWindow extends JFrame
{
    
    private DrawingPanel panel;
    
    public DrawingWindow(String title) {
        super(title);
        panel = new DrawingPanel();
        
        panel.setSize(300, 300);
        
        getContentPane().setLayout(null);
        getContentPane().add(panel);
    }
    
    public static void main(String args[]) {
        DrawingWindow window = new DrawingWindow("Drawing Example");
        window.setSize(300, 300);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

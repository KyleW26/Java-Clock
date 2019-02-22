/*
 * Author: Kyle Williams (eeu8e1)
 * Date: 9th October 2017
 * Task: Assessment 1 - Complex Shape Creation
 */
package clock;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class ClockComponent extends JComponent 
{
       
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Clock c1 = new Clock(9,22);
        c1.draw(g2);  
    }
}

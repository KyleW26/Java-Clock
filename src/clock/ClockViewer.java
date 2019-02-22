/*
 * Author: Kyle Williams (eeu8e1)
 * Date: 9th October 2017
 * Task: Assessment 1 - Complex Shape Creation
 */
package clock;
import java.awt.*;
import javax.swing.*;

public class ClockViewer 
{

    public static void main(String[] args) 
    {
        // Create the frame
        JFrame frame = new JFrame();
        frame.setSize(460,460);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clock Viewer");
        
        // Create the clock
        ClockComponent clock = new ClockComponent();
        frame.getContentPane().setPreferredSize(new Dimension(400,400));
        frame.getContentPane().add(clock);
        

        frame.setVisible(true);
    }
    
}

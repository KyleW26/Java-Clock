/*
 * Author: Kyle Williams (eeu8e1)
 * Date: 9th October 2017
 * Task: Assessment 1 - Complex Shape Creation
 */
package clock;
import java.awt.*;
import java.awt.geom.*;

public class Clock 
{
    private double xLeft;
    private double yTop;
    
    public int cHour;
    public int cMinute;
    
    // Constructor Method to pass parameters
    public Clock(int hour, int minute) 
    {
        cHour = hour;
        cMinute = minute;
        xLeft = 200;
        yTop = 200;
    }
    
    public void draw(Graphics2D g2)
    {
        // Build parts main clock
        Ellipse2D.Double mainFrame = new Ellipse2D.Double(0, 0, 400, 400);
        Ellipse2D.Double innerCircle = new Ellipse2D.Double(xLeft-10, yTop-10, 20, 20);
        
        g2.setStroke(new BasicStroke(2));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.draw(mainFrame);
        g2.fill(innerCircle);
        
        // Draw the hour markings
        for (int i = 0; i < 60; i++) {
            if (i % 5 == 0)
                g2.draw(calculateLine(xLeft, yTop, i, 170, 200));
            else
                g2.draw(calculateLine(xLeft, yTop, i, 195, 200));
        }
        
        // Draw the clock hands
        Stroke s = g2.getStroke();
        g2.setStroke(new BasicStroke(5));
        g2.draw(calculateLine(xLeft, yTop, (cHour%12)*5, 0, 100));
        
        g2.setStroke(s);
        g2.draw(calculateLine(xLeft, yTop, cMinute, 0, 160));
    }
    
    // Code to create the hour markings
    private Line2D calculateLine(double centreX, double centreY, 
            int minute, int startLength, int length) {
        
        int degPerMinute = 6;
        int degree = degPerMinute * minute;
        double theta = Math.toRadians(degree-90);
        
        double startX = centreX + (startLength * Math.cos(theta));
        double startY = centreY + (startLength * Math.sin(theta));
        
        double endX = centreX + (length * Math.cos(theta));
        double endY = centreY + (length * Math.sin(theta));
        
        
        
        return new Line2D.Double(startX, startY, endX, endY);
    }
    
    
    
    
}
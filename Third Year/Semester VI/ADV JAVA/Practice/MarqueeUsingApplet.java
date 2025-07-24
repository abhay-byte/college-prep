import java.applet.Applet;
import java.awt.Graphics;

// <applet code=MyELClass width=600 height=600></applet>

public class MarqueeUsingApplet extends Applet implements Runnable {
    private String message = "Marquee Marquee Marquee";
    private int xPos;

    public void init() {
        xPos = getWidth(); 
        Thread t = new Thread(this);
        t.start(); 
    }

    public void run() {
        while (true) {
            try {
                repaint();
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            xPos--; 
            if (xPos + getFontMetrics(getFont()).stringWidth(message) < 0) {
                xPos = getWidth(); 
            }
        }
    }

    public void paint(Graphics g) {
        g.drawString(message, xPos, getHeight() / 2); 
    }
}

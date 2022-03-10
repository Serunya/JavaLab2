import java.awt.*;
import javax.swing.*;

public class DrawLine extends JPanel {
    Circle cr1;
    Circle cr2;
    DrawLine(Circle cr1, Circle cr2){
        this.cr1 = cr1;
        this.cr2 = cr2;
    }
    public void paintComponent(Graphics g) {

        int h = getHeight();
        int w = getWidth();
        int x1 = w/2 + cr1.x * 10;
        int y1 = h/2 - cr1.y * 10;
        int x2 = w/2 + cr2.x * 10;
        int y2 = h/2 - cr2.y * 10;
        int r1 = cr1.r * 10;
        int r2 = cr2.r * 10;

        /*
        g.setColor(Color.BLACK);
        g.drawLine(0, h/2, w, h/2);
        g.drawLine(w/2, 0, w/2, h);
         */
        g.setColor(Color.blue);
        g.drawOval(x1-r1,y1-r1,r1*2,r1*2);
        g.setColor(Color.green);
        g.drawOval(x2-r2,y2-r2,r2*2,r2*2);
    }

    public static void DrawThis(Circle cr1, Circle cr2) {
        JFrame frame = new JFrame("Draw Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(400,400);
        DrawLine panel = new DrawLine(cr1, cr2);
        frame.add(panel);
        frame.setVisible(true);
    }
}

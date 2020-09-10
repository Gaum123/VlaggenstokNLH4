import java.awt.*;
import java.applet.*;

public class NLVlagH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(100, 80, 170, 50);
        g.setColor(Color.blue);
        g.fillRect(100, 180, 170, 50);
        g.setColor(Color.black);
        g.drawLine(100, 80, 100, 500);
    }
}

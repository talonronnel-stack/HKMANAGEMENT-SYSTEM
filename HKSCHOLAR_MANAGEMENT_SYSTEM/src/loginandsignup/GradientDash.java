package loginandsignup;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GradientDash extends JPanel {

    public GradientDash() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g.create();

        GradientPaint gradient = new GradientPaint(
            0, 0,
            new Color(86,204,242),
            getWidth(), getHeight(),
            new Color(25,118,210)
        );

        g2.setPaint(gradient);
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.dispose();

        super.paintComponent(g);
    }
}
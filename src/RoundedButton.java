import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class RoundedButton extends JButton {
    private boolean isPressed = false;

    public RoundedButton() {
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);

        addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                isPressed = !isPressed;
                repaint();

            }
        });

    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(Color.RED);
        int size = Math.min(getWidth(), getHeight());
        g2.fillOval(0,  0, size, size);

        if(isPressed) {
            g2.setColor(Color.WHITE);
            g2.fillRoundRect(size/ 4, size / 4, size / 2, size / 2, size / 4, size / 4);
        }

        g2.dispose();
    }

    protected void paintBorder(Graphics g) {

    }

    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }
}


/*
Write a program that displays a tic-tac-toe board. A cell may be
X, O, or empty. What to display at each cell is randomly
decided. The X and O are images in the files X.gif and O.gif.
 */
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class prac5a {
    public static void main(String[] args) {
        System.out.println("Varun Gaur, 210410107077, 21BECEG102, SY CE2B, 2022-23");
        Random random = new Random();
        JFrame frame = new JFrame("Tic tac toe");
        frame.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            Boolean boola = random.nextBoolean();
            if (boola) {
                JLabel label = new JLabel();
                label.setIcon(new ImageIcon("crossmark.gif"));
                frame.add(label);
            } else {
                JLabel label = new JLabel();
                label.setIcon(new ImageIcon("ezgif.com-resize.gif"));
                frame.add(label);
            }
        }
        frame.setSize(1080, 1080);
        frame.setVisible(true);

    }
}
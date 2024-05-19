import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author hamma
 */
public class MyFrame extends JFrame {
    private JLabel I;
    private JTextField tf;
    private JButton b;

    MyFrame() {
        super("Class");
        setLayout(new FlowLayout());
        for (int i = 1; i <= 10; i++) {
            if (i <= 3) {
                I = new JLabel("Awesome" + i);
                I.setToolTipText("Help Here" + i);
                add(I);
            }
            if (i == 4) {
                tf = new JTextField("Enter your name", 20);
                tf.setToolTipText("Your official username please");
                add(tf);
            } else {
                b = new JButton("OK");
                b.setToolTipText("click here");
                add(b);
            }
        }

        Component[] components = getContentPane().getComponents();
        for (int i = 1; i <= 9; i++)
        {
            if (i % 2 != 0)
            {
                components[i].setBackground(Color.RED);
            }
        }
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
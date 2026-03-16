import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        // Create the frame
        Frame f = new Frame("AWT Example");

        // Create the Label
        Label l = new Label("Krushangi Khunt");
        l.setBounds(20, 50, 150, 30);

        // Create the TextField (made slightly narrow to recreate the scrolled text effect in your image)
        TextField tf = new TextField("Krushangi Khunt");
        tf.setBounds(180, 50, 70, 30);

        // Create the Button
        Button b = new Button("Show Text");
        b.setBounds(260, 50, 80, 30);

        // Add action listener to the button so it updates the label
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText(tf.getText());
            }
        });

        // Add window listener to properly close the application
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Add components to the frame
        f.add(l);
        f.add(tf);
        f.add(b);

        // Set frame properties
        f.setSize(380, 150);
        f.setLayout(null); // Using no layout manager to position via coordinates
        f.setVisible(true);
    }
}

import java.awt.*;
import java.awt.event.*;

class Code extends Frame implements ActionListener {
    TextField tf;

    public void Event() {

        // create components
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);

        Button priya = new Button("Priya");
        priya.setBounds(200, 120, 80, 30);

        Button harjot = new Button("Harjot");
        harjot.setBounds(300, 120, 80, 30);

        // register listener
        b.addActionListener(this);// passing current instance
        priya.addActionListener(this);// passing current instance
        harjot.addActionListener(this);// passing current instance

        b.setActionCommand("Welcome");
        priya.setActionCommand("Priya");
        harjot.setActionCommand("Harjot");

        // add components and set size, layout and visibility
        add(b);
        add(priya);
        add(harjot);
        add(tf);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Priya")) {
            tf.setText("Priya");
        } else if (command.equals("Harjot")) {
            tf.setText("Harjot");
        } else {
            tf.setText("Welcome");
        }
    }

}

public class AEvent {
    public static void main(String[] args) {
        Code c1 = new Code();
        c1.Event();
    }
}
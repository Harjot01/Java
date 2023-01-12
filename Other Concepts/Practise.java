import java.awt.*;
import java.awt.event.*;

class AWT extends Frame implements ActionListener {
    TextField t1;
    TextField t2;
    TextField t3;
    TextField t4;
    TextField t5;
    TextField display_avg;
    Button btn;

    AWT() {

        // adding textfields
        t1 = new TextField();
        t1.setBounds(60, 50, 170, 20);

        t2 = new TextField();
        t2.setBounds(60, 100, 170, 20);

        t3 = new TextField();
        t3.setBounds(60, 150, 170, 20);

        t4 = new TextField();
        t4.setBounds(60, 200, 170, 20);

        t5 = new TextField();
        t5.setBounds(60, 250, 170, 20);

        display_avg = new TextField();
        display_avg.setBounds(60, 300, 170, 20);

        btn = new Button("Sum");
        btn.setBounds(300, 400, 80, 30);

        btn.addActionListener(this);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(display_avg);
        add(btn);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = Integer.parseInt(t3.getText());
            int n4 = Integer.parseInt(t4.getText());
            int n5 = Integer.parseInt(t5.getText());

            int avg = (n1 + n2 + n3 + n4 + n5) / 5;

            display_avg.setText(" " + avg);
        }
    }
}

public class Practise {
    public static void main(String[] args) {
        AWT a = new AWT();
    }
}
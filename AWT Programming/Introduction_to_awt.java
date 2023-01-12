import java.awt.*;

class AWT_Program {
    void Program() {
        Frame f = new Frame();
        Button btn = new Button("Hello World");
        btn.setBounds(80, 80, 100, 50);
        f.add(btn); // adding a new Button.
        f.setSize(300, 250); // setting size.
        f.setTitle("JavaTPoint"); // setting title.
        f.setLayout(null); // set default layout for frame.
        f.setVisible(true);
    }
}

public class Introduction_to_awt {
    public static void main(String[] args) {
        AWT_Program awt = new AWT_Program();
        awt.Program();
    }
}
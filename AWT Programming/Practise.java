import java.awt.*;


class AWT{
    public AWT(){
        Frame f = new Frame();  
        Label fname = new Label("First Name: ");
        Label lname = new Label("Last Name: ");

        fname.setBounds(20, 40, 100, 100);
        lname.setBounds(20, 110, 100, 100);

        TextField first_name = new TextField();
        first_name.setBounds(100, 80, 80, 20);
        TextField last_name = new TextField();
        last_name.setBounds(100, 150, 80, 20);


        Button btn = new Button("Submit");
        btn.setBounds(200, 200, 80, 20);

        f.add(first_name);
        f.add(fname);
        f.add(last_name);
        f.add(lname);
        f.add(btn);

        f.setSize(500,500);

        f.setLayout(null);
        f.setVisible(true);

    }
}

public class Practise{
    public static void main(String[] args) {
        AWT obj = new AWT();

    }
}



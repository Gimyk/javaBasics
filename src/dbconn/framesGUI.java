package dbconn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class framesGUI implements ActionListener {

    JFrame fr = new JFrame("Student Info");
    Panel pn = new Panel();

    Label lbl_name = new Label("Name: ");
    Label lbl_surname = new Label("Surname: ");
    Label lbl_studentNumber = new Label("Studnet Number: ");
    Label lbl_address = new Label("Address: ");
    Label lbl_contact = new Label("Contact: ");

    TextField txt_name = new TextField(50);
    TextField txt_surname = new TextField(50);
    TextField txt_studentNumber = new TextField(50);
    TextField txt_address = new TextField(50);
    TextField txt_contact = new TextField(50);

    Button btn_submit = new Button("Add Student");

    public framesGUI() {
        pn.add(lbl_name);
        pn.add(txt_name);
        pn.add(lbl_surname);
        pn.add(txt_surname);
        pn.add(lbl_studentNumber);
        pn.add(txt_studentNumber);
        pn.add(lbl_address);
        pn.add(txt_address);
        pn.add(lbl_contact);
        pn.add(txt_contact);
        pn.add(btn_submit);

        fr.add(pn);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fr.setSize(450, 500);
        fr.setVisible(true);

        btn_submit.addActionListener(this);
    }

    public static void main(String[] args) {
        new framesGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_submit) {
            try {

                String name = txt_name.getText();
                String surname = txt_surname.getText();
                String stNo = txt_studentNumber.getText();
                String address = txt_address.getText();
                String contact = txt_contact.getText();

//              int testParse = Integer.valueOf(txt_contact.getText());

                System.out.println("The Name = " + name);
                System.out.println("The surname = " + surname);
                System.out.println("The stNo = " + stNo);
                System.out.println("The address = " + address);
                System.out.println("The contact = " + contact);
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Please use numbers and not text");
            }

        }

    }

}

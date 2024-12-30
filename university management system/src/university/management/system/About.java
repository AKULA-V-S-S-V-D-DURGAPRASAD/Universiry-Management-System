package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/kiet.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,0,300,200);
        add(img);

        JLabel heading = new JLabel("<html> KIET</br> UNIVERSITY</html>");
        heading.setBounds(70,20,300,130);
        heading.setFont(new Font("Thoma", Font.BOLD,30));
        add(heading);

        JLabel name = new JLabel("Dreams Come True");
        name.setBounds(60,260,550,40);
        name.setFont(new Font("Thoma", Font.BOLD,30));
        add(name);

        JLabel contact = new JLabel("kietgroup@gmail.com");
        contact.setBounds(70,340,550,40);
        contact.setFont(new Font("Thoma", Font.BOLD,30));
        add(contact);

        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(new Color(252,228,210));
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new About();
    }
}
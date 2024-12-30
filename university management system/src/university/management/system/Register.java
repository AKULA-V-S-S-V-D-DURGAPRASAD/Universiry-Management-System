package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame implements ActionListener {

    JTextField usernameField;
    JPasswordField passwordField;
    JComboBox<String> userRole;
    JButton registerButton, backButton;

    Register() {
        setTitle("Register Page");
        setLayout(null);

        JLabel titleLabel = new JLabel("Register User");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setBounds(150, 30, 200, 40);
        add(titleLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        usernameLabel.setBounds(50, 100, 100, 30);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(200, 100, 200, 30);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        passwordLabel.setBounds(50, 150, 100, 30);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(200, 150, 200, 30);
        add(passwordField);

        JLabel roleLabel = new JLabel("Role:");
        roleLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        roleLabel.setBounds(50, 200, 100, 30);
        add(roleLabel);

        userRole = new JComboBox<>(new String[]{"Student", "Teacher"});
        userRole.setBounds(200, 200, 200, 30);
        add(userRole);

        registerButton = new JButton("Register");
        registerButton.setBounds(100, 270, 120, 40);
        registerButton.addActionListener(this);
        add(registerButton);

        backButton = new JButton("Back");
        backButton.setBounds(250, 270, 120, 40);
        backButton.addActionListener(this);
        add(backButton);

        getContentPane().setBackground(Color.WHITE);
        setSize(500, 400);
        setLocation(500, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());
            String role = (String) userRole.getSelectedItem();

            try {
                Conn conn = new Conn();
                String query = "INSERT INTO users (username, password, role) VALUES ('" + username + "', '" + password + "', '" + role + "')";
                conn.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Registration Successful");
                setVisible(false);
                new Login();
            } catch (Exception ex) {
                ex.fillInStackTrace();
            }
        } else if (e.getSource() == backButton) {
            setVisible(false);
            new Login();
        }
    }
}

package university.management.system;

import javax.swing.*;
import java.awt.*;

// The Splash class displays an animated splash screen when the application starts.
public class Splash extends JFrame implements Runnable {
    Thread t; // Thread instance for running animations in parallel

    // Constructor to set up the splash screen
    public Splash() {
        // Load an image from the "icons/first.png" file as an ImageIcon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.png"));

        // Scale the image to fit the splash screen dimensions
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        // Add the scaled image to a JLabel
        JLabel img = new JLabel(i3);
        add(img); // Add the JLabel to the JFrame

        // Create and start a new thread for animation
        t = new Thread(this);
        t.start();

        // Make the JFrame visible
        setVisible(true);

        // Variables for animation calculations
        int x = 1;

        // Loop to animate the JFrame's size and location
        for (int i = 2; i <= 600; i += 4, x += 1) {
            // Dynamically adjust the location and size of the JFrame during animation
            setLocation(600 - ((i + x) / 2), 350 - (i / 2));
            setSize(i + 3 * x, i + x / 2);

            try {
                // Pause for a short duration to create a smooth animation effect
                Thread.sleep(10);
            } catch (Exception e) {
                e.fillInStackTrace(); // Print the stack trace if an exception occurs
            }
        }
    }

    // Runnable method to manage additional behavior during the splash screen
    public void run() {
        try {
            // Pause for 10 seconds to display the splash screen
            Thread.sleep(10000);
            setVisible(false);// Hide the splash screen after the delay
            new Login();
        } catch (Exception e) {
            e.fillInStackTrace(); // Print the stack trace if an exception occurs
        }
    }

    // Main method to launch the splash screen
    public static void main(String[] args) {
        new Splash(); // Create an instance of the Splash class
    }
}

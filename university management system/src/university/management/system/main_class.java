package university.management.system;

// Import necessary libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Main class for the University Management System application.
 * This class extends JFrame and implements ActionListener to create a GUI
 * for managing various university functionalities such as adding new information,
 * viewing details, updating details, and utility features.
 */
public class main_class extends JFrame implements ActionListener {

    // Constructor to initialize the GUI
    main_class(){
        // Setting up the background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        // Creating the menu bar
        JMenuBar mb = new JMenuBar();

        // "New Information" menu
        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        // Adding menu items for adding new faculty and student information
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInfo.add(studentInfo);

        // "View Details" menu
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        details.addActionListener(this);  // Incorrectly added - JMenu doesn't directly handle ActionListener
        mb.add(details);

        // Adding menu items for viewing faculty and student details
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        // "Apply Leave" menu
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        leave.addActionListener(this);  // Incorrectly added - JMenu doesn't directly handle ActionListener
        mb.add(leave);

        // Adding menu items for applying leave for faculty and students
        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);

        // "Leave Details" menu
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        studentdetails.addActionListener(this);  // Incorrectly assigned to `studentdetails`
        mb.add(leaveDetails);

        // Adding menu items for leave details
        JMenuItem facultyleaveDetails = new JMenuItem("Faculty Leave Details");
        facultyleaveDetails.setBackground(Color.WHITE);
        facultyleaveDetails.addActionListener(this);
        leaveDetails.add(facultyleaveDetails);

        JMenuItem studentleaveDetails = new JMenuItem("Student Leave Details");
        studentleaveDetails.setBackground(Color.WHITE);
        studentleaveDetails.addActionListener(this);
        leaveDetails.add(studentleaveDetails);

        // "Examination" menu
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        exam.addActionListener(this);  // Incorrectly added - JMenu doesn't directly handle ActionListener
        mb.add(exam);

        // Adding menu items for examination-related actions
        JMenuItem ExaminationDetails = new JMenuItem("Examination Results");
        ExaminationDetails.setBackground(Color.WHITE);
        ExaminationDetails.addActionListener(this);
        exam.add(ExaminationDetails);

        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.WHITE);
        EnterMarks.addActionListener(this);
        exam.add(EnterMarks);

        // "Update Details" menu
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        updateInfo.addActionListener(this);  // Incorrectly added - JMenu doesn't directly handle ActionListener
        mb.add(updateInfo);

        // Adding menu items for updating faculty and student details
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);

        // "Fee Details" menu
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        fee.addActionListener(this);  // Incorrectly added - JMenu doesn't directly handle ActionListener
        mb.add(fee);

        // Adding menu items for fee structure and student fee form
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        feeForm.addActionListener(this);
        fee.add(feeForm);

        // "Utility" menu for calculator and notepad
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        mb.add(utility);

        JMenuItem ca = new JMenuItem("Calculator");
        ca.setBackground(Color.WHITE);
        ca.addActionListener(this);
        utility.add(ca);

        JMenuItem Notepad = new JMenuItem("Notepad");
        Notepad.setBackground(Color.WHITE);
        Notepad.addActionListener(this);
        utility.add(Notepad);

        // "About" menu
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.setBackground(Color.WHITE);
        About.addActionListener(this);
        about.add(About);

        // "Exit" menu
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.WHITE);
        Exit.addActionListener(this);
        exit.add(Exit);

        // Setting the menu bar
        setJMenuBar(mb);

        // Configuring frame properties
        setSize(1540,850);
        setVisible(true);
    }

    /**
     * Handles action events for menu items.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        switch (sm) {
            case "Exit":
                System.exit(15);
                break;
            case "Calculator":
                try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception E) {
                    E.fillInStackTrace();
                }
                break;
            case "Notepad":
                try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception E) {
                    E.fillInStackTrace();
                }
                break;
            case "New Faculty Information":
                new AddFaculty();
                break;
            case "New Student Information":
                new AddStudent();
                break;
            case "View Faculty Details":
                new TeacherDetails();
                break;
            case "View Student Details":
                new StudentDetails();
                break;
            case "Faculty Leave":
                new TeacherLeave();
                break;
            case "Student Leave":
                new StudentLeave();
                break;
            case "Faculty Leave Details":
                new TeacherLeaveDetails();
                break;
            case "Student Leave Details":
                new StudentLeaveDetails();
                break;
            case "Update Faculty Details":
                new UpdateTeacher();
                break;
            case "Update Student Details":
                new updateStudent();
                break;
            case "Enter Marks":
                new EnterMarks();
                break;
            case "Examination Results":
                new ExaminationDetails();
                break;
            case "Fee Structure":
                new FeeStructure();
                break;
            case "Student Fee Form":
                new StudentFeeForm();
                break;
            case "About":
                new About();
                break;
            default:
                break;
        }
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new main_class();
    }
}

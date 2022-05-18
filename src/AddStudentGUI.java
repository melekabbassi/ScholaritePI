import javax.swing.*;
import java.sql.*;

public class AddStudentGUI extends JFrame {

    private JLabel StudentCodeLabel;
    private JLabel FirstNameLabel;
    private JLabel LastNameLabel;
    private JLabel EmailLabel;

    private JTextField StudentCodeTextField;
    private JTextField FirstNameTextField;
    private JTextField LastNameTextField;
    private JTextField EmailTextField;

    private JButton AddButton;
    private JButton CancelButton;

    public AddStudentGUI() {
        setTitle("Add Student");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(40, 50, 68));
        setResizable(false);

        StudentCodeLabel = new JLabel("Student Code");
        StudentCodeLabel.setBounds(10, 10, 100, 25);
        StudentCodeLabel.setForeground(new java.awt.Color(164, 174, 194));
        StudentCodeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        StudentCodeLabel.setBackground(new java.awt.Color(0, 0, 0));
        StudentCodeLabel.setBorder(null);
        add(StudentCodeLabel);

        StudentCodeTextField = new JTextField(20);
        StudentCodeTextField.setBounds(120, 10, 165, 25);
        add(StudentCodeTextField);

        FirstNameLabel = new JLabel("First Name");
        FirstNameLabel.setBounds(10, 60, 100, 25);
        FirstNameLabel.setForeground(new java.awt.Color(164, 174, 194));
        FirstNameLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        FirstNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        FirstNameLabel.setBorder(null);
        add(FirstNameLabel);

        FirstNameTextField = new JTextField(20);
        FirstNameTextField.setBounds(120, 60, 165, 25);
        add(FirstNameTextField);

        LastNameLabel = new JLabel("Last Name");
        LastNameLabel.setBounds(10, 110, 100, 25);
        LastNameLabel.setForeground(new java.awt.Color(164, 174, 194));
        LastNameLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        LastNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        LastNameLabel.setBorder(null);
        add(LastNameLabel);

        LastNameTextField = new JTextField(20);
        LastNameTextField.setBounds(120, 110, 165, 25);
        add(LastNameTextField);

        EmailLabel = new JLabel("Email");
        EmailLabel.setBounds(10, 160, 100, 25);
        EmailLabel.setForeground(new java.awt.Color(164, 174, 194));
        EmailLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        EmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        EmailLabel.setBorder(null);
        add(EmailLabel);

        EmailTextField = new JTextField(20);
        EmailTextField.setBounds(120, 160, 165, 25);
        add(EmailTextField);

        AddButton = new JButton("Add");
        AddButton.setBounds(90, 250, 80, 25);
        AddButton.setForeground(new java.awt.Color(34, 44, 62));
        AddButton.setFont(new java.awt.Font("Roboto", 2, 14));
        AddButton.setBackground(new java.awt.Color(42, 217, 152));
        AddButton.setBorder(null);
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(AddButton);

        // on hover change background color and text color
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButton.setForeground(new java.awt.Color(34, 44, 62));
                AddButton.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButton.setForeground(new java.awt.Color(34, 44, 62));
                AddButton.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // add action listener to the button to add Student to the database and close
        // the window
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String StudentCode = StudentCodeTextField.getText();
                String FirstName = FirstNameTextField.getText();
                String LastName = LastNameTextField.getText();
                String Email = EmailTextField.getText();
                Student student = new Student();
                student.setName(FirstNameTextField.getText());
                student.setLastname(LastNameTextField.getText());
                student.setStudentCode(Integer.parseInt(StudentCodeTextField.getText()));
                student.setEmail(EmailTextField.getText());

                if (StudentCode.equals("") || FirstName.equals("") || LastName.equals("") || Email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
                } else {
                    student.addPerson();
                    JOptionPane.showMessageDialog(null, "Student added successfully");
                    dispose();
                }
            }
        });

        CancelButton = new JButton("Cancel");
        CancelButton.setBounds(200, 250, 80, 25);
        CancelButton.setForeground(new java.awt.Color(34, 44, 62));
        CancelButton.setFont(new java.awt.Font("Roboto", 2, 14));
        CancelButton.setBackground(new java.awt.Color(42, 217, 152));
        CancelButton.setBorder(null);
        CancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(CancelButton);

        // on hover change background color and text color
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelButton.setForeground(new java.awt.Color(34, 44, 62));
                CancelButton.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelButton.setForeground(new java.awt.Color(34, 44, 62));
                CancelButton.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // add action listener to the button to close the window
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
            }
        });

        setVisible(true);
    }

}
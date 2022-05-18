import java.sql.*;

import javax.swing.*;

public class UpdateCourseGUI extends JFrame {

    private JLabel CourseCodeLabel;
    private JLabel CourseNew_codeLabel;
    private JLabel CourseNameLabel;
    private JLabel coefLabel;
    private JLabel CourseTeacher_codeLabel;

    private JTextField CourseCodeTextField;
    private JTextField CourseNew_codeTextField;
    private JTextField CourseNameTextField;
    private JTextField coefTextField;
    private JTextField CourseTeacher_codeTextField;

    private JButton UpdateButton;
    private JButton CancelButton;

    public UpdateCourseGUI() {
        setTitle("Add Course");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(40, 50, 68));
        setResizable(false);

        CourseCodeLabel = new JLabel("Course Code");
        CourseCodeLabel.setBounds(10, 10, 150, 25);
        CourseCodeLabel.setForeground(new java.awt.Color(164, 174, 194));
        CourseCodeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        CourseCodeLabel.setBackground(new java.awt.Color(0, 0, 0));
        CourseCodeLabel.setBorder(null);
        add(CourseCodeLabel);

        CourseCodeTextField = new JTextField(20);
        CourseCodeTextField.setBounds(150, 10, 165, 25);
        add(CourseCodeTextField);

        CourseNew_codeLabel = new JLabel("Course new Code");
        CourseNew_codeLabel.setBounds(10, 60, 150, 25);
        CourseNew_codeLabel.setForeground(new java.awt.Color(164, 174, 194));
        CourseNew_codeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        CourseNew_codeLabel.setBackground(new java.awt.Color(0, 0, 0));
        CourseNew_codeLabel.setBorder(null);
        add(CourseNew_codeLabel);

        CourseNew_codeTextField = new JTextField(20);
        CourseNew_codeTextField.setBounds(150, 60, 165, 25);
        add(CourseNew_codeTextField);

        CourseNameLabel = new JLabel("Course Name");
        CourseNameLabel.setBounds(10, 110, 150, 25);
        CourseNameLabel.setForeground(new java.awt.Color(164, 174, 194));
        CourseNameLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        CourseNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        CourseNameLabel.setBorder(null);
        add(CourseNameLabel);

        CourseNameTextField = new JTextField(20);
        CourseNameTextField.setBounds(150, 110, 165, 25);
        add(CourseNameTextField);

        coefLabel = new JLabel("Coef");
        coefLabel.setBounds(10, 160, 150, 25);
        coefLabel.setForeground(new java.awt.Color(164, 174, 194));
        coefLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        coefLabel.setBackground(new java.awt.Color(0, 0, 0));
        coefLabel.setBorder(null);
        add(coefLabel);

        coefTextField = new JTextField(20);
        coefTextField.setBounds(150, 160, 165, 25);
        add(coefTextField);

        CourseTeacher_codeLabel = new JLabel("Teacher Code");
        CourseTeacher_codeLabel.setBounds(10, 210, 150, 25);
        CourseTeacher_codeLabel.setForeground(new java.awt.Color(164, 174, 194));
        CourseTeacher_codeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        CourseTeacher_codeLabel.setBackground(new java.awt.Color(0, 0, 0));
        CourseTeacher_codeLabel.setBorder(null);
        add(CourseTeacher_codeLabel);

        CourseTeacher_codeTextField = new JTextField(20);
        CourseTeacher_codeTextField.setBounds(150, 210, 165, 25);
        add(CourseTeacher_codeTextField);

        UpdateButton = new JButton("Update");
        UpdateButton.setBounds(90, 260, 80, 25);
        UpdateButton.setForeground(new java.awt.Color(34, 44, 62));
        UpdateButton.setFont(new java.awt.Font("Roboto", 2, 14));
        UpdateButton.setBackground(new java.awt.Color(42, 217, 152));
        UpdateButton.setBorder(null);
        UpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(UpdateButton);

        // on hover change background color and text color
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateButton.setForeground(new java.awt.Color(34, 44, 62));
                UpdateButton.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateButton.setForeground(new java.awt.Color(34, 44, 62));
                UpdateButton.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // add action listener to the button to add Course to the database and close
        // the window
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String CourseCode = CourseCodeTextField.getText();
                String NewCourseCode = CourseNew_codeTextField.getText();
                String CourseName = CourseNameTextField.getText();
                String Coef = coefTextField.getText();
                String TeacherCode = CourseTeacher_codeTextField.getText();
                if (CourseCode.equals("") || CourseName.equals("") || Coef.equals("") || NewCourseCode.equals("")
                        || TeacherCode.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter Course code");
                } else {
                    int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this Course?");
                    if (result == JOptionPane.YES_OPTION) {
                        Course c = new Course();
                        c.setCourseID(Integer.parseInt(CourseCode));
                        c.setCourseName(CourseName);
                        c.setCoef(Coef);
                        c.updateCourse(Integer.parseInt(TeacherCode),
                                Integer.parseInt(NewCourseCode));

                        JOptionPane.showMessageDialog(null, "Course updated successfully");
                        CourseCodeTextField.setText("");
                        dispose();
                    }
                }
            }
        });

        CancelButton = new JButton("Cancel");
        CancelButton.setBounds(200, 260, 80, 25);
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
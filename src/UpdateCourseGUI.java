import java.sql.*;

import javax.swing.*;

public class UpdateCourseGUI extends JFrame {

    private JLabel CourseCodeLabel;
    private JLabel CourseNameLabel;
    private JLabel coefLabel;
    private JLabel CourseTeacher_codeLabel;
    private JLabel CourseNew_codeLabel;

    private JTextField CourseCodeTextField;
    private JTextField CourseNameTextField;
    private JTextField coefTextField;
    private JTextField CourseTeacher_codeTextField;
    private JTextField CourseNew_codeTextField;

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
        CourseCodeLabel.setBounds(10, 10, 100, 25);
        CourseCodeLabel.setForeground(new java.awt.Color(164, 174, 194));
        CourseCodeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        CourseCodeLabel.setBackground(new java.awt.Color(0, 0, 0));
        CourseCodeLabel.setBorder(null);
        add(CourseCodeLabel);

        CourseCodeTextField = new JTextField(20);
        CourseCodeTextField.setBounds(120, 10, 165, 25);
        add(CourseCodeTextField);

        CourseNameLabel = new JLabel("Course Name");
        CourseNameLabel.setBounds(10, 85, 100, 25);
        CourseNameLabel.setForeground(new java.awt.Color(164, 174, 194));
        CourseNameLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        CourseNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        CourseNameLabel.setBorder(null);
        add(CourseNameLabel);

        CourseNameTextField = new JTextField(20);
        CourseNameTextField.setBounds(120, 85, 165, 25);
        add(CourseNameTextField);

        coefLabel = new JLabel("Coef");
        coefLabel.setBounds(10, 160, 100, 25);
        coefLabel.setForeground(new java.awt.Color(164, 174, 194));
        coefLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        coefLabel.setBackground(new java.awt.Color(0, 0, 0));
        coefLabel.setBorder(null);
        add(coefLabel);

        coefTextField = new JTextField(20);
        coefTextField.setBounds(120, 160, 165, 25);
        add(coefTextField);

        CourseTeacher_codeLabel = new JLabel("Course Teacher Code");
        CourseTeacher_codeLabel.setBounds(10, 235, 100, 25);
        CourseTeacher_codeLabel.setForeground(new java.awt.Color(164, 174, 194));
        CourseTeacher_codeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        CourseTeacher_codeLabel.setBackground(new java.awt.Color(0, 0, 0));
        CourseTeacher_codeLabel.setBorder(null);
        add(CourseTeacher_codeLabel);

        CourseTeacher_codeTextField = new JTextField(20);
        CourseTeacher_codeTextField.setBounds(120, 235, 165, 25);
        add(CourseTeacher_codeTextField);

        CourseNew_codeLabel = new JLabel("Course Group Code");
        CourseNew_codeLabel.setBounds(10, 310, 100, 25);
        CourseNew_codeLabel.setForeground(new java.awt.Color(164, 174, 194));
        CourseNew_codeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        CourseNew_codeLabel.setBackground(new java.awt.Color(0, 0, 0));
        CourseNew_codeLabel.setBorder(null);
        add(CourseNew_codeLabel);

        CourseNew_codeTextField = new JTextField(20);
        CourseNew_codeTextField.setBounds(120, 310, 165, 25);
        add(CourseNew_codeTextField);

        UpdateButton = new JButton("Update");
        UpdateButton.setBounds(90, 250, 80, 25);
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
                Integer CourseCode = Integer.parseInt(CourseCodeTextField.getText());
                String CourseName = CourseNameTextField.getText();
                String Coef = coefTextField.getText();
                if (CourseCode < 1 || CourseName.equals("") || Coef.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter Course code");
                } else {
                    int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this Course?");
                    if (result == JOptionPane.YES_OPTION) {
                        Course c = new Course();
                        c.setCourseID(Integer.parseInt(CourseCodeTextField.getText()));
                        c.setCourseName(CourseNameTextField.getText());
                        c.setCoef(coefTextField.getText());
                        c.updateCourse(Integer.parseInt(CourseTeacher_codeTextField.getText()), Integer.parseInt(CourseNew_codeTextField.getText()));

                        JOptionPane.showMessageDialog(null, "Course updated successfully");
                        CourseCodeTextField.setText("");
                        dispose();
                    }
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

    private void updateCourse(int CourseCode, String CourseName, String Coef) {

        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "UPDATE person SET id= ?, CourseName=?, lastName=?, mail=?, role= ?, password=? WHERE person.id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, CourseName);
            preparedStatement.setString(3, Coef);
            preparedStatement.setString(4, "Course");
            preparedStatement.setString(5, "mouchrajel");
            preparedStatement.execute();
            preparedStatement.close();
            String sql2 = "SELECT id FROM person WHERE CourseName = ? AND lastName = ?";
            PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
            preparedStatement2.setString(1, CourseName);
            //preparedStatement2.setString(2, LastName);
            ResultSet resultSet = preparedStatement2.executeQuery();
            if (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id"));
                String sql3 = "UPDATE Course SET Course_code= ? WHERE Course.CourseID=?";
                PreparedStatement preparedStatement3 = conn.prepareStatement(sql3);
                preparedStatement3.setInt(1, id);
                preparedStatement3.setInt(2, CourseCode);
                preparedStatement3.execute();
                preparedStatement3.close();
            }
            preparedStatement2.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connexion failed!");
            System.err.println(e.getMessage());
        }
    }
}
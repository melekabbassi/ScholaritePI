import java.sql.*;

import javax.swing.*;

public class UpdateTeacherGUI extends JFrame {

    private JLabel TeacherCodeLabel;
    private JLabel NewTeacherCodeLabel;
    private JLabel FirstNameLabel;
    private JLabel LastNameLabel;
    private JLabel EmailLabel;

    private JTextField TeacherCodeTextField;
    private JTextField NewTeacherCodeTextField;
    private JTextField FirstNameTextField;
    private JTextField LastNameTextField;
    private JTextField EmailTextField;

    private JButton UpdateButton;
    private JButton CancelButton;

    public UpdateTeacherGUI() {
        setTitle("Update Teacher");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(40, 50, 68));
        setResizable(false);

        TeacherCodeLabel = new JLabel("Teacher Code");
        TeacherCodeLabel.setBounds(10, 10, 100, 25);
        TeacherCodeLabel.setForeground(new java.awt.Color(164, 174, 194));
        TeacherCodeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        TeacherCodeLabel.setBackground(new java.awt.Color(0, 0, 0));
        TeacherCodeLabel.setBorder(null);
        add(TeacherCodeLabel);

        TeacherCodeTextField = new JTextField(20);
        TeacherCodeTextField.setBounds(160, 10, 165, 25);
        add(TeacherCodeTextField);

        NewTeacherCodeLabel = new JLabel(" New Teacher Code");
        NewTeacherCodeLabel.setBounds(10, 60, 150, 25);
        NewTeacherCodeLabel.setForeground(new java.awt.Color(164, 174, 194));
        NewTeacherCodeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        NewTeacherCodeLabel.setBackground(new java.awt.Color(0, 0, 0));
        NewTeacherCodeLabel.setBorder(null);
        add(NewTeacherCodeLabel);

        NewTeacherCodeTextField = new JTextField(20);
        NewTeacherCodeTextField.setBounds(160, 60, 165, 25);
        add(NewTeacherCodeTextField);

        FirstNameLabel = new JLabel("First Name");
        FirstNameLabel.setBounds(10, 110, 100, 25);
        FirstNameLabel.setForeground(new java.awt.Color(164, 174, 194));
        FirstNameLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        FirstNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        FirstNameLabel.setBorder(null);
        add(FirstNameLabel);

        FirstNameTextField = new JTextField(20);
        FirstNameTextField.setBounds(160, 110, 165, 25);
        add(FirstNameTextField);

        LastNameLabel = new JLabel("Last Name");
        LastNameLabel.setBounds(10, 160, 100, 25);
        LastNameLabel.setForeground(new java.awt.Color(164, 174, 194));
        LastNameLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        LastNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        LastNameLabel.setBorder(null);
        add(LastNameLabel);

        LastNameTextField = new JTextField(20);
        LastNameTextField.setBounds(160, 160, 165, 25);
        add(LastNameTextField);

        EmailLabel = new JLabel("Email");
        EmailLabel.setBounds(10, 210, 100, 25);
        EmailLabel.setForeground(new java.awt.Color(164, 174, 194));
        EmailLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        EmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        EmailLabel.setBorder(null);
        add(EmailLabel);

        EmailTextField = new JTextField(20);
        EmailTextField.setBounds(160, 210, 165, 25);
        add(EmailTextField);

        UpdateButton = new JButton("Update");
        UpdateButton.setBounds(90, 280, 80, 25);
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

        // add action listener to the button to add teacher to the database and close
        // the window
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Integer TeacherCode = Integer.parseInt(TeacherCodeTextField.getText());
                Integer NewTeacherCode = Integer.parseInt(NewTeacherCodeTextField.getText());
                String FirstName = FirstNameTextField.getText();
                String LastName = LastNameTextField.getText();
                String Email = EmailTextField.getText();
                if (TeacherCode < 1 || FirstName.equals("") || LastName.equals("") || Email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter Teacher code");
                } else {
                    int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this Teacher?");
                    if (result == JOptionPane.YES_OPTION) {
                        updateTeacher(TeacherCode, NewTeacherCode, FirstName, LastName, Email);
                        JOptionPane.showMessageDialog(null, "Teacher updated successfully");
                        TeacherCodeTextField.setText("");
                        dispose();
                    }
                }
            }
        });

        CancelButton = new JButton("Cancel");
        CancelButton.setBounds(200, 280, 80, 25);
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

    private void updateTeacher(int TeacherCode, int NewTeacherCode, String FirstName, String LastName, String Email) {

        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "select teacherID from teacher where teacher_code = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, TeacherCode);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("teacherID"));
                System.out.print(id);
                String sql2 = "UPDATE teacher SET teacher_code = ? WHERE teacher.TeacherID = ?;";
                PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
                preparedStatement2.setInt(1, NewTeacherCode);
                preparedStatement2.setInt(2, id);
                preparedStatement2.execute();
                String sql3 = "UPDATE person SET firstName = ? , lastName = ? , mail = ? WHERE person.id = ?;";
                PreparedStatement preparedStatement3 = conn.prepareStatement(sql3);
                preparedStatement3.setString(1, FirstName);
                preparedStatement3.setString(2, LastName);
                preparedStatement3.setString(3, Email);
                preparedStatement3.setInt(4, id);
                preparedStatement3.execute();
                preparedStatement2.close();
                preparedStatement3.close();
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connexion failed!");
            System.err.println(e.getMessage());
        }
    }
}
import java.sql.*;

import javax.swing.*;

public class AddTeacherGUI extends JFrame {

    private JLabel TeacherCodeLabel;
    private JLabel FirstNameLabel;
    private JLabel LastNameLabel;
    private JLabel EmailLabel;

    private JTextField TeacherCodeTextField;
    private JTextField FirstNameTextField;
    private JTextField LastNameTextField;
    private JTextField EmailTextField;

    private JButton AddButton;
    private JButton CancelButton;

    public AddTeacherGUI() {
        setTitle("Add Teacher");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        TeacherCodeTextField.setBounds(120, 10, 165, 25);
        add(TeacherCodeTextField);

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

        // add action listener to the button to add teacher to the database and close
        // the window
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Integer TeacherCode = Integer.parseInt(TeacherCodeTextField.getText());
                String FirstName = FirstNameTextField.getText();
                String LastName = LastNameTextField.getText();
                String Email = EmailTextField.getText();

                if (TeacherCode < 1 || FirstName.equals("") || LastName.equals("") || Email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
                } else {
                    addTeacher(TeacherCode, FirstName, LastName, Email);
                    JOptionPane.showMessageDialog(null, "Teacher added successfully");
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

    private void addTeacher(int TeacherCode, String FirstName, String LastName, String Email) {

        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "INSERT INTO person(firstName, lastName, mail, role, password)" + " values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, FirstName);
            preparedStatement.setString(2, LastName);
            preparedStatement.setString(3, Email);
            preparedStatement.setString(4, "teacher");
            preparedStatement.setString(5, "mouchrajel");
            preparedStatement.execute();
            preparedStatement.close();
            String sql2 = "SELECT id FROM person WHERE firstName = ? AND lastName = ?";
            PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
            preparedStatement2.setString(1, FirstName);
            preparedStatement2.setString(2, LastName);
            ResultSet resultSet = preparedStatement2.executeQuery();
            if (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id"));
                String sql3 = "INSERT INTO teacher(teacherID, teacher_code)" + " VALUES (?, ?)";
                PreparedStatement preparedStatement3 = conn.prepareStatement(sql3);
                preparedStatement3.setInt(1, id);
                preparedStatement3.setInt(2, TeacherCode);
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
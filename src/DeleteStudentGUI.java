import javax.swing.*;
import java.sql.*;

public class DeleteStudentGUI extends JFrame {
    private JLabel StudentCodeLabel;

    private JTextField StudentCodeTextField;

    private JButton DeleteButton;
    private JButton CancelButton;

    public DeleteStudentGUI() {
        setTitle("Delete Student");
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

        DeleteButton = new JButton("Delete");
        DeleteButton.setBounds(90, 250, 80, 25);
        DeleteButton.setForeground(new java.awt.Color(34, 44, 62));
        DeleteButton.setFont(new java.awt.Font("Roboto", 2, 14));
        DeleteButton.setBackground(new java.awt.Color(42, 217, 152));
        DeleteButton.setBorder(null);
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(DeleteButton);

        // on hover change background color and text color
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteButton.setForeground(new java.awt.Color(34, 44, 62));
                DeleteButton.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteButton.setForeground(new java.awt.Color(34, 44, 62));
                DeleteButton.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // delete button action listener
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String code = StudentCodeTextField.getText();
                if (code.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter Teacher code");
                } else {
                    int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Teacher?");
                    if (result == JOptionPane.YES_OPTION) {
                        deleteStudent(StudentCodeTextField.getText());
                        JOptionPane.showMessageDialog(null, "Teacher deleted successfully");
                        StudentCodeTextField.setText("");
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

    private void deleteStudent(String studentCode) {

        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "select studentID from student where numINSC = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, studentCode);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("studentID"));
                System.out.print(id);
                String sql2 = "DELETE FROM student WHERE student.studentID = ?";
                PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
                preparedStatement2.setInt(1, id);
                preparedStatement2.execute();
                String sql3 = "DELETE FROM person WHERE person.id = ?";
                PreparedStatement preparedStatement3 = conn.prepareStatement(sql3);
                preparedStatement3.setInt(1, id);
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

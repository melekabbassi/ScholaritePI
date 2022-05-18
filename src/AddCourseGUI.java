import javax.swing.*;

public class AddCourseGUI extends JFrame{
        
    private JLabel CourseCodeLabel;
    private JLabel CourseNameLabel;
    private JLabel Coef;
    private JLabel CourseTeacher_code;

    private JTextField CourseCodeTextField;
    private JTextField CourseNameTextField;
    private JTextField CoefTextField;
    private JTextField CourseTeacher_codeTextField;

    private JButton AddButton;
    private JButton CancelButton;

    public AddCourseGUI(){
            setTitle("Add Course");
            setSize(400,400);
            setLayout(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            getContentPane().setBackground(new java.awt.Color(40, 50, 68));
            setResizable(false);

            CourseCodeLabel = new JLabel("Course Code");
            CourseCodeLabel.setBounds(10,10,100,25);
            CourseCodeLabel.setForeground(new java.awt.Color(164, 174, 194));
            CourseCodeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
            CourseCodeLabel.setBackground(new java.awt.Color(0, 0, 0));
            CourseCodeLabel.setBorder(null);
            add(CourseCodeLabel);

            CourseCodeTextField = new JTextField(20);
            CourseCodeTextField.setBounds(120,10,165,25);
            add(CourseCodeTextField);

            CourseNameLabel = new JLabel("Course Name");
            CourseNameLabel.setBounds(10,85,100,25);
            CourseNameLabel.setForeground(new java.awt.Color(164, 174, 194));
            CourseNameLabel.setFont(new java.awt.Font("Roboto", 2, 14));
            CourseNameLabel.setBackground(new java.awt.Color(0, 0, 0));
            CourseNameLabel.setBorder(null);
            add(CourseNameLabel);

            CourseNameTextField = new JTextField(20);
            CourseNameTextField.setBounds(120,85,165,25);
            add(CourseNameTextField);

            Coef = new JLabel("Coef");
            Coef.setBounds(10,160,100,25);
            Coef.setForeground(new java.awt.Color(164, 174, 194));
            Coef.setFont(new java.awt.Font("Roboto", 2, 14));
            Coef.setBackground(new java.awt.Color(0, 0, 0));
            Coef.setBorder(null);
            add(Coef);

            CoefTextField = new JTextField(20);
            CoefTextField.setBounds(120,160,165,25);
            add(CoefTextField);

            CourseTeacher_code = new JLabel("Teacher Code");
            CourseTeacher_code.setBounds(10,235,150,25);
            CourseTeacher_code.setForeground(new java.awt.Color(164, 174, 194));
            CourseTeacher_code.setFont(new java.awt.Font("Roboto", 2, 14));
            CourseTeacher_code.setBackground(new java.awt.Color(0, 0, 0));
            CourseTeacher_code.setBorder(null);
            add(CourseTeacher_code);

            CourseTeacher_codeTextField = new JTextField(20);
            CourseTeacher_codeTextField.setBounds(120,235,165,25);
            add(CourseTeacher_codeTextField);
            
            AddButton = new JButton("Add");
            AddButton.setBounds(90,300,80,25);
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

            // add action listener to the button to add Course to the database and close the window
            AddButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String CourseCode = CourseCodeTextField.getText();
                    String CourseName = CourseNameTextField.getText();
                    String Coef = CoefTextField.getText();

                    if(CourseCode.equals("") || CourseName.equals("") || Coef.equals("")){
                        JOptionPane.showMessageDialog(null, "Please fill all the fields");
                    }
                    else{
                        // Course Course = new Course(CourseCode, CourseName, LastName, Email);
                        // CourseListGUI.addCourse(Course);
                        Course c = new Course();
                        c.setCourseID(Integer.parseInt(CourseCode));
                        c.setCourseName(CourseName);
                        c.setCoef(Coef);
                        c.addCourse(Integer.parseInt(CourseTeacher_codeTextField.getText()));
                        JOptionPane.showMessageDialog(null, "Course added successfully");
                        dispose();
                    }
                }
            });

            CancelButton = new JButton("Cancel");
            CancelButton.setBounds(200,300,80,25);
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
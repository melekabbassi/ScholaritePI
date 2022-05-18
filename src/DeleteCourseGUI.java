import javax.swing.*;

public class DeleteCourseGUI extends JFrame{
        private JLabel CourseCodeLabel;
    
        private JTextField CourseCodeTextField;

        private JButton DeleteButton;
        private JButton CancelButton;

        public DeleteCourseGUI(){
                setTitle("Delete Course");
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

                DeleteButton = new JButton("Delete");
                DeleteButton.setBounds(90,250,80,25);
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
                        Course c = new Course();
                        c.setCourseID(Integer.parseInt(CourseCodeTextField.getText()));
                        c.deleteCourse();
                    }
                });

                CancelButton = new JButton("Cancel");
                CancelButton.setBounds(200,250,80,25);
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

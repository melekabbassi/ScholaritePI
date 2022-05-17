import javax.swing.*;

public class AbsenceListGUI extends JFrame{
    
    public AbsenceListGUI(String role) {
        setTitle("Absence List");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        // background Color
        getContentPane().setBackground(new java.awt.Color(40, 50, 68));
        
        // set window to full screen withou affecting the sideBar
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // make a side bar
        JPanel sideBar = new JPanel();
        sideBar.setBounds(0, 0, 270, 1080);
        sideBar.setBackground(new java.awt.Color(34, 44, 62));
        add(sideBar);

        // make a menu
        JPanel menu = new JPanel();
        menu.setBounds(0, 100, 270, 1080);
        menu.setBackground(new java.awt.Color(34, 44, 62));
        add(menu);

        // make a menu item
        JButton btnTeacherList = new JButton("Teacher List");
        btnTeacherList.setBounds(-30, 50, 300, 50);
        btnTeacherList.setForeground(new java.awt.Color(34, 44, 62));
        btnTeacherList.setFont(new java.awt.Font("Roboto", 2, 20));
        btnTeacherList.setBackground(new java.awt.Color(42, 217, 152));
        btnTeacherList.setBorder(null);
        btnTeacherList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnTeacherList);

        // on hover change background color and text color
        btnTeacherList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTeacherList.setForeground(new java.awt.Color(34, 44, 62));
                btnTeacherList.setBackground(new java.awt.Color(42, 217, 152));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTeacherList.setForeground(new java.awt.Color(164, 174, 194));
                btnTeacherList.setBackground(new java.awt.Color(34, 44, 62));
            }

            // on click open teacher list
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new TeacherListGUI(role);
                dispose();
            }
        });

        // make a menu item
        JButton btnGroupList = new JButton("Group List");
        btnGroupList.setBounds(-30, 100, 300, 50);
        btnGroupList.setForeground(new java.awt.Color(34, 44, 62));
        btnGroupList.setFont(new java.awt.Font("Roboto", 2, 20));
        btnGroupList.setBackground(new java.awt.Color(42, 217, 152));
        btnGroupList.setBorder(null);
        btnGroupList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnGroupList);

        // on hover change background color and text color
        btnGroupList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGroupList.setForeground(new java.awt.Color(34, 44, 62));
                btnGroupList.setBackground(new java.awt.Color(42, 217, 152));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGroupList.setForeground(new java.awt.Color(164, 174, 194));
                btnGroupList.setBackground(new java.awt.Color(34, 44, 62));
            }

            // on click open group list
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new GroupListGUI(role);
                dispose();
            }
        });

        // make a menu item
        JButton btnCourseList = new JButton("Course List");
        btnCourseList.setBounds(-30, 150, 300, 50);
        btnCourseList.setForeground(new java.awt.Color(34, 44, 62));
        btnCourseList.setFont(new java.awt.Font("Roboto", 2, 20));
        btnCourseList.setBackground(new java.awt.Color(42, 217, 152));
        btnCourseList.setBorder(null);
        btnCourseList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnCourseList);

        // on hover change background color and text color
        btnCourseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCourseList.setForeground(new java.awt.Color(34, 44, 62));
                btnCourseList.setBackground(new java.awt.Color(42, 217, 152));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCourseList.setForeground(new java.awt.Color(164, 174, 194));
                btnCourseList.setBackground(new java.awt.Color(34, 44, 62));
            }

            // on click open course list
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new CourseListGUI(role);
                dispose();
            }
        });

        // make a menu item
        JButton btnAbsenceList = new JButton("Absence List");
        btnAbsenceList.setBounds(-30, 200, 300, 50);
        btnAbsenceList.setForeground(new java.awt.Color(34, 44, 62));
        btnAbsenceList.setFont(new java.awt.Font("Roboto", 2, 20));
        btnAbsenceList.setBackground(new java.awt.Color(42, 217, 152));
        btnAbsenceList.setBorder(null);
        btnAbsenceList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnAbsenceList);       

        JButton administrationLisButton = new JButton("Administration List");
        administrationLisButton.setBounds(-30, 250, 300, 50);
        administrationLisButton.setForeground(new java.awt.Color(34, 44, 62));
        administrationLisButton.setFont(new java.awt.Font("Roboto", 2, 20));
        administrationLisButton.setBackground(new java.awt.Color(42, 217, 152));
        administrationLisButton.setBorder(null);
        administrationLisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(administrationLisButton);
        
        if(role.equals("administration")){
        	administrationLisButton.setVisible(false);
        }

        // on hover change background color and text color
        administrationLisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                administrationLisButton.setForeground(new java.awt.Color(34, 44, 62));
                administrationLisButton.setBackground(new java.awt.Color(42, 217, 152));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                administrationLisButton.setForeground(new java.awt.Color(164, 174, 194));
                administrationLisButton.setBackground(new java.awt.Color(34, 44, 62));
            }

            // on click open absence list
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new AbsenceListGUI(role);
                dispose();
            }
        });

        // make a logout button
        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(-10, 950, 280, 100);
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Roboto", 2, 20));
        btnLogout.setBackground(new java.awt.Color(40, 50, 68));
        btnLogout.setBorder(null);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnLogout);

        // on hover change background color and text color
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogout.setForeground(new java.awt.Color(34, 44, 62));
                btnLogout.setBackground(new java.awt.Color(42, 217, 152));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogout.setForeground(new java.awt.Color(164, 174, 194));
                btnLogout.setBackground(new java.awt.Color(34, 44, 62));
            }
        });

        // on click on logout button take me back to login page
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login login = new Login();
                login.setVisible(true);
                dispose();
            }
        });

        setVisible(true);
    } 
}

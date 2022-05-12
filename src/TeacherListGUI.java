import javax.swing.*;

public class TeacherListGUI extends JFrame {
    
    public TeacherListGUI() {
        setTitle("ScolaritéPi");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        // background Color 
        getContentPane().setBackground(new java.awt.Color(40, 50, 68));

        // set window to full screen withou affecting the sideBar
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        

        // make a side bar
        JPanel sideBar = new JPanel();
        sideBar.setBounds(0,0,270,1080);
        sideBar.setBackground(new java.awt.Color(34, 44, 62));
        add(sideBar);

        // make a menu
        JPanel menu = new JPanel();
        menu.setBounds(0,100,270,1080);
        menu.setBackground(new java.awt.Color(34, 44, 62));
        add(menu);
        
        // make a menu item
        JButton btnTeacherList = new JButton("Teacher List");
        btnTeacherList.setBounds(-30,50,300,50);
        btnTeacherList.setForeground(new java.awt.Color(34, 44, 62));
        btnTeacherList.setFont(new java.awt.Font("Roboto",2,20));
        btnTeacherList.setBackground(new java.awt.Color(42,217,152));
        btnTeacherList.setBorder(null);
        btnTeacherList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnTeacherList);

        JButton btnGroupList = new JButton("Group List");
        // make a menu item
        btnGroupList.setBounds(-30,100,300,50);
        btnGroupList.setForeground(new java.awt.Color(255,255,255));
        btnGroupList.setFont(new java.awt.Font("Roboto",2,20));
        btnGroupList.setBackground(new java.awt.Color(40,50,68));
        btnGroupList.setBorder(null);
        btnGroupList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnGroupList);

        // on hover change background color and text color
        btnGroupList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGroupList.setForeground(new java.awt.Color(34, 44, 62));
                btnGroupList.setBackground(new java.awt.Color(42,217,152));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGroupList.setForeground(new java.awt.Color(164, 174, 194));
                btnGroupList.setBackground(new java.awt.Color(34, 44, 62));
            }
            // on click open group list
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new GroupListGUI();
                dispose();
            }
        });

        // make a menu item
        JButton btnCourseList = new JButton("Course List");
        btnCourseList.setBounds(-30,150,300,50);
        btnCourseList.setForeground(new java.awt.Color(255,255,255));
        btnCourseList.setFont(new java.awt.Font("Roboto",2,20));
        btnCourseList.setBackground(new java.awt.Color(40,50,68));
        btnCourseList.setBorder(null);
        btnCourseList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnCourseList);
        
        // on hover change background color and text color
        btnCourseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCourseList.setForeground(new java.awt.Color(34, 44, 62));
                btnCourseList.setBackground(new java.awt.Color(42,217,152));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCourseList.setForeground(new java.awt.Color(164, 174, 194));
                btnCourseList.setBackground(new java.awt.Color(34, 44, 62));
            }
            // on click open course list
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new CourseListGUI();
                dispose();
            }
        });
   

        // make a logout button
        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(-10,950,280,100);
        btnLogout.setForeground(new java.awt.Color(255,255,255));
        btnLogout.setFont(new java.awt.Font("Roboto",2,20));
        btnLogout.setBackground(new java.awt.Color(40,50,68));
        btnLogout.setBorder(null);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnLogout);

        // on hover change background color and text color
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogout.setForeground(new java.awt.Color(34, 44, 62));
                btnLogout.setBackground(new java.awt.Color(42,217,152));
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

    }
}

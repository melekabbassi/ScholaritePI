import javax.swing.*;

public class sideBarGUI extends JFrame {

    public sideBarGUI(String role) {
        System.out.print(role);
        pack();
        setTitle("ScolaritéPi");
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
        btnTeacherList.setForeground(new java.awt.Color(164, 174, 194));
        btnTeacherList.setFont(new java.awt.Font("Roboto", 2, 20));
        btnTeacherList.setBackground(new java.awt.Color(40, 50, 68));
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
        JButton btnGroupList = new JButton("Student List");
        btnGroupList.setBounds(-30, 100, 300, 50);
        btnGroupList.setForeground(new java.awt.Color(255, 255, 255));
        btnGroupList.setFont(new java.awt.Font("Roboto", 2, 20));
        btnGroupList.setBackground(new java.awt.Color(40, 50, 68));
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
                new StudentListGUI(role);
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

        // on hover change background color and text color
        btnAbsenceList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAbsenceList.setForeground(new java.awt.Color(34, 44, 62));
                btnAbsenceList.setBackground(new java.awt.Color(42, 217, 152));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAbsenceList.setForeground(new java.awt.Color(164, 174, 194));
                btnAbsenceList.setBackground(new java.awt.Color(34, 44, 62));
            }

            // on click open absence list
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new AbsenceListGUI(role);
                dispose();
            }
        });

        JButton resultsListButton = new JButton("Results List");
        resultsListButton.setBounds(-30, 250, 300, 50);
        resultsListButton.setForeground(new java.awt.Color(34, 44, 62));
        resultsListButton.setFont(new java.awt.Font("Roboto", 2, 20));
        resultsListButton.setBackground(new java.awt.Color(42, 217, 152));
        resultsListButton.setBorder(null);
        resultsListButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(resultsListButton);
        

        // on hover change background color and text color
        resultsListButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resultsListButton.setForeground(new java.awt.Color(34, 44, 62));
                resultsListButton.setBackground(new java.awt.Color(42, 217, 152));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                resultsListButton.setForeground(new java.awt.Color(164, 174, 194));
                resultsListButton.setBackground(new java.awt.Color(34, 44, 62));
            }

            // on click open absence list
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new ResultsListGUI(role);
                dispose();
            }
        });

        JButton administrationLisButton = new JButton("Administration List");
        administrationLisButton.setBounds(-30, 300, 300, 50);
        administrationLisButton.setForeground(new java.awt.Color(34, 44, 62));
        administrationLisButton.setFont(new java.awt.Font("Roboto", 2, 20));
        administrationLisButton.setBackground(new java.awt.Color(42, 217, 152));
        administrationLisButton.setBorder(null);
        administrationLisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(administrationLisButton);

        if (role.equals("administration")) {
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
                new AdministrationListGUI(role);
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

        // make a welcome label in the center of the screen
        JLabel lblWelcome = new JLabel("Welcome");
        lblWelcome.setBounds(600, 200, 1000, 100);
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setFont(new java.awt.Font("Roboto", 2, 50));
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setVerticalAlignment(SwingConstants.CENTER);
        lblWelcome.setBackground(new java.awt.Color(40, 50, 68));
        lblWelcome.setOpaque(true);
        add(lblWelcome);

        JLabel lblName = new JLabel("<html>Scolarité<sup style='color: #2AD998'>PI</sup></html>");
        lblName.setBounds(600, 300, 1000, 100);
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Roboto", 2, 50));
        lblName.setHorizontalAlignment(SwingConstants.CENTER);
        lblName.setVerticalAlignment(SwingConstants.CENTER);
        lblName.setBackground(new java.awt.Color(40, 50, 68));
        lblName.setOpaque(true);
        add(lblName);

        JLabel lblImagePI = new JLabel();
        lblImagePI.setBounds(950, 400, 250, 250);
        lblImagePI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pi-logo.png")));
        add(lblImagePI);

        setVisible(true);
    }
}

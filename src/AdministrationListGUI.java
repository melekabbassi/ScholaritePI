import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class AdministrationListGUI extends JFrame {
    
    public AdministrationListGUI(String role) {
        setTitle("Administration List");
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

        String[] columnNames = {"AdministrationID", "First Name", "Last Name", "Email"};
        Object[][] data = { /*{"1414", "John", "Doe", "jdoe@pi.tn"},
                            { "1415", "Jane", "Doe", "jane@pi.tn"},
                            { "1416", "Johnna", "Mika", "jmika@pi.tn"},
                            { "1417", "John", "Doe", "aaa@pi.tn"},
                            { "1418", "Jane", "Doe", "aaaaaa@pi.tn"},
                            { "1419", "Johnna", "Mika", "bbbbb@pi.tn"},
                            { "1420", "John", "Doe", "aaaadddd@pi.tn"}*/
                        };

        JTable table = new JTable(data, columnNames);
        table.setBounds(290, 100, 1000, 800);
        table.setBackground(new java.awt.Color(40, 50, 68));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Roboto", 2, 20));
        table.setRowHeight(50);
        table.setEnabled(false);
        table.setShowGrid(true);
        table.setGridColor(new java.awt.Color(42, 217, 152));
        table.setFocusable(false);
        table.setRowSelectionAllowed(false);
        table.setColumnSelectionAllowed(false);
        table.setCellSelectionEnabled(false);
        table.setBorder(null);
        add(table);      

        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        scrollPane.setBounds(290, 100, 1000, 800);
        scrollPane.setBackground(new java.awt.Color(40, 50, 68));
        scrollPane.setForeground(new java.awt.Color(42, 217, 152));
        scrollPane.setFont(new java.awt.Font("Roboto", 2, 20));
        scrollPane.setBorder(null);
        add(scrollPane);

        // make a refresh button under the table
        JButton btnRefresh = new JButton("Refresh");
        btnRefresh.setBounds(290, 900, 280, 50);
        btnRefresh.setForeground(new java.awt.Color(34, 44, 62));
        btnRefresh.setFont(new java.awt.Font("Roboto", 2, 20));
        btnRefresh.setBackground(new java.awt.Color(42, 217, 152));
        btnRefresh.setBorder(null);
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnRefresh);

        // on hover change background color and text color
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRefresh.setForeground(new java.awt.Color(34, 44, 62));
                btnRefresh.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRefresh.setForeground(new java.awt.Color(34, 44, 62));
                btnRefresh.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // on click refresh the table from the database
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
                    final String USERNAME = "root";
                    final String PASSWORD = "";
                    Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    // Connected to database successfully...
                    Statement stmt = conn.createStatement();
                    String sql = "SELECT * FROM person";
                    ResultSet rs = stmt.executeQuery(sql);
                    ResultSetMetaData rsmd = rs.getMetaData();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();

                    int columnCount = rsmd.getColumnCount();
                    String[] columnNames = new String[columnCount];
                    for (int i = 0; i < columnCount; i++) {
                        columnNames[i] = rsmd.getColumnName(i + 1);
                        model.setColumnIdentifiers(columnNames);
                        String id, firstName, lastName, email, role, password;
                        while (rs.next()) {
                            id = rs.getString(1);
                            firstName = rs.getString(2);
                            lastName = rs.getString(3);
                            email = rs.getString(4);
                            role = rs.getString(5);
                            password = rs.getString(6);
                            String[] row = {id, firstName, lastName, email, role, password};
                            model.addRow(row);
                        }
                        stmt.close();
                        conn.close();
                    }

                } catch (Exception e) {
                    System.out.println("Database connexion failed!");
                    System.err.println(e.getMessage());
                }
            }
        });

        setVisible(true);
    }
}

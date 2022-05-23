import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CourseListGUI extends JFrame {

    public CourseListGUI(String role) {
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
        JButton btnGroupList = new JButton("Student List");
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

        // String[] columnNames = {"CourseID", "CourseName", "Coef", "TeacherID"};
        // Object[][] data = { { "CSCI-101", "Intro to Computer Science", "3", "1" },
        //                     { "CSCI-102", "Intro to Computer Science", "3", "1" },
        //         { "CSCI-103", "Intro to Computer Science", "3", "1" },
        //         { "CSCI-104", "Intro to Computer Science", "3", "1" },
        //         { "CSCI-105", "Intro to Computer Science", "3", "1" },
        //         { "CSCI-106", "Intro to Computer Science", "3", "1" },
        //         { "CSCI-107", "Intro to Computer Science", "3", "1" },
        //         { "CSCI-108", "Intro to Computer Science", "3", "1" }
        // };

        JTable table = populateTable();

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
                

        // make a table header
        JLabel lblTableHeader = new JLabel("Course List");
        lblTableHeader.setBounds(290, 50, 900, 50);
        lblTableHeader.setForeground(new java.awt.Color(164, 174, 194));
        lblTableHeader.setFont(new java.awt.Font("Roboto", 2, 30));
        lblTableHeader.setBackground(new java.awt.Color(0, 0, 0));
        lblTableHeader.setBorder(null);
        add(lblTableHeader);

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
                table.setVisible(false);
                JTable t2 = populateTable();
                t2.setBounds(290, 100, 1000, 800);
                t2.setBackground(new java.awt.Color(40, 50, 68));
                t2.setForeground(new java.awt.Color(255, 255, 255));
                t2.setFont(new java.awt.Font("Roboto", 2, 20));
                t2.setRowHeight(50);
                t2.setEnabled(false);
                t2.setShowGrid(true);
                t2.setGridColor(new java.awt.Color(42, 217, 152));
                t2.setFocusable(false);
                t2.setRowSelectionAllowed(false);
                t2.setColumnSelectionAllowed(false);
                t2.setCellSelectionEnabled(false);
                t2.setBorder(null);
                add(t2);

                JScrollPane scrollPane = new JScrollPane(t2);
                table.setFillsViewportHeight(true);
                scrollPane.setBounds(290, 100, 1000, 800);
                scrollPane.setBackground(new java.awt.Color(40, 50, 68));
                scrollPane.setForeground(new java.awt.Color(42, 217, 152));
                scrollPane.setFont(new java.awt.Font("Roboto", 2, 20));
                scrollPane.setBorder(null);
                add(scrollPane);
            }
        });

        // make a search bar
        JTextField txtSearch = new JTextField();
        txtSearch.setBounds(1450, 150, 280, 50);
        txtSearch.setForeground(new java.awt.Color(34, 44, 62));
        txtSearch.setFont(new java.awt.Font("Roboto", 2, 20));
        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(null);
        txtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(txtSearch);

        // make a search button
        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(1450, 200, 280, 50);
        btnSearch.setForeground(new java.awt.Color(34, 44, 62));
        btnSearch.setFont(new java.awt.Font("Roboto", 2, 20));
        btnSearch.setBackground(new java.awt.Color(42, 217, 152));
        btnSearch.setBorder(null);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnSearch);

        // on hover change background color and text color
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearch.setForeground(new java.awt.Color(34, 44, 62));
                btnSearch.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearch.setForeground(new java.awt.Color(34, 44, 62));
                btnSearch.setBackground(new java.awt.Color(42, 217, 152));
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table.setVisible(false);
                String value = txtSearch.getText();
                JTable tab = SearchInTabe(value);
                tab.setBounds(290, 100, 1000, 800);
                tab.setBackground(new java.awt.Color(40, 50, 68));
                tab.setForeground(new java.awt.Color(255, 255, 255));
                tab.setFont(new java.awt.Font("Roboto", 2, 20));
                tab.setRowHeight(50);
                tab.setEnabled(false);
                tab.setShowGrid(true);
                tab.setGridColor(new java.awt.Color(42, 217, 152));
                tab.setFocusable(false);
                tab.setRowSelectionAllowed(false);
                tab.setColumnSelectionAllowed(false);
                tab.setCellSelectionEnabled(false);
                tab.setBorder(null);
                add(tab);

                JScrollPane scrollPane = new JScrollPane(tab);
                table.setFillsViewportHeight(true);
                scrollPane.setBounds(290, 100, 1000, 800);
                scrollPane.setBackground(new java.awt.Color(40, 50, 68));
                scrollPane.setForeground(new java.awt.Color(42, 217, 152));
                scrollPane.setFont(new java.awt.Font("Roboto", 2, 20));
                scrollPane.setBorder(null);
                add(scrollPane);
            }
        });

        // make add button
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(1450, 350, 280, 100);
        btnAdd.setForeground(new java.awt.Color(34, 44, 62));
        btnAdd.setFont(new java.awt.Font("Roboto", 2, 20));
        btnAdd.setBackground(new java.awt.Color(42, 217, 152));
        btnAdd.setBorder(null);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnAdd);

        // on hover change background color and text color
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdd.setForeground(new java.awt.Color(34, 44, 62));
                btnAdd.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdd.setForeground(new java.awt.Color(34, 44, 62));
                btnAdd.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // on click open add teacher page
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new AddCourseGUI();
            }
        });

        // make a delete button
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(1450, 550, 280, 100);
        btnDelete.setForeground(new java.awt.Color(34, 44, 62));
        btnDelete.setFont(new java.awt.Font("Roboto", 2, 20));
        btnDelete.setBackground(new java.awt.Color(42, 217, 152));
        btnDelete.setBorder(null);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnDelete);

        // on hover change background color and text color
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelete.setForeground(new java.awt.Color(34, 44, 62));
                btnDelete.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelete.setForeground(new java.awt.Color(34, 44, 62));
                btnDelete.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // on click open delete teacher page
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new DeleteCourseGUI();
            }
        });

        // make a update button

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBounds(1450, 750, 280, 100);
        btnUpdate.setForeground(new java.awt.Color(34, 44, 62));
        btnUpdate.setFont(new java.awt.Font("Roboto", 2, 20));
        btnUpdate.setBackground(new java.awt.Color(42, 217, 152));
        btnUpdate.setBorder(null);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnUpdate);

        // on hover change background color and text color
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdate.setForeground(new java.awt.Color(34, 44, 62));
                btnUpdate.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdate.setForeground(new java.awt.Color(34, 44, 62));
                btnUpdate.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // on click open update teacher page
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new UpdateCourseGUI();
            }
        });
        setVisible(true);
    }

    public JTable populateTable() {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = { "Course ID", "Course Name", "Coef", "Teacher ID", "Teacher Name" };
        model.setColumnIdentifiers(columnNames);
        JTable table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);

        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            String sql = "select * from courses";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String id = rs.getString("courseID");
                String cn = rs.getString("courseName");
                String coef = rs.getString("coef");
                String tcd = rs.getString("teacher_code");
                String tnm = rs.getString("name");
                model.addRow(new Object[] { id, cn, coef, tcd, tnm });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return table;
    }

    public JTable SearchInTabe(String value) {
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = { "Course ID", "Course Name", "Coef", "Teacher ID", "Teacher Name"};
        model.setColumnIdentifiers(columnNames);
        JTable table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);

        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            String sql = "select * from courses where courseName = ? or name = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, value);
            ps.setString(2, value);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("courseID");
                String cn = rs.getString("courseName");
                String coef = rs.getString("coef");
                String tcd = rs.getString("teacher_code");
                String tnm = rs.getString("name");
                model.addRow(new Object[] { id, cn, coef, tcd, tnm });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return table;
    }
}
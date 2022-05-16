import javax.swing.*;

public class TeacherListGUI extends JFrame {
    
    public TeacherListGUI() {
        setTitle("ScolaritéPi");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);
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

        // make a table 
        JTable table = new JTable();
        table.setBounds(290,100,1000,800);
        // make table transparent and color its borders
        table.setOpaque(false);
        table.setShowGrid(true);
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42,217,152)));
        table.setForeground(new java.awt.Color(255,255,255));
        table.setFont(new java.awt.Font("Roboto",2,20));
        table.setRowHeight(50);
        table.setRowSelectionAllowed(false);
        table.setFocusable(false);
        add(table);

        // make a table header
        JLabel lblTableHeader = new JLabel("Teacher List");
        lblTableHeader.setBounds(290,50,900,50);
        lblTableHeader.setForeground(new java.awt.Color(164, 174, 194));
        lblTableHeader.setFont(new java.awt.Font("Roboto",2,30));
        lblTableHeader.setBackground(new java.awt.Color(0,0,0));
        lblTableHeader.setBorder(null);
        add(lblTableHeader);


        // make a search bar
        JTextField txtSearch = new JTextField();
        txtSearch.setBounds(1450,150,280,50);
        txtSearch.setForeground(new java.awt.Color(34, 44, 62));
        txtSearch.setFont(new java.awt.Font("Roboto",2,20));
        txtSearch.setBackground(new java.awt.Color(255,255,255));
        txtSearch.setBorder(null);
        txtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(txtSearch);

        // make a search button
        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(1450,200,280,50);
        btnSearch.setForeground(new java.awt.Color(34, 44, 62));
        btnSearch.setFont(new java.awt.Font("Roboto",2,20));
        btnSearch.setBackground(new java.awt.Color(42,217,152));
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
                btnSearch.setBackground(new java.awt.Color(42,217,152));
            }
        });

        // on click search teacher
        // btnSearch.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         String search = txtSearch.getText();
        //         try {
        //             String sql = "SELECT * FROM teacher WHERE name LIKE '%"+search+"%'";
        //             pst = conn.prepareStatement(sql);
        //             rs = pst.executeQuery();
        //             table.setModel(DbUtils.resultSetToTableModel(rs));
        //         } catch (Exception e) {
        //             JOptionPane.showMessageDialog(null, e);
        //         }
        //     }
        // });

        // make add button
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(1450,350,280,100);
        btnAdd.setForeground(new java.awt.Color(34, 44, 62));
        btnAdd.setFont(new java.awt.Font("Roboto",2,20));
        btnAdd.setBackground(new java.awt.Color(42,217,152));
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
                btnAdd.setBackground(new java.awt.Color(42,217,152));
            }
        });

        // on click open add teacher page
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //new AddTeacherGUI();
                dispose();
            }
        });

        // make a delete button
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(1450,550,280,100);
        btnDelete.setForeground(new java.awt.Color(34, 44, 62));
        btnDelete.setFont(new java.awt.Font("Roboto",2,20));
        btnDelete.setBackground(new java.awt.Color(42,217,152));
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
                btnDelete.setBackground(new java.awt.Color(42,217,152));
            }
        });

        // on click open delete teacher page
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //new DeleteTeacherGUI();
                dispose();
            }
        });

        // make a update button

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBounds(1450,750,280,100);
        btnUpdate.setForeground(new java.awt.Color(34, 44, 62));
        btnUpdate.setFont(new java.awt.Font("Roboto",2,20));
        btnUpdate.setBackground(new java.awt.Color(42,217,152));
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
                btnUpdate.setBackground(new java.awt.Color(42,217,152));
            }
        });

        // on click open update teacher page
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //new UpdateTeacherGUI();
                dispose();
            }
        });
    }
}

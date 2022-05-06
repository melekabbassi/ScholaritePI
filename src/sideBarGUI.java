import javax.swing.*;
import javax.swing.border.Border;

import java.sql.*;

public class sideBarGUI extends JFrame {
    
    public sideBarGUI() {
        setTitle("ScolaritéPi");
        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //setSize(1080,600);
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        // background Color 
        getContentPane().setBackground(new java.awt.Color(40, 50, 68));

        // make a side bar
        JPanel sideBar = new JPanel();
        sideBar.setBounds(0,0,270,720);
        sideBar.setBackground(new java.awt.Color(34, 44, 62));
        add(sideBar);

        // make a menu
        JPanel menu = new JPanel();
        menu.setBounds(0,100,270,600);
        menu.setBackground(new java.awt.Color(34, 44, 62));
        add(menu);
        
        // make a menu item
        JButton btnTeacherList = new JButton("Teacher List");
        btnTeacherList.setBounds(-30,50,300,50);
        btnTeacherList.setForeground(new java.awt.Color(164, 174, 194));
        btnTeacherList.setFont(new java.awt.Font("Roboto",2,20));
        btnTeacherList.setBackground(new java.awt.Color(40,50,68));
        btnTeacherList.setBorder(null);
        btnTeacherList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnTeacherList);

        // on hover change background color and text color
        btnTeacherList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTeacherList.setForeground(new java.awt.Color(34, 44, 62));
                btnTeacherList.setBackground(new java.awt.Color(42,217,152));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTeacherList.setForeground(new java.awt.Color(164, 174, 194));
                btnTeacherList.setBackground(new java.awt.Color(34, 44, 62));
            }
        });

        // make a menu item
        JButton btnStudentList = new JButton("Group List");
        btnStudentList.setBounds(-30,100,300,50);
        btnStudentList.setForeground(new java.awt.Color(255,255,255));
        btnStudentList.setFont(new java.awt.Font("Roboto",2,20));
        btnStudentList.setBackground(new java.awt.Color(40,50,68));
        btnStudentList.setBorder(null);
        btnStudentList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnStudentList);

        // on hover change background color and text color
        btnStudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStudentList.setForeground(new java.awt.Color(34, 44, 62));
                btnStudentList.setBackground(new java.awt.Color(42,217,152));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStudentList.setForeground(new java.awt.Color(164, 174, 194));
                btnStudentList.setBackground(new java.awt.Color(34, 44, 62));
            }
        });

        // make a menu item
        JButton btnClassList = new JButton("Course List");
        btnClassList.setBounds(-30,150,300,50);
        btnClassList.setForeground(new java.awt.Color(255,255,255));
        btnClassList.setFont(new java.awt.Font("Roboto",2,20));
        btnClassList.setBackground(new java.awt.Color(40,50,68));
        btnClassList.setBorder(null);
        btnClassList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnClassList);

        // on hover change background color and text color
        btnClassList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClassList.setForeground(new java.awt.Color(34, 44, 62));
                btnClassList.setBackground(new java.awt.Color(42,217,152));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClassList.setForeground(new java.awt.Color(164, 174, 194));
                btnClassList.setBackground(new java.awt.Color(34, 44, 62));
            }
        });
   

        // make a logout button
        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(-10,575,280,100);
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

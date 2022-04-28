import javax.swing.*;
import javax.swing.border.Border;

public class Login extends JFrame{

    private JLabel lblAppName;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JLabel lblImage;
    private JButton btnIncorrectPassword;
    
    public Login(){
        setTitle("ScolaritéPi");
        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1080,600);
        setLocationRelativeTo(null);
        //setResizable(false);
        // background Color 
        getContentPane().setBackground(new java.awt.Color(40,50,68));

        lblAppName = new JLabel("<html>Scolarité<sup style='color: #2AD998'>PI</sup></html>");
        lblAppName.setBounds(700,100,300,50);
        lblAppName.setForeground(new java.awt.Color(255,255,255));
        lblAppName.setFont(new java.awt.Font("Roboto",2,20));
        add(lblAppName);

        txtUsername = new JTextField();
        txtUsername.setBounds(600, 210, 300, 50);
        add(txtUsername);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(600,270,300,50);
        add(txtPassword);

        btnIncorrectPassword = new JButton("Incorrect Password");
        btnIncorrectPassword.setBounds(600,305,300,50);
        btnIncorrectPassword.setForeground(new java.awt.Color(42,217,152));
        // transparent Background
        btnIncorrectPassword.setContentAreaFilled(false);
        btnIncorrectPassword.setBorderPainted(false);
        btnIncorrectPassword.setFont(new java.awt.Font("Roboto",2,10));
        // change cursor when mouse is on the button
        btnIncorrectPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnIncorrectPassword);
        

        btnLogin = new JButton("Login");
        btnLogin.setBounds(600,390,300,50);
        btnLogin.setBorder(null);
        //change background color when mouse is over
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogin.setBackground(new java.awt.Color(42,217,152));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogin.setBackground(new java.awt.Color(55,202,147));
            }
        });

        //change background color when mouse is clicked
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin.setBackground(new java.awt.Color(42,217,152));
            }
        });
        btnLogin.setForeground(new java.awt.Color(40,50,68));
        Border border = BorderFactory.createEmptyBorder(50,50,50,50);
        btnLogin.setBorder(border);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnLogin);

        lblImage = new JLabel();
        lblImage.setBounds(0,0,300,600);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new-york.jpg")));
        add(lblImage);
    }
    
    public static void main(String[] args){
        new Login();
    }   
}
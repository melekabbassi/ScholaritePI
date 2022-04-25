import javax.swing.*;
import javax.swing.border.Border;

public class Login extends JFrame{

    private JLabel lblAppName;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JLabel lblImage;
    
    public Login(){
        setTitle("ScolaritéPi");
        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1080,600);
        setLocationRelativeTo(null);
        setResizable(false);
        // background Color 
        getContentPane().setBackground(new java.awt.Color(40,50,68));

        // lblImage = new JLabel(new ImageIcon("src/images/new-york-gcf16cbb69_1920.jpg"));
        // lblImage.setBounds(0,0,300,300);
        // add(lblImage);

        lblAppName = new JLabel("ScolaritéPI");
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

        btnLogin = new JButton("Login");
        btnLogin.setBounds(600,390,300,50);
        btnLogin.setBorder(null);
        btnLogin.setBackground(new java.awt.Color(42,217,152));
        btnLogin.setForeground(new java.awt.Color(40,50,68));
        Border border = BorderFactory.createEmptyBorder(50,50,50,50);
        btnLogin.setBorder(border);
        add(btnLogin);
    }
    
    public static void main(String[] args){
        new Login();
    }   
}
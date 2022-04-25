import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame{

    private JLabel lblAppName;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnForgotPassword;
    private JButton btnLogin;
    
    public Login(){
        setTitle("ScolaritéPi");
        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        lblAppName = new JLabel("ScolaritéPi");
        lblAppName.setBounds(250,10,100,20);
        add(lblAppName);

        txtUsername = new JTextField();
        txtUsername.setBounds(200, 30, 200, 50);
        add(txtUsername);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(200,90,200,50);
        add(txtPassword);

        // btnForgotPassword = new JButton("Mot de passe oublié");
        // btnForgotPassword.setBounds(350,150,100,50);
        // btnLogin.setBackground(new java.awt.Color(42,217,152));
        // btnLogin.setForeground(new java.awt.Color(40,50,68));
        // add(btnForgotPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(250,150,100,50);
        btnLogin.setBorder(null);
        btnLogin.setBackground(new java.awt.Color(42,217,152));
        btnLogin.setForeground(new java.awt.Color(40,50,68));

        add(btnLogin);

    }
    
    public static void main(String[] args){
        new Login();
    }   
}
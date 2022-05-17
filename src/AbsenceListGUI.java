import javax.swing.JFrame;

public class AbsenceListGUI extends JFrame{
    
    public AbsenceListGUI(String role) {
        setTitle("Administration List");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        // background Color
        getContentPane().setBackground(new java.awt.Color(40, 50, 68));
        
        // set window to full screen withou affecting the sideBar
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }    
}

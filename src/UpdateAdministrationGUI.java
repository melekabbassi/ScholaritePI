import javax.swing.*;

public class UpdateAdministrationGUI extends JFrame {

    private JLabel AdministrationCodeLabel;
    private JLabel NewAdministrationCodeLabel;
    private JLabel FirstNameLabel;
    private JLabel LastNameLabel;
    private JLabel EmailLabel;

    private JTextField AdministrationCodeTextField;
    private JTextField NewAdministrationCodeTextField;
    private JTextField FirstNameTextField;
    private JTextField LastNameTextField;
    private JTextField EmailTextField;

    private JButton UpdateButton;
    private JButton CancelButton;

    public UpdateAdministrationGUI() {
        setTitle("Update Administration");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(40, 50, 68));
        setResizable(false);

        AdministrationCodeLabel = new JLabel("Administration Code");
        AdministrationCodeLabel.setBounds(10, 10, 100, 25);
        AdministrationCodeLabel.setForeground(new java.awt.Color(164, 174, 194));
        AdministrationCodeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        AdministrationCodeLabel.setBackground(new java.awt.Color(0, 0, 0));
        AdministrationCodeLabel.setBorder(null);
        add(AdministrationCodeLabel);

        AdministrationCodeTextField = new JTextField(20);
        AdministrationCodeTextField.setBounds(160, 10, 165, 25);
        add(AdministrationCodeTextField);

        NewAdministrationCodeLabel = new JLabel(" New Administration Code");
        NewAdministrationCodeLabel.setBounds(10, 60, 150, 25);
        NewAdministrationCodeLabel.setForeground(new java.awt.Color(164, 174, 194));
        NewAdministrationCodeLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        NewAdministrationCodeLabel.setBackground(new java.awt.Color(0, 0, 0));
        NewAdministrationCodeLabel.setBorder(null);
        add(NewAdministrationCodeLabel);

        NewAdministrationCodeTextField = new JTextField(20);
        NewAdministrationCodeTextField.setBounds(160, 60, 165, 25);
        add(NewAdministrationCodeTextField);

        FirstNameLabel = new JLabel("First Name");
        FirstNameLabel.setBounds(10, 110, 100, 25);
        FirstNameLabel.setForeground(new java.awt.Color(164, 174, 194));
        FirstNameLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        FirstNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        FirstNameLabel.setBorder(null);
        add(FirstNameLabel);

        FirstNameTextField = new JTextField(20);
        FirstNameTextField.setBounds(160, 110, 165, 25);
        add(FirstNameTextField);

        LastNameLabel = new JLabel("Last Name");
        LastNameLabel.setBounds(10, 160, 100, 25);
        LastNameLabel.setForeground(new java.awt.Color(164, 174, 194));
        LastNameLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        LastNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        LastNameLabel.setBorder(null);
        add(LastNameLabel);

        LastNameTextField = new JTextField(20);
        LastNameTextField.setBounds(160, 160, 165, 25);
        add(LastNameTextField);

        EmailLabel = new JLabel("Email");
        EmailLabel.setBounds(10, 210, 100, 25);
        EmailLabel.setForeground(new java.awt.Color(164, 174, 194));
        EmailLabel.setFont(new java.awt.Font("Roboto", 2, 14));
        EmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        EmailLabel.setBorder(null);
        add(EmailLabel);

        EmailTextField = new JTextField(20);
        EmailTextField.setBounds(160, 210, 165, 25);
        add(EmailTextField);

        UpdateButton = new JButton("Update");
        UpdateButton.setBounds(90, 280, 80, 25);
        UpdateButton.setForeground(new java.awt.Color(34, 44, 62));
        UpdateButton.setFont(new java.awt.Font("Roboto", 2, 14));
        UpdateButton.setBackground(new java.awt.Color(42, 217, 152));
        UpdateButton.setBorder(null);
        UpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(UpdateButton);

        // on hover change background color and text color
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateButton.setForeground(new java.awt.Color(34, 44, 62));
                UpdateButton.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateButton.setForeground(new java.awt.Color(34, 44, 62));
                UpdateButton.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // add action listener to the button to add Administration to the database and close
        // the window
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Administration t = new Administration();
                t.setName(FirstNameTextField.getText());
                t.setLastname(LastNameTextField.getText());
                t.setEmail(EmailTextField.getText());
                t.setAdminisCode(Integer.parseInt(AdministrationCodeTextField.getText()));
                String NewAdministrationCode = NewAdministrationCodeTextField.getText();
                String AdministrationCode = AdministrationCodeTextField.getText();
                String FirstName = FirstNameTextField.getText();
                String LastName = LastNameTextField.getText();
                String Email = EmailTextField.getText();
                if (AdministrationCode.equals("") || NewAdministrationCode.equals("") || FirstName.equals("") || LastName.equals("")
                        || Email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter Administration code");
                } else {
                    int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this Administration?");
                    if (result == JOptionPane.YES_OPTION) {
                        int newCode = Integer.parseInt(NewAdministrationCode);
                        t.updatePerson(newCode);
                        JOptionPane.showMessageDialog(null, "Administration updated successfully");
                        AdministrationCodeTextField.setText("");
                        dispose();
                    }
                }
            }
        });

        CancelButton = new JButton("Cancel");
        CancelButton.setBounds(200, 280, 80, 25);
        CancelButton.setForeground(new java.awt.Color(34, 44, 62));
        CancelButton.setFont(new java.awt.Font("Roboto", 2, 14));
        CancelButton.setBackground(new java.awt.Color(42, 217, 152));
        CancelButton.setBorder(null);
        CancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(CancelButton);

        // on hover change background color and text color
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelButton.setForeground(new java.awt.Color(34, 44, 62));
                CancelButton.setBackground(new java.awt.Color(50, 220, 194));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelButton.setForeground(new java.awt.Color(34, 44, 62));
                CancelButton.setBackground(new java.awt.Color(42, 217, 152));
            }
        });

        // add action listener to the button to close the window
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
            }
        });

        setVisible(true);

    }
}
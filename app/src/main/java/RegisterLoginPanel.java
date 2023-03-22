import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterLoginPanel extends JPanel {
    public RegisterLoginPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel loginLabel = new JLabel("아이디: ");
        this.add(loginLabel);

        JTextField loginTextField = new JTextField(30);
        this.add(loginTextField);

        JLabel registerLabel = new JLabel("비밀번호: ");
        this.add(registerLabel);

        JTextField registerTextField = new JTextField(30);
        this.add(registerTextField);

        JButton loginButton = new JButton("로그인");
        this.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = loginTextField.getText();
                String password = new String(registerTextField.getText());

                JOptionPane.showMessageDialog(null, "아이디: " + id + ", 비밀번호: " + password);
            }
        });

        JButton registerButton = new JButton("회원가입");
        this.add(registerButton);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterPanel registerPanel = new RegisterPanel();
                showContentPanel(registerPanel);

                new RegisterPanel();
            }
        });
    }

    public void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }

}

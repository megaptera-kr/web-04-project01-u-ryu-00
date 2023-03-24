import models.Token;
import models.User;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import java.util.List;

public class RegisterLoginPanel extends JPanel {
    public RegisterLoginPanel(List<User> users, List<Token> tokens) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel idLabel = new JLabel("아이디: ");
        this.add(idLabel);

        JTextField idTextField = new JTextField(30);
        this.add(idTextField);

        JLabel passwordLabel = new JLabel("비밀번호: ");
        this.add(passwordLabel);

        JTextField passwordTextField = new JTextField(30);
        this.add(passwordTextField);

        JButton loginButton = new JButton("로그인");
        this.add(loginButton);

        loginButton.addActionListener((event) -> {
            for (User user : users) {
                if (idTextField.getText().equals(user.getId()) && passwordTextField.getText().equals(user.getPassword())) {
                    JOptionPane.showMessageDialog(null, "로그인 성공!");
                    Token token = new Token(idTextField.getText());
                    tokens.add(token);
                    this.removeAll();
                    this.setVisible(false);
                    this.setVisible(true);
                }
            }
            idTextField.setText("");
            passwordTextField.setText("");
        });

        JButton registerButton = new JButton("회원가입");
        this.add(registerButton);

        registerButton.addActionListener((event) -> {
            User user = new User(idTextField.getText(), passwordTextField.getText());
            users.add(user);

            idTextField.setText("");
            passwordTextField.setText("");
        });
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RegisterLoginPanel extends JPanel {
    public RegisterLoginPanel(List<User> users) {
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
            if (users.size() == 0) {
                JOptionPane.showMessageDialog(null, "회원가입을 먼저 해주세요!");
            }
//            if (idTextField.getText().equals(user.getId()) && passwordTextField.getText().equals(user.getPassword())) {
//                JOptionPane.showMessageDialog(null, "로그인 성공!");
//            }
//            if (!idTextField.getText().equals(user.getId()) || !passwordTextField.getText().equals(user.getPassword())) {
//                JOptionPane.showMessageDialog(null, "로그인 실패!");
//            }
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

    public void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }

}

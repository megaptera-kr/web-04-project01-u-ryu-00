import javax.swing.*;

public class RegisterPanel extends JPanel {
    RegisterPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel idLabel = new JLabel("아이디: ");
        this.add(idLabel);

        JTextField idTextField = new JTextField(30);
        this.add(idTextField);

        JLabel passwordLabel = new JLabel("비밀번호: ");
        this.add(passwordLabel);

        JTextField passwordTextField = new JTextField(30);
        this.add(passwordTextField);

        JButton passwordButton = new JButton("회원가입");
        this.add(passwordButton);
        passwordButton.addActionListener((event)->{
            this.removeAll();
            RegisterLoginPanel registerLoginPanel = new RegisterLoginPanel();
            this.add(registerLoginPanel);

            this.setVisible(false);
            this.setVisible(true);
        });
    }

}

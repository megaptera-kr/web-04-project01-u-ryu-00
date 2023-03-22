//import javax.swing.*;
//import java.util.List;
//
//public class RegisterPanel extends JPanel {
//    RegisterPanel(List<User> users) {
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//
//        JLabel idLabel = new JLabel("아이디: ");
//        this.add(idLabel);
//
//        JTextField idTextField = new JTextField(30);
//        this.add(idTextField);
//
//        JLabel passwordLabel = new JLabel("비밀번호: ");
//        this.add(passwordLabel);
//
//        JTextField passwordTextField = new JTextField(30);
//        this.add(passwordTextField);
//
//        JButton passwordButton = new JButton("회원가입");
//        this.add(passwordButton);
//        passwordButton.addActionListener((event) -> {
//            User user = new User(idTextField.getText(), passwordTextField.getText());
//            users.add(user);
//
//            this.removeAll();
//            RegisterLoginPanel registerLoginPanel = new RegisterLoginPanel();
//            this.add(registerLoginPanel);
//
//            this.setVisible(false);
//            this.setVisible(true);
//        });
//    }
//}

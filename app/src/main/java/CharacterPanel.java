import models.Book;
import models.Character;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.util.List;

public class CharacterPanel extends JPanel {
    CharacterPanel(List<Book> books) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel howManyBooksLabel = new JLabel("총 " + books.size() + "권의 책을 읽으셨습니다.");
        this.add(howManyBooksLabel);

        if (books.size() < 3) {
            Character character = new Character("도톨이");
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 " + character.getName());
            this.add(characterLabel);
        }

        if (books.size() >= 3 && books.size() < 6) {
            Character character = new Character("병뚜껑");
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 " + character.getName());
            this.add(characterLabel);
        }

        if (books.size() >= 6 && books.size() < 10) {
            Character character = new Character("왕귤");
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 " + character.getName());
            this.add(characterLabel);
        }

        if (books.size() >= 10 && books.size() < 15) {
            Character character = new Character("머그컵");
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 " + character.getName());
            this.add(characterLabel);
        }

        if (books.size() >= 15 && books.size() < 20) {
            Character character = new Character("복숭아");
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 " + character.getName());
            this.add(characterLabel);
        }

        if (books.size() >= 20 && books.size() < 25) {
            Character character = new Character("찐고구마");
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 " + character.getName());
            this.add(characterLabel);
        }

        if (books.size() >= 25 && books.size() < 30) {
            Character character = new Character("식빵이");
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 " + character.getName());
            this.add(characterLabel);
        }

        if (books.size() >= 30) {
            Character character = new Character("아이패드");
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 " + character.getName());
            this.add(characterLabel);
        }

        JButton acornButton = new JButton("1. 도톨이");
        this.add(acornButton);
        acornButton.addActionListener((acornEvent) -> {
            JPanel acornPanel = new JPanel();
            acornPanel.setLayout(new BoxLayout(acornPanel, BoxLayout.Y_AXIS));
            JLabel acornLabel = new JLabel("나는 도톨이");
            acornPanel.add(acornLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/도톨이.jpg");
            JLabel label = new JLabel();
            label.setIcon(icon);
            acornPanel.add(label);

            showContentPanel(acornPanel);
        });

        JButton bottleCapButton = new JButton("2. 병뚜껑");
        this.add(bottleCapButton);
        bottleCapButton.addActionListener((acornEvent) -> {
            JPanel bottleCapPanel = new JPanel();
            bottleCapPanel.setLayout(new BoxLayout(bottleCapPanel, BoxLayout.Y_AXIS));
            JLabel bottleCapLabel = new JLabel("나는 병뚜껑");
            bottleCapPanel.add(bottleCapLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/병뚜껑.jpg");
            JLabel label = new JLabel();
            label.setIcon(icon);
            bottleCapPanel.add(label);

            showContentPanel(bottleCapPanel);
        });


        JButton tangerineButton = new JButton("3. 왕귤");
        this.add(tangerineButton);
        tangerineButton.addActionListener((tangerineEvent) -> {
            JPanel tangerinePanel = new JPanel();
            tangerinePanel.setLayout(new BoxLayout(tangerinePanel, BoxLayout.Y_AXIS));
            JLabel tangerineLabel = new JLabel("나는 왕귤");
            tangerinePanel.add(tangerineLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/왕귤.jpg");
            JLabel label = new JLabel();
            label.setIcon(icon);
            tangerinePanel.add(label);

            showContentPanel(tangerinePanel);
        });


        JButton mugButton = new JButton("4. 머그컵");
        this.add(mugButton);
        mugButton.addActionListener((mugEvent) -> {
            JPanel mugPanel = new JPanel();
            mugPanel.setLayout(new BoxLayout(mugPanel, BoxLayout.Y_AXIS));
            JLabel mugLabel = new JLabel("나는 머그컵");
            mugPanel.add(mugLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/머그컵.jpg");
            JLabel label = new JLabel();
            label.setIcon(icon);
            mugPanel.add(label);

            showContentPanel(mugPanel);
        });

        JButton peachButton = new JButton("5. 복숭아");
        this.add(peachButton);
        peachButton.addActionListener((peachEvent) -> {
            JPanel peachPanel = new JPanel();
            peachPanel.setLayout(new BoxLayout(peachPanel, BoxLayout.Y_AXIS));
            JLabel peachLabel = new JLabel("나는 복숭아");
            peachPanel.add(peachLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/복숭아.jpg");
            JLabel label = new JLabel();
            label.setIcon(icon);
            peachPanel.add(label);

            showContentPanel(peachPanel);
        });

        JButton sweetPotatoButton = new JButton("6. 찐고구마");
        this.add(sweetPotatoButton);
        sweetPotatoButton.addActionListener((sweetPotatoEvent) -> {
            JPanel sweetPotatoPanel = new JPanel();
            sweetPotatoPanel.setLayout(new BoxLayout(sweetPotatoPanel, BoxLayout.Y_AXIS));
            JLabel sweetPotatoLabel = new JLabel("나는 찐고구마");
            sweetPotatoPanel.add(sweetPotatoLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/찐고구마.jpg");
            JLabel label = new JLabel();
            label.setIcon(icon);
            sweetPotatoPanel.add(label);

            showContentPanel(sweetPotatoPanel);
        });

        JButton breadButton = new JButton("7. 식빵이");
        this.add(breadButton);
        breadButton.addActionListener((breadEvent) -> {
            JPanel breadPanel = new JPanel();
            breadPanel.setLayout(new BoxLayout(breadPanel, BoxLayout.Y_AXIS));
            JLabel breadLabel = new JLabel("나는 식빵이");
            breadPanel.add(breadLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/식빵이.jpg");
            JLabel label = new JLabel();
            label.setIcon(icon);
            breadPanel.add(label);

            showContentPanel(breadPanel);
        });
        JButton iPadButton = new JButton("8. 아이패드");
        this.add(iPadButton);
        iPadButton.addActionListener((iPadEvent) -> {
            JPanel iPadPanel = new JPanel();
            iPadPanel.setLayout(new BoxLayout(iPadPanel, BoxLayout.Y_AXIS));
            JLabel iPadLabel = new JLabel("나는 아이패드");
            iPadPanel.add(iPadLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/아이패드.jpg");
            JLabel label = new JLabel();
            label.setIcon(icon);
            iPadPanel.add(label);

            showContentPanel(iPadPanel);
        });
    }

    public void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }
}

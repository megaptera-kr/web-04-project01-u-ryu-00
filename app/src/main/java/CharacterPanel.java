import javax.swing.*;
import java.util.List;

public class CharacterPanel extends JPanel {
    CharacterPanel(List<Book> books) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel howManyBooksLabel = new JLabel("총 " + books.size() + "권의 책을 읽으셨습니다.");
        this.add(howManyBooksLabel);

        if (books.size() < 3) {
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 도톨이");
            this.add(characterLabel);
        }

        if (books.size() >= 3 && books.size() < 6) {
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 병뚜껑");
            this.add(characterLabel);
        }

        if (books.size() >= 6 && books.size() < 10) {
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 왕귤");
            this.add(characterLabel);
        }

        if (books.size() >= 10 && books.size() < 15) {
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 머그컵");
            this.add(characterLabel);
        }

        if (books.size() >= 15 && books.size() < 20) {
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 복숭아");
            this.add(characterLabel);
        }

        if (books.size() >= 20 && books.size() < 25) {
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 찐고구마");
            this.add(characterLabel);
        }

        if (books.size() >= 25 && books.size() < 30) {
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 식빵이");
            this.add(characterLabel);
        }

        if (books.size() >= 30) {
            JLabel characterLabel = new JLabel("현재 나의 캐릭터는 아이패드");
            this.add(characterLabel);
        }

        JButton acornButton = new JButton("1. 도톨이");
        this.add(acornButton);
        acornButton.addActionListener((acornEvent) -> {
            JPanel acornPanel = new JPanel();
            acornPanel.setLayout(new BoxLayout(acornPanel, BoxLayout.Y_AXIS));
            JLabel acornLabel = new JLabel("도톨이입니다.");
            acornPanel.add(acornLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/IMG_0147.jpg");
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
            JLabel bottleCapLabel = new JLabel("병뚜껑입니다.");
            bottleCapPanel.add(bottleCapLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/IMG_0148.jpg");
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
            JLabel tangerineLabel = new JLabel("왕귤입니다.");
            tangerinePanel.add(tangerineLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/IMG_0149.jpg");
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
            JLabel mugLabel = new JLabel("머그컵입니다.");
            mugPanel.add(mugLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/IMG_0150.jpg");
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
            JLabel peachLabel = new JLabel("복숭아입니다.");
            peachPanel.add(peachLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/IMG_0151.jpg");
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
            JLabel sweetPotatoLabel = new JLabel("찐고구마입니다.");
            sweetPotatoPanel.add(sweetPotatoLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/IMG_0152.jpg");
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
            JLabel breadLabel = new JLabel("식빵이입니다.");
            breadPanel.add(breadLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/IMG_0153.jpg");
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
            JLabel iPadLabel = new JLabel("아이패드입니다.");
            iPadPanel.add(iPadLabel);

            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/IMG_0154.jpg");
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

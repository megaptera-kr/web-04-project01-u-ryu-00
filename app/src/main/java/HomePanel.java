import javax.swing.*;
import java.util.List;
import java.awt.Image;


public class HomePanel extends JPanel {
    HomePanel(List<Book> books) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel howManyBooksLabel = new JLabel("총 " + books.size() + "권의 책을 읽으셨습니다.");
        this.add(howManyBooksLabel);

        JButton recordButton = new JButton("읽은 책 기록하기");
        this.add(recordButton);
        recordButton.addActionListener((event) -> {
            JPanel recordPanel = new JPanel();
            recordPanel.setLayout(new BoxLayout(recordPanel, BoxLayout.Y_AXIS));
            JLabel titleLabel = new JLabel("책 제목 : ");
            JTextField titleTextField = new JTextField(30);
            JLabel authorLabel = new JLabel("지은이 : ");
            JTextField authorTextField = new JTextField(10);
            JLabel publisherLabel = new JLabel("출판사 : ");
            JTextField publisherTextField = new JTextField(10);
            JLabel pageLabel = new JLabel("페이지 : ");
            JTextField pageTextField = new JTextField(5);
            JLabel aboutTheBookLabel = new JLabel("책 소개 : ");
            JTextField aboutTheBookTextField = new JTextField(30);
            JLabel favoritesLabel = new JLabel("즐겨찾기 : ");
            JCheckBox favoritesCheckBox = new JCheckBox();
            JLabel memoLabel = new JLabel("메모 : ");
            JTextField memoTextField = new JTextField(30);
            JButton saveButton = new JButton("저장");
            saveButton.addActionListener((saveEvent) -> {
                Book book = new Book(titleTextField.getText(), authorTextField.getText(), publisherTextField.getText(), Integer.parseInt(pageTextField.getText()),
                        aboutTheBookTextField.getText(), favoritesCheckBox.isSelected(), memoTextField.getText());
                books.add(book);
                titleTextField.setText("");
                authorTextField.setText("");
                publisherTextField.setText("");
                pageTextField.setText("");
                aboutTheBookTextField.setText("");
                favoritesCheckBox.setSelected(false);
                memoTextField.setText("");
            });
            recordPanel.add(titleLabel);
            recordPanel.add(titleTextField);
            recordPanel.add(authorLabel);
            recordPanel.add(authorTextField);
            recordPanel.add(publisherLabel);
            recordPanel.add(publisherTextField);
            recordPanel.add(pageLabel);
            recordPanel.add(pageTextField);
            recordPanel.add(aboutTheBookLabel);
            recordPanel.add(aboutTheBookTextField);
            recordPanel.add(favoritesLabel);
            recordPanel.add(favoritesCheckBox);
            recordPanel.add(memoLabel);
            recordPanel.add(memoTextField);
            recordPanel.add(saveButton);

            showContentPanel(recordPanel);
        });

        JButton recommendedBooksButton = new JButton("도톨이들을 위한 독서입문서");
        this.add(recommendedBooksButton);
        recommendedBooksButton.addActionListener((event) -> {
            JPanel recommendedBooksPanel = new JPanel();
            recommendedBooksPanel.setLayout(new BoxLayout(recommendedBooksPanel, BoxLayout.Y_AXIS));
            JLabel recommendedBooksLabel = new JLabel("도톨이들을 위한 추천 도서 목록");
            JLabel firstBooksLabel = new JLabel("1. 책은 도끼다");
            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/9788956055466.jpg");
            Image image = icon.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(image);
            JLabel firstImageLabel = new JLabel();
            firstImageLabel.setIcon(scaledIcon);

            JLabel secondBooksLabel = new JLabel("2. 마흔의 서재");
            ImageIcon icon2 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/21420099.jpg");
            Image image2 = icon2.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon2 = new ImageIcon(image2);
            JLabel secondImageLabel = new JLabel();
            secondImageLabel.setIcon(scaledIcon2);

            JLabel thirdBooksLabel = new JLabel("3. 나는 문학으로 생각한다");
            ImageIcon icon3 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/java/XL.jpeg");
            Image image3 = icon3.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon3 = new ImageIcon(image3);
            JLabel thirdImageLabel = new JLabel();
            thirdImageLabel.setIcon(scaledIcon3);

            recommendedBooksPanel.add(recommendedBooksLabel);
            recommendedBooksPanel.add(firstBooksLabel);
            recommendedBooksPanel.add(firstImageLabel);

            recommendedBooksPanel.add(secondBooksLabel);
            recommendedBooksPanel.add(secondImageLabel);

            recommendedBooksPanel.add(thirdBooksLabel);
            recommendedBooksPanel.add(thirdImageLabel);

            showContentPanel(recommendedBooksPanel);
        });
    }

    public void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }
}

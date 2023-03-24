import models.Book;
import models.RecommendedBook;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.*;
import java.util.List;

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
            RecommendedBook recommendedBook = new RecommendedBook("책은 도끼다");
            JLabel firstBooksLabel = new JLabel("1. " + recommendedBook.getTitle());
            ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/책은도끼다.jpg");
            Image image = icon.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(image);
            JLabel firstImageLabel = new JLabel();
            firstImageLabel.setIcon(scaledIcon);

            RecommendedBook recommendedBook2 = new RecommendedBook("마흔의 서재");
            JLabel secondBooksLabel = new JLabel("2. " + recommendedBook2.getTitle());
            ImageIcon icon2 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/마흔의서재.jpg");
            Image image2 = icon2.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon2 = new ImageIcon(image2);
            JLabel secondImageLabel = new JLabel();
            secondImageLabel.setIcon(scaledIcon2);

            RecommendedBook recommendedBook3 = new RecommendedBook("나는 문학으로 생각한다");
            JLabel thirdBooksLabel = new JLabel("3. " + recommendedBook3.getTitle());
            ImageIcon icon3 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/나는문학으로생각한다.jpeg");
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

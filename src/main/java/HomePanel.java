import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class HomePanel extends JPanel {
    private List<String> titles = new ArrayList<>();

    HomePanel() {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

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
                titleTextField.getText();
                titles.add(titleTextField.getText());
                for (int i = 0; i < titles.size(); i += 1) {
                    JLabel saveLabel = new JLabel(titles.get(i));
                    recordPanel.add(saveLabel);
                    System.out.println(titles.get(i));
                }
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
            JLabel secondBooksLabel = new JLabel("2. 마흔의 서재");
            JLabel thirdBooksLabel = new JLabel("3. 나는 문학으로 생각한다");
            recommendedBooksPanel.add(recommendedBooksLabel);
            recommendedBooksPanel.add(firstBooksLabel);
            recommendedBooksPanel.add(secondBooksLabel);
            recommendedBooksPanel.add(thirdBooksLabel);
            showContentPanel(recommendedBooksPanel);
        });
    }

    private void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }
}

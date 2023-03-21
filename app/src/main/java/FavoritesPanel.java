import javax.swing.*;
import java.util.List;

public class FavoritesPanel extends JPanel {
    public FavoritesPanel(List<Book> books) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        for (Book book : books) {
            if(book.getFavorites()){
                JButton titleButton = new JButton(book.getTitle());
                this.add(titleButton);
                titleButton.addActionListener((event) -> {
                    JPanel bookInformationPanel = new JPanel();
                    this.add(bookInformationPanel);
                    bookInformationPanel.setLayout(new BoxLayout(bookInformationPanel, BoxLayout.Y_AXIS));
                    JLabel titleLabel = new JLabel("책 제목 : " + book.getTitle());
                    bookInformationPanel.add(titleLabel);
                    JLabel authorLabel = new JLabel("지은이 : " + book.getAuthor());
                    bookInformationPanel.add(authorLabel);
                    JLabel publisherLabel = new JLabel("출판사 : " + book.getPublisher());
                    bookInformationPanel.add(publisherLabel);
                    JLabel pageLabel = new JLabel("페이지 : " + book.getPage());
                    bookInformationPanel.add(pageLabel);
                    JLabel aboutTheBookLabel = new JLabel("책 소개 : " + book.getAboutTheBook());
                    bookInformationPanel.add(aboutTheBookLabel);
                    JLabel favoritesLabel = new JLabel("즐겨찾기 : " + book.getFavorites());
                    bookInformationPanel.add(favoritesLabel);
                    JLabel memoLabel = new JLabel("메모 : " + book.getMemo());
                    bookInformationPanel.add(memoLabel);

                    showContentPanel(bookInformationPanel);
                });
            }
        }
    }
    public void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }
}

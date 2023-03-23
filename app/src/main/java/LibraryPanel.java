import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.List;

public class LibraryPanel extends JPanel {

    public LibraryPanel(List<Book> books) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        for (Book book : books) {
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

                JButton deleteButton = new JButton("삭제");
                bookInformationPanel.add(deleteButton);
                deleteButton.addActionListener((deleteEvent) -> {
                    books.remove(book);

                    this.removeAll();
                    LibraryPanel libraryPanel = new LibraryPanel(books);
                    this.add(libraryPanel);

                    this.setVisible(false);
                    this.setVisible(true);
                });

                JButton editButton = new JButton("수정");
                bookInformationPanel.add(editButton);
                editButton.addActionListener((deleteEvent) -> {
                    JOptionPane.showMessageDialog(null, "삭제 버튼을 눌러 기록을 삭제한 후 홈 화면으로 이동해서 수정한 책 정보를 다시 등록해주세요.");
                });

                showContentPanel(bookInformationPanel);
            });
        }
    }

    public void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }
}

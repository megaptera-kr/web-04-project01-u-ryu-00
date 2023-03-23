import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.List;

public class BookReportPanel extends JPanel {
    public BookReportPanel(List<Book> books) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for (Book book : books) {
            JButton titleButton = new JButton(book.getTitle());
            this.add(titleButton);
            titleButton.addActionListener((event) -> {
                JPanel bookInformationPanel = new JPanel();
                this.add(bookInformationPanel);
                bookInformationPanel.setLayout(new BoxLayout(bookInformationPanel, BoxLayout.Y_AXIS));
                JLabel memoLabel = new JLabel("메모 : " + book.getMemo());
                bookInformationPanel.add(memoLabel);

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

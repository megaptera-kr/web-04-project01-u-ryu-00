import javax.swing.*;
import java.awt.*;


public class Reading {

    private JFrame frame;
    private JPanel contentPanel;

    public static void main(String[] args) {
        Reading application = new Reading();
        application.run();
    }

    private void run() {
        frame = new JFrame("Reading");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        initMenu();
        initContentPanel();

        frame.setVisible(true);
    }

    public void initMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel, BorderLayout.PAGE_START);

        panel.add(createHomeButton());
        panel.add(createLibraryButton());
        panel.add(createCharacterButton());
        panel.add(createBookReportButton());
        panel.add(createFavoritesButton());
    }

    public JButton createHomeButton() {
        JButton button = new JButton("홈");
        button.addActionListener(event -> {
            JPanel homePanel = new HomePanel();
            showContentPanel(homePanel);
        });
        return button;
    }

    public JButton createLibraryButton() {
        JButton button = new JButton("서재");
        button.addActionListener(event -> {
            JPanel libraryPanel = new LibraryPanel();
            showContentPanel(libraryPanel);
        });
        return button;
    }

    public JButton createCharacterButton() {
        JButton button = new JButton("캐릭터");
        button.addActionListener(event -> {
            JPanel characterPanel = new CharacterPanel();
            showContentPanel(characterPanel);
        });
        return button;
    }

    public JButton createBookReportButton() {
        JButton button = new JButton("기록");
        button.addActionListener(event -> {
            JPanel bookReportPanel = new BookReportPanel();
            showContentPanel(bookReportPanel);
        });
        return button;
    }

    public JButton createFavoritesButton() {
        JButton button = new JButton("즐겨찾기");
        button.addActionListener(event -> {
            JPanel favoritesPanel = new FavoritesPanel();
            showContentPanel(favoritesPanel);
        });
        return button;
    }


    public void initContentPanel() {
        contentPanel = new JPanel();
        frame.add(contentPanel);
    }

    public void showContentPanel(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel);

        contentPanel.setVisible(false);
        contentPanel.setVisible(true);

        frame.setVisible(true);
    }
}



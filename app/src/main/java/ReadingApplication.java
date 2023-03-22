import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadingApplication {
    private JFrame frame;
    private JPanel contentPanel;

    private List<Book> books = new ArrayList<>();
    private List<Review> firstStoreReviews = new ArrayList<>();
    private List<Review> secondStoreReviews = new ArrayList<>();

    public static void main(String[] args) {
        ReadingApplication application = new ReadingApplication();
        application.run();
    }

    public void run() {
        frame = new JFrame("ReadingApplication");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 800);
        frame.setLocationRelativeTo(null);

        initMenu();
        initContentPanel();

        loadBooksData();
        loadFirstStoreReviewsData();
        loadSecondStoreReviewsData();

        frame.setVisible(true);

        Runtime.getRuntime().addShutdownHook(new Thread(this::saveBooksData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveFirstStoreReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveSecondStoreReviewData));
    }

    public void initMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel, BorderLayout.PAGE_START);

        panel.add(createCrowdedButton());
        panel.add(createRegisterLoginButton());
        panel.add(createHomeButton());
        panel.add(createLibraryButton());
        panel.add(createCharacterButton());
        panel.add(createBookReportButton());
        panel.add(createFavoritesButton());
    }

    public JButton createCrowdedButton() {
        JButton button = new JButton("북적북적");
        button.addActionListener(event -> {
            JPanel crowdedPanel = new CrowdedPanel(firstStoreReviews, secondStoreReviews);
            showContentPanel(crowdedPanel);
        });
        return button;
    }

    public JButton createRegisterLoginButton() {
        JButton button = new JButton("로그인 / 회원가입");
        button.addActionListener(event -> {
            JPanel registerLoginPanel = new RegisterLoginPanel();
            showContentPanel(registerLoginPanel);
        });
        return button;
    }

    public JButton createHomeButton() {
        JButton button = new JButton("홈");
        button.addActionListener(event -> {
            JPanel homePanel = new HomePanel(books);
            showContentPanel(homePanel);
        });
        return button;
    }

    public JButton createLibraryButton() {
        JButton button = new JButton("서재");
        button.addActionListener(event -> {
            JPanel libraryPanel = new LibraryPanel(books);
            showContentPanel(libraryPanel);
        });
        return button;
    }

    public JButton createCharacterButton() {
        JButton button = new JButton("캐릭터");
        button.addActionListener(event -> {
            JPanel characterPanel = new CharacterPanel(books);
            showContentPanel(characterPanel);
        });
        return button;
    }

    public JButton createBookReportButton() {
        JButton button = new JButton("기록");
        button.addActionListener(event -> {
            JPanel bookReportPanel = new BookReportPanel(books);
            showContentPanel(bookReportPanel);
        });
        return button;
    }

    public JButton createFavoritesButton() {
        JButton button = new JButton("즐겨찾기");
        button.addActionListener(event -> {
            JPanel favoritesPanel = new FavoritesPanel(books);
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

    public void saveBooksData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("books.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFirstStoreReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("firstStoreReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(firstStoreReviews);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveSecondStoreReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("secondStoreReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(secondStoreReviews);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void loadBooksData() {
        try {
            File file = new File("books.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                books = (List<Book>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadFirstStoreReviewsData() {
        try {
            File file = new File("firstStoreReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                firstStoreReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void loadSecondStoreReviewsData() {
        try {
            File file = new File("secondStoreReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                secondStoreReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

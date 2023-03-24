import models.Book;
import models.Menu;
import models.Review;
import models.Token;
import models.User;

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
    private List<User> users = new ArrayList<>();
    private List<Token> tokens = new ArrayList<>();

    private List<Review> firstStoreReviews = new ArrayList<>();
    private List<Review> secondStoreReviews = new ArrayList<>();
    private List<Review> proofReviews = new ArrayList<>();
    private List<Review> nightReviews = new ArrayList<>();
    private List<Review> moneyReviews = new ArrayList<>();
    private List<Review> lossReviews = new ArrayList<>();
    private List<Review> seinoReviews = new ArrayList<>();
    private List<Review> fatherReviews = new ArrayList<>();
    private List<Review> backingReviews = new ArrayList<>();
    private List<Review> workReviews = new ArrayList<>();


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
        loadProofReviewsData();
        loadNightReviewsData();
        loadMoneyReviewsData();
        loadLossReviewsData();
        loadSeinoReviewsData();
        loadFatherReviewsData();
        loadBackingReviewsData();
        loadWorkReviewsData();

        frame.setVisible(true);

        Runtime.getRuntime().addShutdownHook(new Thread(this::saveBooksData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveFirstStoreReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveSecondStoreReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveProofReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveNightReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveMoneyReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveLossReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveSeinoReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveFatherReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveBackingReviewData));
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveWorkReviewData));
    }

    public void initMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel, BorderLayout.PAGE_START);
        panel.setBackground(Color.pink);

        panel.add(createCrowdedButton());
        panel.add(createRegisterLoginButton());
        panel.add(createHomeButton());
        panel.add(createLibraryButton());
        panel.add(createCharacterButton());
        panel.add(createBookReportButton());
        panel.add(createFavoritesButton());
    }

    public JButton createCrowdedButton() {
        models.Menu menu = new models.Menu("북적북적");
        JButton button = new JButton(menu.getMenu());
        button.addActionListener(event -> {
            JPanel crowdedPanel = new CrowdedPanel(firstStoreReviews, secondStoreReviews, proofReviews, nightReviews, moneyReviews, lossReviews, seinoReviews, fatherReviews, backingReviews, workReviews);
            showContentPanel(crowdedPanel);
        });
        return button;
    }

    public JButton createRegisterLoginButton() {
        models.Menu menu = new models.Menu("로그인 / 회원가입");
        JButton button = new JButton(menu.getMenu());
        button.addActionListener(event -> {
            JPanel registerLoginPanel = new RegisterLoginPanel(users, tokens);
            showContentPanel(registerLoginPanel);
        });
        return button;
    }

    public JButton createHomeButton() {
        models.Menu menu = new models.Menu("홈");
        JButton button = new JButton(menu.getMenu());
        button.addActionListener(event -> {
            if (tokens.size() == 0) {
                JOptionPane.showMessageDialog(null, "접근 권한이 없습니다.");
            }
            if (tokens.size() != 0) {
                JPanel homePanel = new HomePanel(books);
                showContentPanel(homePanel);
            }
        });
        return button;
    }

    public JButton createLibraryButton() {
        models.Menu menu = new models.Menu("서재");
        JButton button = new JButton(menu.getMenu());
        button.addActionListener(event -> {
            if (tokens.size() == 0) {
                JOptionPane.showMessageDialog(null, "접근 권한이 없습니다.");
            }
            if (tokens.size() != 0) {
                JPanel libraryPanel = new LibraryPanel(books);
                showContentPanel(libraryPanel);
            }
        });
        return button;
    }

    public JButton createCharacterButton() {
        models.Menu menu = new models.Menu("캐릭터");
        JButton button = new JButton(menu.getMenu());
        button.addActionListener(event -> {
            if (tokens.size() == 0) {
                JOptionPane.showMessageDialog(null, "접근 권한이 없습니다.");
            }
            if (tokens.size() != 0) {
                JPanel characterPanel = new CharacterPanel(books);
                showContentPanel(characterPanel);
            }
        });
        return button;
    }

    public JButton createBookReportButton() {
        models.Menu menu = new models.Menu("기록");
        JButton button = new JButton(menu.getMenu());
        button.addActionListener(event -> {
            if (tokens.size() == 0) {
                JOptionPane.showMessageDialog(null, "접근 권한이 없습니다.");
            }
            if (tokens.size() != 0) {
                JPanel bookReportPanel = new BookReportPanel(books);
                showContentPanel(bookReportPanel);
            }
        });
        return button;
    }

    public JButton createFavoritesButton() {
        models.Menu menu = new Menu("즐겨찾기");
        JButton button = new JButton(menu.getMenu());
        button.addActionListener(event -> {
            if (tokens.size() == 0) {
                JOptionPane.showMessageDialog(null, "접근 권한이 없습니다.");
            }
            if (tokens.size() != 0) {
                JPanel favoritesPanel = new FavoritesPanel(books);
                showContentPanel(favoritesPanel);
            }
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

    public void saveProofReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("proofReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(proofReviews);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveNightReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("nightReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(nightReviews);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveMoneyReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("moneyReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(moneyReviews);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveLossReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("lossReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(lossReviews);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveSeinoReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("seinoReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(seinoReviews);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFatherReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("fatherReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(fatherReviews);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveBackingReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("backingReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(backingReviews);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveWorkReviewData() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("workReview.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(workReviews);
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

    public void loadProofReviewsData() {
        try {
            File file = new File("proofReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                proofReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadNightReviewsData() {
        try {
            File file = new File("nightReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                nightReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadMoneyReviewsData() {
        try {
            File file = new File("moneyReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                moneyReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadLossReviewsData() {
        try {
            File file = new File("lossReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                lossReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadSeinoReviewsData() {
        try {
            File file = new File("seinoReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                seinoReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadFatherReviewsData() {
        try {
            File file = new File("fatherReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                fatherReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadBackingReviewsData() {
        try {
            File file = new File("backingReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                backingReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadWorkReviewsData() {
        try {
            File file = new File("workReview.csv");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                workReviews = (List<Review>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

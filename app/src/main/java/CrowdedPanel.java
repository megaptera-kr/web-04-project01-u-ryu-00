import org.checkerframework.checker.units.qual.C;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.*;
import java.util.List;

public class CrowdedPanel extends JPanel {

    private final JPanel contentPanel;

    public CrowdedPanel(List<Review> firstStoreReviews, List<Review> secondStoreReviews, List<Review> proofReviews, List<Review> nightReviews, List<Review> moneyReviews, List<Review> lossReviews, List<Review> seinoReviews, List<Review> fatherReviews, List<Review> backingReviews, List<Review> workReviews) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBackground(Color.white);
        this.add(topPanel);
        JLabel searchLabel = new JLabel("검색 : ");
        topPanel.add(searchLabel);
        JTextField searchTextField = new JTextField(10);
        topPanel.add(searchTextField);
        JButton searchButton = new JButton("검색");
        topPanel.add(searchButton);
        searchButton.addActionListener((event) -> {
            if (searchTextField.getText().equals("불편한 편의점 1")) {
                showFirstStoreReview(firstStoreReviews);
            }
            if (searchTextField.getText().equals("불편한 편의점 2")) {
                showSecondStoreReview(secondStoreReviews);
            }
            if (searchTextField.getText().equals("구의 증명")) {
                showProofReview(proofReviews);
            }
            if (searchTextField.getText().equals("긴긴밤")) {
                showNightReview(nightReviews);
            }
            if (searchTextField.getText().equals("돈의 속성")) {
                showMoneyReview(moneyReviews);
            }
            if (searchTextField.getText().equals("상실의 기쁨")) {
                showLossReview(lossReviews);
            }
            if (searchTextField.getText().equals("세이노의 가르침")) {
                showSeinoReview(seinoReviews);
            }
            if (searchTextField.getText().equals("아버지의 해방일지")) {
                showFatherReview(fatherReviews);
            }
            if (searchTextField.getText().equals("역행자")) {
                showBackingReview(backingReviews);
            }
            if (searchTextField.getText().equals("일머리 문해력")) {
                showWorkReview(workReviews);
            }
        });

        JLabel label = new JLabel("이번 달 베스트셀러 TOP 10! 같이 읽고 토론해볼까요?");
        topPanel.add(label);

        contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 5));
        this.add(contentPanel);
        ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/불편한 편의점1.jpg");
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JButton button = new JButton("불편한 편의점 1", scaledIcon);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button);
        button.addActionListener((event) -> {
            showFirstStoreReview(firstStoreReviews);
        });

        ImageIcon icon2 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/불편한 편의점2.jpg");
        Image image2 = icon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
        JButton button2 = new JButton("불편한 편의점 2", scaledIcon2);
        button2.setVerticalTextPosition(SwingConstants.BOTTOM);
        button2.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button2);
        button2.addActionListener((event) -> {
            showSecondStoreReview(secondStoreReviews);
        });


        ImageIcon icon3 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/구의증명.jpg");
        Image image3 = icon3.getImage();
        Image scaledImage3 = image3.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(scaledImage3);
        JButton button3 = new JButton("구의 증명", scaledIcon3);
        button3.setVerticalTextPosition(SwingConstants.BOTTOM);
        button3.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button3);
        button3.addActionListener((event) -> {
            showProofReview(proofReviews);
        });

        ImageIcon icon4 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/긴긴밤.jpg");
        Image image4 = icon4.getImage();
        Image scaledImage4 = image4.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);
        JButton button4 = new JButton("긴긴밤", scaledIcon4);
        button4.setVerticalTextPosition(SwingConstants.BOTTOM);
        button4.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button4);
        button4.addActionListener((event) -> {
            showNightReview(nightReviews);
        });


        ImageIcon icon5 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/돈의속성.jpg");
        Image image5 = icon5.getImage();
        Image scaledImage5 = image5.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);
        JButton button5 = new JButton("돈의 속성", scaledIcon5);
        button5.setVerticalTextPosition(SwingConstants.BOTTOM);
        button5.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button5);
        button5.addActionListener((event) -> {
            showMoneyReview(moneyReviews);
        });

        ImageIcon icon6 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/상실의기쁨.jpg");
        Image image6 = icon6.getImage();
        Image scaledImage6 = image6.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(scaledImage6);
        JButton button6 = new JButton("상실의 기쁨", scaledIcon6);
        button6.setVerticalTextPosition(SwingConstants.BOTTOM);
        button6.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button6);
        button6.addActionListener((event) -> {
            showLossReview(lossReviews);
        });

        ImageIcon icon7 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/세이노의가르침.jpg");
        Image image7 = icon7.getImage();
        Image scaledImage7 = image7.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon(scaledImage7);
        JButton button7 = new JButton("세이노의 가르침", scaledIcon7);
        button7.setVerticalTextPosition(SwingConstants.BOTTOM);
        button7.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button7);
        button7.addActionListener((event) -> {
            showSeinoReview(seinoReviews);
        });

        ImageIcon icon8 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/아버지의해방일지.jpg");
        Image image8 = icon8.getImage();
        Image scaledImage8 = image8.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8 = new ImageIcon(scaledImage8);
        JButton button8 = new JButton("아버지의 해방일지", scaledIcon8);
        button8.setVerticalTextPosition(SwingConstants.BOTTOM);
        button8.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button8);
        button8.addActionListener((event) -> {
            showFatherReview(fatherReviews);
        });

        ImageIcon icon9 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/역행자.jpg");
        Image image9 = icon9.getImage();
        Image scaledImage9 = image9.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon9 = new ImageIcon(scaledImage9);
        JButton button9 = new JButton("역행자", scaledIcon9);
        button9.setVerticalTextPosition(SwingConstants.BOTTOM);
        button9.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button9);
        button9.addActionListener((event) -> {
            showBackingReview(backingReviews);
        });

        ImageIcon icon10 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/일머리문해력.jpg");
        Image image10 = icon10.getImage();
        Image scaledImage10 = image10.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon10 = new ImageIcon(scaledImage10);
        JButton button10 = new JButton("일머리 문해력", scaledIcon10);
        button10.setVerticalTextPosition(SwingConstants.BOTTOM);
        button10.setHorizontalTextPosition(SwingConstants.CENTER);
        contentPanel.add(button10);
        button10.addActionListener((event) -> {
            showWorkReview(workReviews);
        });
    }

    public void showWorkReview(List<Review> workReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("일머리 문해력 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2023년 02월 28일 " + "<br>쪽수: 320쪽" + "<br>책 소개: 챗GPT라는 생성형 인공지능의 등장에 전 세계의 이목이 쏠리고 있다." + "<br>어려운 질문에도 답을 척척 내놓고, 소설이나 광고카피도 술술 써내는 인공지능으로 인해" + "<br>주식 시장이 요동치고 내 일자리는 과연 무사할지 걱정의 목소리도 높아졌다." + "<br>그런데 아이러니하게도 챗GPT의 등장으로 인해 인공지능이 따라올 수 없는 인간의 능력이 주목받고 있다." + "<br>바로 '문해력'이다. [일머리 문해력]은 그중에서도 직장이나 비즈니스 상황 등 사회생활에서 필요한 문해력을 키우는 법을 알려주는 책이다." + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/일머리문해력.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("일머리 문해력", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("일머리 문해력 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : workReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            workReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showBackingReview(List<Review> backingReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("역행자 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2022년 05월 30일 " + "<br>쪽수: 314쪽" + "<br>책 소개: 단 20편의 영상으로 10만 구독자를 넘어서며 화제를 모았던 라이프해커 자청의 첫 책이다." + "<br>가난을 넘어 경제적 자유와 행복을 얻기까지 저자가 찾아낸 7단계의 성공 원리를 담고 있다." + "<br>고정관념을 넘어 인생을 레벨업하고 싶다면 저자의 성공 방식을 만나고 실행해 보자." + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/역행자.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("역행자", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("역행자 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : backingReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            backingReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showFatherReview(List<Review> fatherReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("아버지의 해방일지 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2022년 09월 02일 " + "<br>쪽수: 268쪽" + "<br>책 소개: (죽음에서 시작하는 삶의 이야기) '아버지가 죽었다.'는 문장으로 소설은 시작한다." + "<br>'전직 빨치산'인 아버지의 죽음 이후 장례를 치르는 3일간, 오고 가는 사람과 말들 속에 그의 시대가 촘촘하게 얽혀있다." + "<br>읽는 동안 울컥, 깊이 맺혀있던 마음들이 토해져 나와 울다가 웃다가 그래서 따뜻해지는 삶의 이야기" + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/아버지의해방일지.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("아버지의 해방일지", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("아버지의 해방일지 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : fatherReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            fatherReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showSeinoReview(List<Review> seinoReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("세이노의 가르침 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2023년 03월 02일 " + "<br>쪽수: 736쪽" + "<br>책 소개: 2000년부터 발표된 그의 주옥같은 글들." + "<br>독자들이 자발적으로 만든 제본서는 물론, 전자책과 앱까지 나왔던 [세이노의 가르침]이 드디어 전국 서점에서 독자들을 마주한다." + "<br>여러 판본을 모으고 저자의 확인을 거쳐 최근 생각을 추가로 수록하였다. " + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/세이노의가르침.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("세이노의 가르침", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("세이노의 가르침 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : seinoReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            seinoReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showLossReview(List<Review> lossReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("상실의 기쁨 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2023년 03월 17일 " + "<br>쪽수: 412쪽" + "<br>책 소개: (닫힌 문을 기꺼이 열고 기회로 나아가는 법) 30년 경력의 저널리스트였던 저자는 어느 날 뇌졸중으로 한쪽 시력을 잃는다." + "<br>연인은 떠나고, 아버지는 알츠하이머 진단을 받았다." + "<br>이 불행들이 닫은 문들을 흐린 한쪽 눈으로 기꺼이 열고 기쁨의 빛을 향해 나아간다." + "<br>내게 닫힌 문들을 열고 갈 용기를 줄 책" + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/상실의기쁨.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("상실의 기쁨", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("상실의 기쁨 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : lossReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            lossReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showMoneyReview(List<Review> moneyReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("돈의 속성 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2020년 06월 15일 " + "<br>쪽수: 415쪽" + "<br>책 소개: [알면서도 알지 못하는 것들] 김승호 회장의 최신간. 유튜브에서 1,600만 명이 시청한 <돈의 속성> 완결편으로 책을 출간했다." + "<br>복잡하고 어려운 내용은 없다. 그저 자신이 가장 잘할 수 있고, 잘 아는 '돈 버는' 모든 것을 명료하게 풀었다." + "<br>하나의 인격체와 같은 돈, 그동안 내가 알던 돈에 관한 생각을 과감히 수정한다." + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/돈의속성.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("돈의 속성", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("돈의 속성 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : moneyReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            moneyReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showNightReview(List<Review> nightReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("긴긴밤 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2021년 02월 03일 " + "<br>쪽수: 144쪽" + "<br>책 소개: 가족들과 함께 자연 속에서 행복하게 살았지만 무분별한 남획으로 세상에 혼자 남게 된 흰바위코뿔소 '노든'" + "<br>태어나자마자 코뿔소의 손에 남겨진 어린 펭귄. 어린 펭귄을 바다에 데려다 주겠다는 약속을 지키기 위해 떠난" + "<br>동물들의 여정 속에서 어둡게만 보이는 현실 속 희망을 발견한다." + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/긴긴밤.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("긴긴밤", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("긴긴밤 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : nightReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            nightReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showProofReview(List<Review> proofReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("구의 증명 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2015년 03월 30일 " + "<br>쪽수: 177쪽" + "<br>책 소개: 만약 네가 먼저 죽는다면 나는 너를 먹을 거야." + "<br>그래야 너 없이도 죽지 않고 살 수 있어." + "<br>사랑 후 남겨진 것들에 관한 숭고할 만큼 아름다운 이야기" + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/구의증명.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("구의 증명", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("구의 증명 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : proofReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            proofReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showSecondStoreReview(List<Review> secondStoreReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("불편한 편의점 2 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2023년 03월 03일 " + "<br>쪽수: 320쪽" + "<br>책 소개: (다시 시작되는 편의점의 밤!) 작가 김호연의 '동네 이야기' [불편한 편의점] 두 번째 책." + "<br>편의점에는 새 점원이 오고, 그와 동료들, 손님들은 저마다의 사연을 나누며 마음을 주고받는다." + "<br>점원과 손님 모두에게 작은 빛이 되는 골목길의 편의점, 지친 하루의 끝을 위로하는 편의점의 밤이 새롭게 시작된다!" + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/불편한 편의점2.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("불편한 편의점 2", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("불편한 편의점 2 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : secondStoreReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            secondStoreReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showFirstStoreReview(List<Review> firstStoreReviews) {
        JPanel panel = new JPanel();
        contentPanel.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField bookInformationTextField = new JTextField("불편한 편의점 1 책 정보");
        bookInformationTextField.setEditable(false);
        panel.add(bookInformationTextField);
        JLabel bookInformationLabel = new JLabel("<html>" + "발행일 : 2021년 04월 20일 " + "<br>쪽수: 268쪽" + "<br>책 소개: 동네 골목의 작은 편의점을 배경으로 삶의 희로애락을 따뜻하고 유머러스하게 그린 소설." + "<br>서울역에서 살다가 우연한 기회에 편의점에서 일하게 된 한 인물과 저마다의 사연을 안고 편의점을 찾는 이들의 이야기," + "<br>그 속에서 지친 하루를 위로하는 편의점의 밤이 열린다." + "</html>");
        panel.add(bookInformationLabel);
        ImageIcon icons = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/불편한 편의점1.jpg");
        Image images = icons.getImage();
        Image scaledImages = images.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcons = new ImageIcon(scaledImages);
        JButton buttons = new JButton("불편한 편의점 1", scaledIcons);
        buttons.setVerticalTextPosition(SwingConstants.BOTTOM);
        buttons.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(buttons);
        JTextField bookReviewTextField = new JTextField("불편한 편의점 1 게시판입니다. 자유롭게 책에 대한 리뷰를 남겨주세요.");
        bookReviewTextField.setEditable(false);
        panel.add(bookReviewTextField);
        JLabel gradeLabel = new JLabel("별점 등록하기");
        panel.add(gradeLabel);
        String[] grade = {"✩", "✩✩", "✩✩✩", "✩✩✩✩", "✩✩✩✩✩"};
        JComboBox gradeComboBox = new JComboBox<>(grade);
        panel.add(gradeComboBox);
        JLabel contentLabel = new JLabel("한줄평: ");
        panel.add(contentLabel);
        JTextField contentTextField = new JTextField(30);
        panel.add(contentTextField);
        JButton writeButton = new JButton("작성");
        panel.add(writeButton);

        for (Review review : firstStoreReviews) {
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);
        }

        writeButton.addActionListener((writeEvent) -> {
            Review review = new Review((String) gradeComboBox.getSelectedItem(), contentTextField.getText());
            firstStoreReviews.add(review);
            JLabel gradeLabel2 = new JLabel("별점 : " + review.getGrade());
            panel.add(gradeLabel2);
            JLabel contentLabel2 = new JLabel("한줄평: " + review.getContent());
            panel.add(contentLabel2);

            gradeComboBox.setSelectedIndex(0);
            contentTextField.setText("");
            showContentPanel(panel);
        });
        showContentPanel(panel);
    }

    public void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }
}

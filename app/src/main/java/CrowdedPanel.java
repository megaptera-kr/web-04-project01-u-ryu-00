import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CrowdedPanel extends JPanel {
    public CrowdedPanel(List<Review> firstStoreReviews, List<Review> secondStoreReviews) {
        this.setLayout(new GridLayout(2, 5));

        ImageIcon icon = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/불편한 편의점1.jpg");
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JButton button = new JButton("불편한 편의점 1", scaledIcon);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button);
        button.addActionListener((event) -> {
            JPanel panel = new JPanel();
            this.add(panel);
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            JTextField bookInformationTextField = new JTextField("불편한 편의점 1 책 정보");
            bookInformationTextField.setEditable(false);
            panel.add(bookInformationTextField);
            JLabel bookInformationLabel = new JLabel("<html>" +
                    "발행일 : 2021년 04월 20일 " +
                    "<br>쪽수: 268쪽" +
                    "<br>책 소개: 동네 골목의 작은 편의점을 배경으로 삶의 희로애락을 따뜻하고 유머러스하게 그린 소설." +
                    "<br>서울역에서 살다가 우연한 기회에 편의점에서 일하게 된 한 인물과 저마다의 사연을 안고 편의점을 찾는 이들의 이야기," +
                    "<br>그 속에서 지친 하루를 위로하는 편의점의 밤이 열린다." +
                    "</html>");
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
        });

        ImageIcon icon2 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/불편한 편의점2.jpg");
        Image image2 = icon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
        JButton button2 = new JButton("불편한 편의점 2", scaledIcon2);
        button2.setVerticalTextPosition(SwingConstants.BOTTOM);
        button2.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button2);
        button2.addActionListener((event) -> {
            JPanel panel = new JPanel();
            this.add(panel);
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            JTextField bookInformationTextField = new JTextField("불편한 편의점 2 책 정보");
            bookInformationTextField.setEditable(false);
            panel.add(bookInformationTextField);
            JLabel bookInformationLabel = new JLabel("<html>" +
                    "발행일 : 2023년 03월 03일 " +
                    "<br>쪽수: 320쪽" +
                    "<br>책 소개: (다시 시작되는 편의점의 밤!) 작가 김호연의 '동네 이야기' [불편한 편의점] 두 번째 책." +
                    "<br>편의점에는 새 점원이 오고, 그와 동료들, 손님들은 저마다의 사연을 나누며 마음을 주고받는다." +
                    "<br>점원과 손님 모두에게 작은 빛이 되는 골목길의 편의점, 지친 하루의 끝을 위로하는 편의점의 밤이 새롭게 시작된다!" +
                    "</html>");
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
        });


        ImageIcon icon3 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/구의증명.jpg");
        Image image3 = icon3.getImage();
        Image scaledImage3 = image3.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(scaledImage3);
        JButton button3 = new JButton("구의 증명", scaledIcon3);
        button3.setVerticalTextPosition(SwingConstants.BOTTOM);
        button3.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button3);

        ImageIcon icon4 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/긴긴밤.jpg");
        Image image4 = icon4.getImage();
        Image scaledImage4 = image4.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);
        JButton button4 = new JButton("긴긴밤", scaledIcon4);
        button4.setVerticalTextPosition(SwingConstants.BOTTOM);
        button4.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button4);

        ImageIcon icon5 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/돈의속성.jpg");
        Image image5 = icon5.getImage();
        Image scaledImage5 = image5.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);
        JButton button5 = new JButton("돈의 속성", scaledIcon5);
        button5.setVerticalTextPosition(SwingConstants.BOTTOM);
        button5.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button5);

        ImageIcon icon6 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/상실의기쁨.jpg");
        Image image6 = icon6.getImage();
        Image scaledImage6 = image6.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(scaledImage6);
        JButton button6 = new JButton("상실의 기쁨", scaledIcon6);
        button6.setVerticalTextPosition(SwingConstants.BOTTOM);
        button6.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button6);

        ImageIcon icon7 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/세이노의가르침.jpg");
        Image image7 = icon7.getImage();
        Image scaledImage7 = image7.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon(scaledImage7);
        JButton button7 = new JButton("세이노의 가르침", scaledIcon7);
        button7.setVerticalTextPosition(SwingConstants.BOTTOM);
        button7.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button7);

        ImageIcon icon8 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/아버지의해방일지.jpg");
        Image image8 = icon8.getImage();
        Image scaledImage8 = image8.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8 = new ImageIcon(scaledImage8);
        JButton button8 = new JButton("아버지의 해방일지", scaledIcon8);
        button8.setVerticalTextPosition(SwingConstants.BOTTOM);
        button8.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button8);

        ImageIcon icon9 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/역행자.jpg");
        Image image9 = icon9.getImage();
        Image scaledImage9 = image9.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon9 = new ImageIcon(scaledImage9);
        JButton button9 = new JButton("역행자", scaledIcon9);
        button9.setVerticalTextPosition(SwingConstants.BOTTOM);
        button9.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button9);

        ImageIcon icon10 = new ImageIcon("/Users/ryuyoojung/web-04-project01-u-ryu-00/app/src/main/Image/일머리문해력.jpg");
        Image image10 = icon10.getImage();
        Image scaledImage10 = image10.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon10 = new ImageIcon(scaledImage10);
        JButton button10 = new JButton("일머리 문해력", scaledIcon10);
        button10.setVerticalTextPosition(SwingConstants.BOTTOM);
        button10.setHorizontalTextPosition(SwingConstants.CENTER);
        this.add(button10);
    }

    public void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }
}

import models.Book;

import javax.swing.*;
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
                    JPanel recordPanel = new JPanel();
                    recordPanel.setLayout(new BoxLayout(recordPanel, BoxLayout.Y_AXIS));
                    JLabel titleLabel2 = new JLabel("책 제목 : ");
                    JTextField titleTextField2 = new JTextField(30);
                    JLabel authorLabel2 = new JLabel("지은이 : ");
                    JTextField authorTextField2 = new JTextField(10);
                    JLabel publisherLabel2 = new JLabel("출판사 : ");
                    JTextField publisherTextField2 = new JTextField(10);
                    JLabel pageLabel2 = new JLabel("페이지 : ");
                    JTextField pageTextField2 = new JTextField(5);
                    JLabel aboutTheBookLabel2 = new JLabel("책 소개 : ");
                    JTextField aboutTheBookTextField2 = new JTextField(30);
                    JLabel favoritesLabel2 = new JLabel("즐겨찾기 : ");
                    JCheckBox favoritesCheckBox2 = new JCheckBox();
                    JLabel memoLabel2 = new JLabel("메모 : ");
                    JTextField memoTextField2 = new JTextField(30);
                    JButton saveButton = new JButton("저장");
                    saveButton.addActionListener((saveEvent) -> {
                        editContent(book,titleTextField2.getText(),authorTextField2.getText(),publisherTextField2.getText(),pageTextField2.getText(),authorTextField2.getText(),memoTextField2.getText());
                    });

                    recordPanel.add(titleLabel2);
                    recordPanel.add(titleTextField2);
                    recordPanel.add(authorLabel2);
                    recordPanel.add(authorTextField2);
                    recordPanel.add(publisherLabel2);
                    recordPanel.add(publisherTextField2);
                    recordPanel.add(pageLabel2);
                    recordPanel.add(pageTextField2);
                    recordPanel.add(aboutTheBookLabel2);
                    recordPanel.add(aboutTheBookTextField2);
                    recordPanel.add(favoritesLabel2);
                    recordPanel.add(favoritesCheckBox2);
                    recordPanel.add(memoLabel2);
                    recordPanel.add(memoTextField2);
                    recordPanel.add(saveButton);

                    titleTextField2.setText(book.getTitle());
                    authorTextField2.setText(book.getAuthor());
                    publisherTextField2.setText(book.getPublisher());
                    pageTextField2.setText(Integer.toString(book.getPage()));
                    aboutTheBookTextField2.setText(book.getAboutTheBook());
                    favoritesCheckBox2.setSelected(book.getFavorites());
                    memoTextField2.setText(book.getMemo());

                    showContentPanel(recordPanel);
                });

                showContentPanel(bookInformationPanel);
            });
        }
    }

    public void editContent(Book book, String editedTitle, String editedAuthor, String editedPublisher, String editedPage, String editedAboutTheBook, String editedMemo) {
        book.editContent(editedTitle);
        book.editContent(editedAuthor);
        book.editContent(editedPublisher);
        book.editContent(editedPage);
        book.editContent(editedAboutTheBook);
        book.editContent(editedMemo);
        book.editContent(editedTitle);
    }

    public void showContentPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);

        this.setVisible(false);
        this.setVisible(true);
    }
}

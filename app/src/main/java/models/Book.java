package models;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private String publisher;
    private int page;
    private String aboutTheBook;
    private boolean favorites;
    private String memo;

    public Book(String title, String author, String publisher, int page, String aboutTheBook, boolean favorites, String memo) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.page = page;
        this.aboutTheBook = aboutTheBook;
        this.favorites = favorites;
        this.memo = memo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPage() {
        return page;
    }

    public String getAboutTheBook() {
        return aboutTheBook;
    }

    public boolean getFavorites() {
        return favorites;
    }

    public String getMemo() {
        return memo;
    }

    public void editContent(String editedTitle, String editedAuthor, String editedPublisher, int editedPage, String editedAboutTheBook,boolean editedFavorites, String editedMemo) {
        this.title = editedTitle;
        this.author = editedAuthor;
        this.publisher = editedPublisher;
        this.page = editedPage;
        this.aboutTheBook = editedAboutTheBook;
        this.favorites = editedFavorites;
        this.memo = editedMemo;
    }
}

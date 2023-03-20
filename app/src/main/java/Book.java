public class Book {
    private String title;
    private String author;
    private String publisher;
    private int page;
    private String aboutTheBook;
    private boolean favorites;
    private String memo;

    public String title() {
        return title;
    }

    public String author() {
        return author;
    }

    public String publisher() {
        return publisher;
    }

    public int page() {
        return page;
    }

    public String aboutTheBook() {
        return aboutTheBook;
    }

    public boolean favorites() {
        return favorites;
    }

    public String memo() {
        return memo;
    }

    public void editTitle(String title) {
        this.title = title;
    }

    public void editAuthor(String author) {
        this.author = author;
    }

    public void editPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void editPage(int page) {
        this.page = page;
    }

    public void editAboutTheBook(String aboutTheBook) {
        this.aboutTheBook = aboutTheBook;
    }

    public void editFavorites(boolean favorites) {
        this.favorites = favorites;
    }

    public void editMemo(String memo) {
        this.memo = memo;
    }

}

import models.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getTitle() {
        Book book = new Book("세이노의 가르침", "세이노", "데이원", 736, "피보다 진하게 살아라", true, "오늘은 세이노의 가르침이라는 책을 읽었다.");
        assertEquals("세이노의 가르침", book.getTitle());
    }

    @Test
    void getAuthor() {
        Book book = new Book("세이노의 가르침", "세이노", "데이원", 736, "피보다 진하게 살아라", true, "오늘은 세이노의 가르침이라는 책을 읽었다.");
        assertEquals("세이노", book.getAuthor());
    }

    @Test
    void getPublisher() {
        Book book = new Book("세이노의 가르침", "세이노", "데이원", 736, "피보다 진하게 살아라", true, "오늘은 세이노의 가르침이라는 책을 읽었다.");
        assertEquals("데이원", book.getPublisher());
    }

    @Test
    void getPage() {
        Book book = new Book("세이노의 가르침", "세이노", "데이원", 736, "피보다 진하게 살아라", true, "오늘은 세이노의 가르침이라는 책을 읽었다.");
        assertEquals(736, book.getPage());
    }

    @Test
    void getAboutTheBook() {
        Book book = new Book("세이노의 가르침", "세이노", "데이원", 736, "피보다 진하게 살아라", true, "오늘은 세이노의 가르침이라는 책을 읽었다.");
        assertEquals("피보다 진하게 살아라", book.getAboutTheBook());
    }

    @Test
    void getTureFavorites() {
        Book book = new Book("세이노의 가르침", "세이노", "데이원", 736, "피보다 진하게 살아라", true, "오늘은 세이노의 가르침이라는 책을 읽었다.");
        assertTrue(book.getFavorites());
    }

    @Test
    void getFalseFavorites() {
        Book book = new Book("세이노의 가르침", "세이노", "데이원", 736, "피보다 진하게 살아라", false, "오늘은 세이노의 가르침이라는 책을 읽었다.");
        assertFalse(book.getFavorites());
    }

    @Test
    void getMemo() {
        Book book = new Book("세이노의 가르침", "세이노", "데이원", 736, "피보다 진하게 살아라", true, "오늘은 세이노의 가르침이라는 책을 읽었다.");
        assertEquals("오늘은 세이노의 가르침이라는 책을 읽었다.", book.getMemo());
    }

    @Test()
    void editContent() {
        Book book = new Book("세이노의 가르침", "세이노", "데이원", 736, "피보다 진하게 살아라", true, "오늘은 세이노의 가르침이라는 책을 읽었다.");
        assertEquals("세이노의 가르침", book.getTitle());
        assertEquals("세이노", book.getAuthor());
        assertEquals("데이원", book.getPublisher());
        assertEquals(736, book.getPage());
        assertEquals("피보다 진하게 살아라", book.getAboutTheBook());
        assertTrue(book.getFavorites());
        assertEquals("오늘은 세이노의 가르침이라는 책을 읽었다.", book.getMemo());

        book.editContent("책은 도끼다", "박웅현", "북하우스", 348, "내가 읽은 책들은 나의 도끼였다.", false, "오늘은 책은 도끼다라는 책을 읽었다.");
        assertEquals("책은 도끼다", book.getTitle());
        assertEquals("박웅현", book.getAuthor());
        assertEquals("북하우스", book.getPublisher());
        assertEquals(348, book.getPage());
        assertEquals("내가 읽은 책들은 나의 도끼였다.", book.getAboutTheBook());
        assertFalse(book.getFavorites());
        assertEquals("오늘은 책은 도끼다라는 책을 읽었다.", book.getMemo());
    }
}

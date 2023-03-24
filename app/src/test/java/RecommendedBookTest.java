import models.RecommendedBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecommendedBookTest {

    @Test
    void getTitle() {
        RecommendedBook recommendedBook = new RecommendedBook("책은 도끼다");
        assertEquals("책은 도끼다", recommendedBook.getTitle());
    }
}

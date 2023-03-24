import models.Review;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    @Test
    void getGrade() {
        Review review = new Review("✩", "불편한 편의점을 읽고 지친 하루를 위로하는 시간을 보냈습니다.");
        assertEquals("✩", review.getGrade());
    }

    @Test
    void getContent() {
        Review review = new Review("✩", "불편한 편의점을 읽고 지친 하루를 위로하는 시간을 보냈습니다.");
        assertEquals("불편한 편의점을 읽고 지친 하루를 위로하는 시간을 보냈습니다.", review.getContent());
    }
}

import models.BestSeller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestSellerTest {

    @Test
    void getTitle() {
        BestSeller bestSeller = new BestSeller("불편한 편의점 1");
        assertEquals("불편한 편의점 1", bestSeller.getTitle());
    }
}

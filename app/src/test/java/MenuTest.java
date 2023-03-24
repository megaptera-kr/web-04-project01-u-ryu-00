import models.Menu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void getMenu() {
        Menu menu = new Menu("홈");
        assertEquals("홈", menu.getMenu());
    }
}

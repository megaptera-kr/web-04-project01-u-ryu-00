import models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getId() {
        User user = new User("123", "1234");
        assertEquals("123", user.getId());
    }

    @Test
    void getPassword() {
        User user = new User("123", "1234");
        assertEquals("1234", user.getPassword());
    }
}

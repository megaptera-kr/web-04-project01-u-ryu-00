import models.Token;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TokenTest {

    @Test
    void Equals() {
        Token token1 = new Token("1234");
        Token token2 = new Token("1234");
        assertEquals(token1.toString(), token2.toString());
    }
}

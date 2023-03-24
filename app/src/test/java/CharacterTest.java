import models.Character;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void getName() {
        Character character = new Character("도톨이");
        assertEquals("도톨이", character.getName());
    }
}

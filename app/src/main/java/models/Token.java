package models;

import java.util.Objects;

public class Token {
    private String token;

    public Token(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Token)) {
            return false;
        }
        Token otherToken = (Token) obj;
        return Objects.equals(token, otherToken.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }
}

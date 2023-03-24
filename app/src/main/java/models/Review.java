package models;

import java.io.Serializable;

public class Review implements Serializable {
    private String grade;
    private String content;

    public Review(String grade, String content) {
        this.grade = grade;
        this.content = content;
    }

    public String getGrade() {
        return grade;
    }

    public String getContent() {
        return content;
    }
}

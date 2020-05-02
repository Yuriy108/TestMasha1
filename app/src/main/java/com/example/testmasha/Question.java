package com.example.testmasha;

import org.w3c.dom.DOMException;
import org.w3c.dom.Text;

public class Question extends Test {
    private String question;
    private String rightanswer;
    private String wronganserone;
    private String wrongansertwo;
    private String wronganserthree;

    public Question(String question, String rightanswer, String wronganserone, String wrongansertwo, String wronganserthree) {
        this.question = question;
        this.rightanswer = rightanswer;
        this.wronganserone = wronganserone;
        this.wrongansertwo = wrongansertwo;
        this.wronganserthree = wronganserthree;
    }

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public String getRightanswer() {
        return rightanswer;
    }

    public String getWronganserone() {
        return wronganserone;
    }

    public String getWrongansertwo() {
        return wrongansertwo;
    }

    public String getWronganserthree() {
        return wronganserthree;
    }
}

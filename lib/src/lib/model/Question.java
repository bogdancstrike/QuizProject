package lib.model;

import java.io.Serializable;
import java.util.Map;

public class Question implements Serializable {
    private final String content;
    private final Map<String, Boolean> choices;
    private final int number;

    public Question(String content, Map<String, Boolean> choices, int number) {
        this.content = content;
        this.choices = Map.copyOf(choices);
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public Map<String, Boolean> getChoices() {
        return choices;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number + ")  " + content; // 1) Question?
    }
}

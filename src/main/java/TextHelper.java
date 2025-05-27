package main.java;
import java.util.*;

public class TextHelper {
    private String name;

    public TextHelper(String name) {
        this.name = name;
    }

    public String capitalize(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }

    public boolean isValidEmail(String email) {
        if (email == null) return false;
        return email.contains("@") && email.contains(".");
    }

    public List<String> getWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.asList(sentence.split("\\s+"));
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("TextHelper: " + name);
    }
}
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> dictionary;

    public Abbreviations() {
        this.dictionary = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.dictionary.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        boolean isTrue = false;

        if (this.dictionary.containsKey(abbreviation)) {
            isTrue = true;
        }

        return isTrue;
    }

    public String findExplanationFor(String abbreviation) {
        String returnString = "";

        returnString = this.dictionary.getOrDefault(abbreviation, null);

        return returnString;
    }
}

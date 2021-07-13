import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        // an empty list is added if a word was added
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        // retrieve the list containing the translations for this word
        ArrayList<String> translations = this.dictionary.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        for (String hashMapWord: dictionary.keySet()) {
            if (hashMapWord.equals(word)) {
                return dictionary.get(word);
            }
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
//        for (String line: dictionary.keySet()) {
//            if (word.equals(line)) {
//                dictionary.remove(line);
//            }
//        }
        this.dictionary.remove(word);
    }
}

import java.util.HashMap;
import java.util.Map;

public class Counter {
    public static Map<Character, Integer> countLetters(String word) {

        char[] charArray = word.toCharArray();

        Map<Character, Integer> letterCount = new HashMap<>();

        for (char letter : charArray) {
            if (letterCount.containsKey(letter)) {
                letterCount.put(letter, letterCount.get(letter) + 1);
            } else {
                letterCount.put(letter, 1);
            }
        }
        return letterCount;
    }
}

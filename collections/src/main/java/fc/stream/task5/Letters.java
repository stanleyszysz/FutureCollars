package fc.stream.task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class Letters {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Zażółć", "gęślą", "jaźń");

        HashSet<String> characters = distinctLettersFromWords(words);
        System.out.println(characters);
    }

    public static HashSet<String> distinctLettersFromWords(List<String> words) {
        HashSet<String> letters = new HashSet<>();
        for (String word : words) {
            word.codePoints().mapToObj(character -> String.valueOf((char) character))
                    .distinct()
                    .forEach(letter -> letters.add(letter.toUpperCase(Locale.ROOT)));
        }
        return letters;
    }
}

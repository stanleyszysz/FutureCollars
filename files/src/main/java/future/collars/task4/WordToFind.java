package future.collars.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordToFind {

    private static final String PATH_TO_RESOURCES = "src/main/resources/";

    public static void findWord(String nameOfFile) throws IOException {

        String wordToFind = "Koniec";

        String text = Files.readString(Path.of(PATH_TO_RESOURCES + nameOfFile));
        System.out.println(text.contains(wordToFind));
    }
}

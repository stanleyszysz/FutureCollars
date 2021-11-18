package future.collars.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InvertedText {

    private static final String PATH_TO_RESOURCES = "src/main/resources/";

    public static void getInvertedText(String nameOfFile) throws IOException {

        String text = Files.readString(Path.of(PATH_TO_RESOURCES + nameOfFile));

        int characterPosition = text.length() - 1;

        while (characterPosition >= 0) {
            System.out.print(text.charAt(characterPosition));
            characterPosition--;
        }
    }
}

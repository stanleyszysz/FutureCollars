package future.collars.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NumberOfCharacters {

    private static final String PATH_TO_RESOURCES = "src/main/resources/";

    public static void calculateNumberOfCharacters(String nameOfFile) throws IOException {

        String text = Files.readString(Path.of(PATH_TO_RESOURCES + nameOfFile));
        System.out.println(text.length());
    }
}

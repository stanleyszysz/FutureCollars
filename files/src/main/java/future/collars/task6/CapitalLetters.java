package future.collars.task6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CapitalLetters {

    private static final String PATH_TO_RESOURCES = "src/main/resources/";

    public static void convertToCapitalLetters(String nameOfInputFile, String nameOfOutputFile) throws IOException {

        String text = Files.readString(Path.of(PATH_TO_RESOURCES + nameOfInputFile));
        text = text.toUpperCase();
        Files.write(Path.of(PATH_TO_RESOURCES + nameOfOutputFile), text.getBytes(StandardCharsets.UTF_8));
    }
}

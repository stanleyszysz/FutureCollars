package future.collars.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FileReader {

    private static final String PATH_TO_RESOURCES = "src/main/resources/";

    public static void readFromFile(String nameOfFile) throws IOException {

        String text = Files.readString(Path.of(PATH_TO_RESOURCES + nameOfFile));
        System.out.println(text);
    }

}

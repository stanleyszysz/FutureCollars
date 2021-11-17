package future.collars.task0;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

class FileWriter {

    private static final String PATH_TO_RESOURCES = "src/main/resources/";

    public static void writeToFile(String nameOfFile, String textToWrite) throws IOException {

        Files.write(Path.of(PATH_TO_RESOURCES + nameOfFile), textToWrite.getBytes(StandardCharsets.UTF_8));
    }

}

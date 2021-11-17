package future.collars.task0;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

class FileWriter {

    public static void writeToFile(String nameOfFile, String textToWrite) throws IOException {

        Files.write(Path.of("src/main/resources/" + nameOfFile), textToWrite.getBytes(StandardCharsets.UTF_8));
    }

}

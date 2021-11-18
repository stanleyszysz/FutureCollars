package future.collars.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EveryOtherLine {

    private static final String PATH_TO_RESOURCES = "src/main/resources/";

    public static void printEveryOtherLine(String nameOfFile) throws IOException {

        int lineNumber = 0;
        String line;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_TO_RESOURCES + nameOfFile));
        while ((line = bufferedReader.readLine()) != null) {
            if (lineNumber % 2 == 0) {
                System.out.println(line);
            }
            lineNumber++;
        }
    }
}

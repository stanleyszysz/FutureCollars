package future.collars.task6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String nameOfInputFile = "data.txt";
        String nameOfOutputFile = "output.txt";

        CapitalLetters.convertToCapitalLetters(nameOfInputFile, nameOfOutputFile);
    }
}

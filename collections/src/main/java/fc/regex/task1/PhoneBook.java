package fc.regex.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;

public class PhoneBook {

    private HashMap<String, Record> bookMap;

    public PhoneBook() {
        bookMap = new HashMap<>();
        final String DELIMITER = ", ";
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/book.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                Record record = new Record();
                record.setFullName(values[0]);
                record.setAddress(values[1]);
                if (values.length == 3) {
                    record.setPhoneNumber(Optional.of(values[2]));
                } else {
                    record.setPhoneNumber(Optional.empty());
                }
                bookMap.put(values[0], record);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // metoda printBook
    public void printBook() {
        bookMap.forEach((k, v) -> System.out.println((k + ":" + v)));

    }

    public Record getRecord(String fullName) throws Exception {
        if (bookMap.containsKey(fullName)) {
            return bookMap.get(fullName);
        }
        throw new Exception("Key not found");
    }

}

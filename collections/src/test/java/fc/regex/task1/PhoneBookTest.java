package fc.regex.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    public PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    void printBook() {
        phoneBook.printBook();
    }

    @Test
    void getRecordWithoutPhoneNumber() throws Exception {
        Record record = phoneBook.getRecord("Williams Szymański");
        assertEquals("Williams Szymański", record.getFullName());
        assertEquals("Kowalska 15", record.getAddress());
        assertEquals(Optional.empty(), record.getPhoneNumber());
    }

    @Test
    void getRecordWithPhoneNumber() throws Exception {
        Record record = phoneBook.getRecord("Brown Kowalczyk");
        assertEquals("Brown Kowalczyk", record.getFullName());
        assertEquals("Kowalska 25", record.getAddress());
        assertEquals("459687521", record.getPhoneNumber().get());
    }

    @Test
    void getExceptionIfKeyNotExist() {
        assertThrows(Exception.class, () -> {
            phoneBook.getRecord("Brown Brown");
        });
    }
}
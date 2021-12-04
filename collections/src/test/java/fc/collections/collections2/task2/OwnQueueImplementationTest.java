package fc.collections.collections2.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnQueueImplementationTest {

    public OwnQueueImplementation ownQueueImplementation;

    @BeforeEach
    void setUp() {
        ownQueueImplementation = new OwnQueueImplementation();
        ownQueueImplementation.add(0);
        ownQueueImplementation.add(1);
        ownQueueImplementation.add(2);
        ownQueueImplementation.add(3);
        ownQueueImplementation.add(4);
        ownQueueImplementation.add(5);

    }

    @Test
    void addElement() {
        assertEquals(0, ownQueueImplementation.element());
    }

    @Test
    void size() {
        assertEquals(6, ownQueueImplementation.size());
    }

    @Test
    void removeElement() {
        assertEquals(0, ownQueueImplementation.remove());
    }

    @Test
    void element() {
        assertEquals(0, ownQueueImplementation.element());
    }
}
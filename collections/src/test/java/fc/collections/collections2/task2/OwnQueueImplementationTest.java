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
        assertTrue(ownQueueImplementation.add(6));
    }

    @Test
    void size() {
        int[] expectedSizes = {6, 5, 4, 3, 2, 1};
        int iterator = 0;
        while (ownQueueImplementation.size() != 0) {
            assertEquals(expectedSizes[iterator], ownQueueImplementation.size());
            ownQueueImplementation.remove();
            iterator++;
        }
    }

    @Test
    void removeElement() {
        int[] expectedElements = {0, 1, 2, 3, 4, 5};
        int iterator = 0;
        while (ownQueueImplementation.size() != 0) {
            assertEquals(expectedElements[iterator], ownQueueImplementation.remove());
            iterator++;
        }
    }

    @Test
    void element() {
        int[] expectedElements = {0, 1, 2, 3, 4, 5};
        int iterator = 0;
        while (ownQueueImplementation.size() != 0) {
            assertEquals(expectedElements[iterator], ownQueueImplementation.element());
            ownQueueImplementation.remove();
            iterator++;
        }
    }
}
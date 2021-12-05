package fc.collections.collections2.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnListImplTest {

    public OwnListImpl ownListImpl;

    @BeforeEach
    void setUp() {
        ownListImpl = new OwnListImpl();
        ownListImpl.add(0);
        ownListImpl.add(1);
        ownListImpl.add(2);
        ownListImpl.add(3);
        ownListImpl.add(4);
    }

    @Test
    void addElement() {
        ownListImpl.add(5);
        ownListImpl.add(6);
        ownListImpl.add(7);
        ownListImpl.add(8);
        ownListImpl.add(9);
        ownListImpl.add(10);
        ownListImpl.add(11);
        assertTrue(ownListImpl.add(11));
    }

    @Test
    void getElement() {
        assertEquals(3, ownListImpl.get(3));
    }

    @Test
    void shouldReturnException() {
        assertThrows(RuntimeException.class, () -> {
            ownListImpl.get(8);
        });
    }

    @Test
    void shouldRemoveElement_3() {
        assertTrue(ownListImpl.remove(3));
    }

    @Test
    void getSizeList() {
        assertEquals(5, ownListImpl.size());
    }
}
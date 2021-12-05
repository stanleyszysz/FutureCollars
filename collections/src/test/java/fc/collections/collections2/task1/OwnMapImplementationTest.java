package fc.collections.collections2.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnMapImplementationTest {

    public OwnMapImplementation ownMapImplementation;

    @BeforeEach
    void setUp() {
        ownMapImplementation = new OwnMapImplementation();
        ownMapImplementation.put("Anna", "Poland");
        ownMapImplementation.put("Hans", "Germany");
        ownMapImplementation.put("Jean", "France");
    }

    @Test
    void putElement() {
        assertEquals("Germany", ownMapImplementation.get("Hans"));
    }

    @Test
    void containsKeyHansIsPresent() {
        assertTrue(ownMapImplementation.containsKey("Hans"));
    }

    @Test
    void containsKeyJohnIsAbsent() {
        assertFalse(ownMapImplementation.containsKey("John"));
    }

    @Test
    void containsValuePoland() {
        assertTrue(ownMapImplementation.containsValue("Poland"));
    }

    @Test
    void notContainsValueEngland() {
        assertFalse(ownMapImplementation.containsValue("England"));
    }

    @Test
    void removeElement() {
        assertEquals("Germany", ownMapImplementation.remove("Hans"));
    }

    @Test
    void getElement() {
        assertEquals("France", ownMapImplementation.remove("Jean"));
    }
}
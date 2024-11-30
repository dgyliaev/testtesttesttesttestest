import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShitTest {

    @Test
    void sum() {
        Shit shit = new Shit();

        int expected = 5;
        int result = shit.sum(2, 3);

        assertEquals(expected, result);
    }
}
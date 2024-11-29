package org.example.Level_1_Exercise_3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @Test
    void testArrayIndexOutOfBoundsException() {
        int[] sampleArray = {1, 2, 3, 4, 5};
        ArrayHandler arrayHandler = new ArrayHandler(sampleArray);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayHandler.getElementAt(-1);
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayHandler.getElementAt(10);
        });
    }

    @Test
    void testGetElementAtValidIndex() {
        int[] sampleArray = {1, 2, 3, 4, 5};
        ArrayHandler arrayHandler = new ArrayHandler(sampleArray);
        assert arrayHandler.getElementAt(0) == 1;
        assert arrayHandler.getElementAt(4) == 5;
    }
}
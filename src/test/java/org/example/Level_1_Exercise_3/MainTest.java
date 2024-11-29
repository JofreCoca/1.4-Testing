package org.example.Level_1_Exercise_3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @Test
    void testArrayIndexOutOfBoundsException() {
        // Configuració inicial
        int[] sampleArray = {1, 2, 3, 4, 5};
        ArrayHandler arrayHandler = new ArrayHandler(sampleArray);

        // Comprovar que es llança l'excepció per índex fora de límits
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayHandler.getElementAt(-1); // Índex negatiu
        });

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayHandler.getElementAt(10); // Índex superior al límit
        });
    }

    @Test
    void testGetElementAtValidIndex() {
        // Configuració inicial
        int[] sampleArray = {1, 2, 3, 4, 5};
        ArrayHandler arrayHandler = new ArrayHandler(sampleArray);

        // Verificar que retorna el valor correcte
        assert arrayHandler.getElementAt(0) == 1;
        assert arrayHandler.getElementAt(4) == 5;
    }
}
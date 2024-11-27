package org.example.level_1_Exercise_2;
import org.example.Level_1_Exercise_1.Modules.BookManagement;
import org.example.Level_1_Exercise_2.CalculationDNI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    private CalculationDNI calculationDNI;
    @BeforeEach
    void setUp() {
        calculationDNI=new CalculationDNI();
    }

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B",
            "88888888, Y"
    })
    void testCalculoDni(int numeroDni, char lletraEsperada) {
        assertEquals(lletraEsperada, calculationDNI.calculationLetter(numeroDni));
    }
}

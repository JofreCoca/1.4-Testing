package org.example.Level_1_Exercise_2;
import java.util.Objects;

public class CalculationDNI {
    private char letter;
    public CalculationDNI() {
        this.letter=' ';
    }
    public char calculationLetter(int number){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        this.letter = letras.charAt(number % letras.length());
        return letter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CalculationDNI calculationDNI = (CalculationDNI) o;
        return Objects.equals(this.letter, calculationDNI.letter);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.letter);
    }
}

package org.example.Level_1_Exercise_2;

public class CalculationDNI {
    public CalculationDNI() {
    }
    public char calculationLetter(int number){
        char letter;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        letter = letras.charAt(number % letras.length());
        return letter;
    }
}

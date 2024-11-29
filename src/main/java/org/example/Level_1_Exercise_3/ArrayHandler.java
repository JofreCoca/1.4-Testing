package org.example.Level_1_Exercise_3;

public class ArrayHandler {
    private int[] numbers;

    public ArrayHandler(int[] numbers) {
        this.numbers = numbers;
    }

    public int getElementAt(int index) {
        if (index < 0 || index >= numbers.length) {
            throw new ArrayIndexOutOfBoundsException("Índex fora de rang: " + index);
        }
        return numbers[index];
    }
}

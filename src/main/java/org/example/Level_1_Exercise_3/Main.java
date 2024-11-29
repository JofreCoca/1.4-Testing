package org.example.Level_1_Exercise_3;

public class Main {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7};
        ArrayHandler arrayHandler= new ArrayHandler(numbers);
        System.out.println("Read element: "+arrayHandler.getElementAt(0));
    }
}

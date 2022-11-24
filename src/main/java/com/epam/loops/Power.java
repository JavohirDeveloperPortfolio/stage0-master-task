package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int printNumber = 1;
        for (int i = 1; i <= power; i ++){
            printNumber *= numberToPrint;
        }
        System.out.println(printNumber);
    }

    public static void main(String[] args) {
        new Power().printPower(5, 4);
    }

}

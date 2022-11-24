package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0){
            System.out.println("division by zero");
        }else {

            dividend = Math.abs(dividend);
            divider = Math.abs(divider);
            while (dividend >= divider) {
                dividend = dividend - divider;
            }
            if (dividend == 0) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        }
    }

}

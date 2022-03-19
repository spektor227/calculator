package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(7, 2);
        int b = calc.minus.apply(4, 1);
        int c = calc.devide.apply(a, b);
        int d = calc.pow.apply(a);

        calc.println.accept(c);
        calc.println.accept(d);

    }
}

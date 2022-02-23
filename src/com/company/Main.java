package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

        /*Причина по которой происходит ошибка,
        * это деление на ноль, чтобы ее исправить нужно
        * чтобы вместо 0 было максимальное число
        * BinaryOperator<Integer> devide = (x, y) -> y == 0 ? x / Integer.MAX_VALUE : x / y;*/
    }
}

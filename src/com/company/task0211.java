package com.company;

/*
В методе main на экран выводятся значения трех строк.
Внеси изменения в код, чтобы вместо значений строк вывелась длина каждой строки.

Требования:
•	Не изменяй значение переменной emptyString.
•	У трех строк, переданных в метод println, нужно вызвать метод length.
•	Программа должна вывести на экран три числа, каждое - с новой строки.
 */
public class task0211 {
    public static void main(String[] args) {
        String emptyString = "";

        //напишите тут ваш код
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}

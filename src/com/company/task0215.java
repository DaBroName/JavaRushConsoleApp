package com.company;

import java.util.Scanner;

/*
Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.

Пример ввода:

51
101
201
Пример вывода:

117
Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
Используй деление без остатка.

Требования:
•	Программа должна считывать с клавиатуры три целых числа.
•	Программа должна выводить на экран среднее арифметическое считанных чисел.
 */
public class task0215 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s1 = console.nextInt();
        int s2 = console.nextInt();
        int s3 = console.nextInt();
        System.out.print((s1 + s2 + s3) / 3);

    }
}

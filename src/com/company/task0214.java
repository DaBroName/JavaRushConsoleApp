package com.company;

import java.util.Scanner;

/*
Считай с клавиатуры три строки.
А затем:

Выведи на экран третью строку в неизменном виде.
Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
Пример ввода:

Строка Номер РАЗ
Вторая строка
Строка 3
Пример вывода:

Строка 3
ВТОРАЯ СТРОКА
строка номер раз
Требования:
•	Программа должна считывать с клавиатуры три строки.
•	Третью считанную строку нужно вывести без изменений.
•	Вторую считанную строку нужно вывести в верхнем регистре.
•	Первую считанную строку нужно вывести в нижнем регистре.
•	Все три строки нужно вывести в правильном порядке: третья, вторая, первая.
 */
public class task0214 {
    public static void main(String[] args) {
        Scanner stroka1 = new Scanner(System.in);
        String s1 = stroka1.nextLine();
        Scanner stroka2 = new Scanner(System.in);
        String s2 = stroka2.nextLine();
        Scanner stroka3 = new Scanner(System.in);
        String s3 = stroka3.nextLine();
        System.out.println(s3);
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());

    }
}

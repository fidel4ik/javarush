package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String na = reader.readLine();
        int a = Integer.parseInt(na);
        String nb = reader.readLine();
        int b = Integer.parseInt(nb);
        String nc = reader.readLine();
        int c= Integer.parseInt(nc);
        if (a == b & a == c)
            System.out.println(a + " " + a + " " + a);
        else if ((a == b) || (a == c))
            System.out.println(a + " " + a);
        else if ((a == b)|| (b == c))
            System.out.println(b + " " + b);
        else if ((c == b)||(c == a))
            System.out.println(c + " " + c);

    }
}

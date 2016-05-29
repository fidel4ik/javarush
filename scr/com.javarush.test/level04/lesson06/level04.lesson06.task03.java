package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        if (a >= b & a >= c) {if (b < c) System.out.println(a + " " + c + " "+ b ); else System.out.println(a + " " + b + " "+ c );}
        else if (b >= a & b >= c) {if (a < c) System.out.println(b + " " + c + " "+ a ); else System.out.println(b + " " + a + " "+ c );}
        else if (c >= a & c >= b) {if (a < b) System.out.println(c + " " + b + " "+ a ); else System.out.println(c + " " + a + " "+ b );}

    }
}

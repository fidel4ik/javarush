package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int na = Integer.parseInt(a);
        if (na == 1)
            System.out.println("понедельник");
        else if (na == 2)
            System.out.println("вторник");
        else if (na == 3)
            System.out.println("среда");
        else if (na == 4)
            System.out.println("четверг");
        else if (na == 5)
            System.out.println("пятница");
        else if (na == 6)
            System.out.println("суббота");
        else if (na == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");
    }

}

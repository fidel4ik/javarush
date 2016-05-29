package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x =0;
        for (boolean isExit = false; !isExit; )
        {
            int a = Integer.parseInt(reader.readLine());
            x+=a;
            isExit = (a < 0);
        }
        System.out.println(x);
    }
}


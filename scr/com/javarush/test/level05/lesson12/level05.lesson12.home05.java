package com.javarush.test.level05.lesson12.home05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int x = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String z = reader.readLine();
            if (z.equals("сумма")) break;
            else x += Integer.parseInt(z);
            }
        System.out.println(x);
    }
}


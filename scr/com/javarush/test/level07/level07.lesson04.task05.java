package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //1. Создать массив на 20 чисел.
        int[] array = new int[20];
        //2. Ввести в него значения с клавиатуры.
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        //3. Создать два массива на 10 чисел каждый.
        int[] smallarray1 = new int[10];
        int[] smallarray2 = new int[10];
        //4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        for (int i = 0; i < smallarray1.length; i++)
        {
         smallarray1[i] = array[i];
        }
        for (int i = smallarray2.length; i < array.length; i++)
        {
            smallarray2[i - 10] = array[i];
        }
        //5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
        {
            for (int i = 0; i < smallarray2.length; i++)
            {
                System.out.println(smallarray2[i]);
            }
        }
    }
}


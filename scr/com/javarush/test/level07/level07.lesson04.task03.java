package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /* 1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        */
        String[] list = new String[10];
        int[] array = new int[10];
        // 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        for (int i = 0; i < list.length; i++)
        {
            list[i] = reader.readLine();
        }
        // В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
        // Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
        for (int x = 0; x < list.length; x++)
        {
            array[x] = list[x].length();
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}


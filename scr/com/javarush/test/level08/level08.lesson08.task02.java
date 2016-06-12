package com.javarush.test.level08.lesson08.task02;

import sun.rmi.server.InactiveGroupException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet() throws Exception
    {
        HashSet<Integer> list = new HashSet<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
    return list;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> itr = set.iterator();
        HashSet<Integer> newlist = new HashSet<Integer>();
        {
            for (int y : set)
            {
                if (y <= 10)
                {
                    newlist.add(y);
                }
            }
        }
    return newlist;
    }
}

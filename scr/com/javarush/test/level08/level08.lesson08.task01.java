package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> list = new HashSet<String>();
        list.add("Лама");
        list.add("Лапа");
        list.add("Луна");
        list.add("Лампа");
        list.add("Локоть");
        list.add("Лошадь");
        list.add("Лимон");
        list.add("Лена");
        list.add("Леня");
        list.add("Лифт");
        list.add("Лимфа");
        list.add("Лоб");
        list.add("Лепешка");
        list.add("Лайм");
        list.add("Липа");
        list.add("Лоза");
        list.add("Лак");
        list.add("Лекало");
        list.add("Лицо");
        list.add("Лопость");

        return list;
    }
}

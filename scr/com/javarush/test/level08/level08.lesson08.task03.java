package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("family","name");
        map.put("family1","name");
        map.put("family2","name");
        map.put("family9","name1");
        map.put("family3","name2");
        map.put("family4","name2");
        map.put("family6","name2");
        map.put("family10","name2");
        map.put("family7","name2");
        map.put("family5","name3");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int name1 = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)) {name1++;}
        }
        return name1;

    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {

        int lastname = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)){lastname++;}
        }
        return  lastname;
    }
}




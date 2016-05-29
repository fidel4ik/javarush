package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

import java.lang.ref.SoftReference;

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("John",19,"Sumy");
        Man man2 = new Man("John2",29,"Sumy");

        Woman woman1 = new Woman("Katya",19,"Sumy");
        Woman woman2 = new Woman("Katya2",29,"Sumy");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man
    {
        private String name;
        private int age;
        private String address;
        public Man(String name){this.name = name;}
        public Man(String name, int age){this.name = name; this.age=age;}
        public Man(String name, int age, String address){this.name = name; this.age=age;this.address=address;}
    }
    public static class Woman
    {
        private String name;
        private int age;
        private String address;
        public Woman(String name){this.name = name;}
        public Woman(String name, int age){this.name = name; this.age=age;}
        public Woman(String name, int age, String address){this.name = name; this.age=age;this.address=address;}
    }

}


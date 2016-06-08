package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public final static ArrayList<Human> FAMILY = new ArrayList<>();
    public static void main(String[] args)
    {

        Human ded1 = new Human("Петя",true, 57);
        Human ded2 = new Human("Петя2",true  , 52);
        Human baba1 = new Human("baba1",false, 52);
        Human baba2 = new Human("baba2",false, 52);
        Human father = new Human("Коля",true, 25, ded1, baba1);
        Human mother = new Human("Марфа",false, 25, ded2, baba2);
        Human child1 = new Human("Аня",false, 2, father, mother);
        Human child2 = new Human("Аня2",false, 2, father, mother);
        Human child3 = new Human("Аня3",false, 2, father, mother);
        FAMILY.add(ded1);
        FAMILY.add(ded2);
        FAMILY.add(baba1);
        FAMILY.add(baba2);
        FAMILY.add(father);
        FAMILY.add(mother);
        FAMILY.add(child1);
        FAMILY.add(child2);
        FAMILY.add(child3);
        for (int i = 0; i < FAMILY.size(); i++)
        {
            System.out.println(FAMILY.get(i));
        }

    }




    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}

package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    int weigth;
    int age;
    String color;
    String addr;
    public void initialize(String name){this.name = name;}
    public void initialize(String name, int weigth, int age){this.name = name;this.weigth = weigth; this.age = age;}
    public void initialize(String name, int age){this.name = name;this.weigth = 10; this.age = age;}
    public void initialize(int weigth, String color){this.name = null; this.addr = null; this.age = 1; this.weigth= 10; this.color = color;}
    public void initialize(int weigth, String color, String addr){this.weigth = weigth; this.color = color; this.addr = addr;}

}


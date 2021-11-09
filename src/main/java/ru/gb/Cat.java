package ru.gb;

public class Cat {
    // ООП
    // 0. Абстракция
    // 1. Инкапсуляция
    // 2. Наследованиме
    // 3. Полиморфизм

    // private виден внутри класса
    // default виден внутри пакета
    // public виден везде
    private String name ; // поля класса
    private int age ;
    private  String color;
    private boolean good;


    Cat(int age){
        this("Мурзик", age);

    }

    Cat(String name){
        this(name,1);

    }
    Cat(String name, int age){
        setName(name);
        setAge(age);
    }

    void print() {
        System.out.printf("Кот по имени %s, возрастом %d лет, цвет окраса %s\n", name, age, color);

    }
    void  setAge(int age) {
        if (age > 0 && age <= 20) {
            this.age = age;
        }else {
            System.out.println("Возраст должен быть больше 0 и не более 20 лет");

        }

    }
    void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }else {
            System.out.println("Имя не может быть пустым");

        }
    }
     void setColor(String color) {
        this.color = color;
     }
     public String getName() {
        return this.name;
     }
}

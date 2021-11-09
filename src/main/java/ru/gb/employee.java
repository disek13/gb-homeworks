package ru.gb;

import java.util.Arrays;

public class employee {
    private String fio;
    private String posithion;
    private String email;
    private String phone;
    private double salary;
    private int age;



    public employee() {
        this("Иванов Иван Иванович","Менеджер", "ivanov@mail.ru", "8901001001", 150000.00, 35);

    }

    public employee(String fio, String posithion, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.posithion = posithion;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void print() {
        System.out.printf("ФИО: %s, должность: %s, e-mail: %s, телефон: %s, з/п: %f, возраст: %d", fio, posithion, email, phone, salary, age);
    }

    public static void main(String[] args) {
        //employee employee = new employee();
        //employee.print();
        employee[] persArray = new employee[5];
        persArray[0] = new employee();
        persArray[1] = new employee("Петров Сергей Петрович","Кадровик", "ivanov@mail.ru", "8901001001", 50000.00, 45);
        persArray[2] = new employee("Сидоров Олег Сергеевич","Директор", "ivanov@mail.ru", "8901001001", 250000.00, 50);
        persArray[3] = new employee("Губанов Петр Вячеславович","Бухгалтер", "ivanov@mail.ru", "8901001001", 180000.00, 32);
        persArray[4] = new employee("Ильин Николай Андреевич","Экономист", "ivanov@mail.ru", "8901001001", 55000.00, 28);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                System.out.printf("ФИО: %s, должность: %s, e-mail: %s, телефон: %s, з/п: %.2f, возраст: %d%n", persArray[i].fio, persArray[i].posithion, persArray[i].email, persArray[i].phone, persArray[i].salary, persArray[i].age);
                System.out.println("");
            }

        }



    }
}

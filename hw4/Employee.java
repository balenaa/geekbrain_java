package hw4;


/*
*
* Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
Конструктор класса должен заполнять эти поля при создании объекта;
Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
Вывести при помощи методов из пункта 3 ФИО и должность.
*
* */

public class Employee {
    private String fullname, jobTitle, phone;
    private double salary;
    private int age;

    public String getFullname(){
        return this.fullname;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    public String getPhone(){
        return this.phone;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double value){
        this.salary = value;
    }


    public int getAge(){
        return this.age;
    }

    public Employee (String fullname, String jobTitle, String phone, double salary, int age){
        this.fullname = fullname;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return String.format("FN: %20s; JT: %10s; P: %6s; S:%8.2f; A:%3d", this.fullname, this.jobTitle, this.phone, this.salary, this.age);
    }

}

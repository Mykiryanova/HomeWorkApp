import java.util.Arrays;

//1. Создать класс "Сотрудник" с полями:
// ФИО, должность, email, телефон, зарплата, возраст.
public class Workers {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;
// 2. Конструктор класса должен заполнять эти поля при создании объекта.
// Опишем конструктор
 Workers(String newName, String newPosition, String newEmail, String newPhone, int newSalary, int newAge) {
    name = newName;
    position = newPosition;
    email = newEmail;
    phone = newPhone;
    salary = newSalary;
    age = newAge;
}
// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    void information() {
        System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }
}




import java.util.Arrays;

public class Main {
    public static <workersArray> void main(String[] args) {
        // Создадим пример для проверки класса Workers
        // тип_данных (Worker)  имя_переменной (director) = new тип_данных() (new Worker())
        Workers director = new Workers("Иванов ИИ", "директор", "iii@ya.ru", "222-222", 100000, 35);
        // выведем информацию о сотруднике в консоль (метод information прописан внутри класса Workers)

        System.out.println("Пример для проверки, что метод information из класса Workers работает");
        director.information();
        System.out.println(); // Просто пробел, чтобы разграничить задания
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);

        Workers[] workersArray = new Workers[5];
        workersArray[0] = new Workers("Петров АБ", "Аналитик", "pab@ya.ru", "222-225", 80000, 48);
        workersArray[1] = new Workers("Сидоров ВЕ", "Тестировщик", "sve@ya.ru", "222-201", 70000, 33);
        workersArray[2] = new Workers("Сальникова МЮ", "Разработчик", "kmyu@ya.ru", "222-123", 80000, 30);
        workersArray[3] = new Workers("Мосс АВ", "Дизайнер", "tav@ya.ru", "222-789", 80000, 44);
        workersArray[4] = new Workers("Третьякова ДЮ", "Архитектор", "tdyu@ya.ru", "222-564", 80000, 29);


        System.out.println("Информация о сотрудниках");
        // цикл для отображения всех сотрудников
        for (int i = 0; i < workersArray.length; i++) {
            workersArray[i].information();
        }
        System.out.println(); // Просто пробел, чтобы разграничить задания
// 5.  С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        System.out.println("Информация о сотрудниках, старше 40 лет");
        for (int i = 0; i < workersArray.length; i++) {
            if (workersArray[i].age > 40) {
                workersArray[i].information();
            }
        }
    }
}




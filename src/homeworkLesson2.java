public class homeworkLesson2 {
    public static void main(String[] args){

        int a = 5;
        int b = 18;
        boolean summa = sumNumbers(a, b);
        System.out.println(summa);

        printNumber();

        int x = -5;
        boolean number = compareNumbers(x);
        System.out.println(number);

        printMessage(3, "Домашнее задание выполнено на отлично");
    }


    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
   // что их сумма лежит в пределах от 10 до 20 (включительно),
   // если да – вернуть true, в противном случае – false.
    public static boolean sumNumbers (int a, int b) {

        return (( a + b ) >= 10 && ( a + b ) <= 20 );
    }

// 2. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

    public static void printNumber(){
        int numer = -36;
        if (numer >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    // 3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false
    // если положительное.
public static  boolean compareNumbers(int a){
        return (a < 0);
}

// 4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void printMessage(int y, String message){
        int i = 1;
        while (i <= y) {
            System.out.println(message);
            i++;
        }
    }

}

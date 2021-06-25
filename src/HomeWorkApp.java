public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("My Homework to Lesson 1");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int a = 7;
        int b = -12;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 80;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }else if (value > 100) {
            System.out.println("Зеленый");
        }
        }

    public static void compareNumbers(){
        int a = 36;
        int b = 88;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
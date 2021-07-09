import java.util.Random;
import java.util.Scanner;

public class homeworkLesson4 {

    // Задаем условия поля:

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    // Зададим возможные значения поля:
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final char DOT_EMPTY = '.';


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isWinner(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printMap();
            if (isWinner(DOT_0)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }
    //Начальные значения полей заполнены .

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
        }
    }

    // Выведем поле в консоль
    public static void printMap() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " "); // Пронумируем поле по горизонтали от 0 до 3
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " "); //нумеруем по вертикали с 1 до 3
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " "); //отображаем наше поле заполненое точками
            }
            System.out.println();


        }
    }

    // Ход человека
    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты x и y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    // Ход компьютера
    public static void computerTurn() {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCellValid(x, y));
        map[y][x] = DOT_0;
        System.out.println("Компьютер сходил на " + (x + 1) + " " + (y + 1));
    }

    // Проверка победы
    public static boolean isWinner(char sim) {


        if (map[0][0] == sim && map[0][1] == sim && map [0][2] == sim) return true;
        if (map[1][0] == sim && map[1][1] == sim && map [1][2] == sim) return true;
        if (map[2][0] == sim && map[2][1] == sim && map [2][2] == sim) return true;
        if (map[0][0] == sim && map[1][0] == sim && map [2][0] == sim) return true;
        if (map[0][1] == sim && map[1][1] == sim && map [2][1] == sim) return true;
        if (map[0][2] == sim && map[1][2] == sim && map [2][2] == sim) return true;
        if (map[0][0] == sim && map[1][1] == sim && map [2][2] == sim) return true;
        if (map[0][2] == sim && map[1][1] == sim && map [2][0] == sim) return true;
        return false;

    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

}









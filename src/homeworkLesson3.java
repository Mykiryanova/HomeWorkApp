import java.util.Arrays;

public class homeworkLesson3 {
    public static void main(String[] Args) {


        // 1.  Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] changes = new int[10];
        changes[0] = 1;
        changes[1] = 1;
        changes[2] = 0;
        changes[3] = 0;
        changes[4] = 1;
        changes[5] = 0;
        changes[6] = 1;
        changes[7] = 1;
        changes[8] = 0;
        changes[9] = 0;
        // int p = changes[]; почему-то не получается задать

        for (int i = 0; i < 10; i++) {
            if (changes[i] == 0) {
                changes[i] = 1;
            } else {
                changes[i] = 0;
            }
        }
        System.out.println(Arrays.toString(changes));

        // 2. Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr;
        arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (i + 1);
        }
        String arrText = Arrays.toString(arr);
        System.out.println(arrText);

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2

        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < 12; i++) {
            if (multiplication[i] < 6) {
                multiplication[i] = multiplication[i] * 2;
            }
        }
        String multiText = Arrays.toString(multiplication);
        System.out.println(multiText);

        // 4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        int[][] tenArr = new int[7][7];
        for (int i = 0; i < tenArr.length; i++) {
            int j = i;
            tenArr[i][j] = 1;
        }
        for (int i = 0; i < tenArr.length; i++) {
            int j = 6 - i;
            tenArr[i][j] = 1;
        }

        for (int i = 0; i < tenArr.length; i++) {

            String ten = Arrays.toString(tenArr[i]);
            System.out.println(ten);
        }

        argForArr(6,"Hello");
    }

// 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
//     и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

//Метод прописан ниже, вызов метода выше в фунции main


    public static void argForArr(int len, String initialValue){
        String[] arr = new String[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

}

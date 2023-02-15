import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        extraTask5();
        extraTask6();
        extraTask7();
    }

    public static void task1() {
        System.out.println("Задача1");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        double[] second = {1.57, 7.654, 9.986};
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        // Задача2
        System.out.println("Задача2");
        System.out.print(first[0] + ", ");
        System.out.print(first[1] + ", ");
        System.out.println(first[2]);
        System.out.print(second[0] + ", ");
        System.out.print(second[1] + ", ");
        System.out.println(second[2]);
        System.out.print(seasons[0] + ", ");
        System.out.print(seasons[1] + ", ");
        System.out.print(seasons[2] + ", ");
        System.out.println(seasons[3]);
        System.out.println("Способ из шпаргалки");
        for (int k = 0; k < seasons.length; k++) {
            if (k == seasons.length - 1) {
                System.out.println(seasons[k]);
                break;
            }
            System.out.print(seasons[k] + ", ");
        }
        // Задача3
        System.out.println("Задача3");
        System.out.print(first[2] + ", ");
        System.out.print(first[1] + ", ");
        System.out.println(first[0]);
        System.out.print(second[2] + ", ");
        System.out.print(second[1] + ", ");
        System.out.println(second[0]);
        System.out.print(seasons[3] + ", ");
        System.out.print(seasons[2] + ", ");
        System.out.print(seasons[1] + ", ");
        System.out.println(seasons[0]);
        System.out.println("Способ из шпаргалки");
        for (int j = first.length - 1; j > -1; j--) {
            if (j == 0) {
                System.out.println(first[j]);
                break;
            }
            System.out.print(first[j] + ", ");
        }
        // Задача4
        System.out.println("Задача4");
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i]++;
            }
        }
        System.out.println(Arrays.toString(first));
    }

    public static void extraTask5() {
        System.out.println("Extra task 5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void extraTask6() {
        System.out.println("Extra task 6");
        int[] arr = {5, 4, 3, 2, 1};
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrNew));
    }

    public static void extraTask7() {
        System.out.println("Extra task 7");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int a, b; //временные переменные
        int n = (int) Math.round(arr.length / 2.0);  // середина массива
        for (int i = 0; i < n; i++) {
            a = arr[i];
            b = arr[arr.length - 1 - i];
            arr[i] = b;
            arr[arr.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
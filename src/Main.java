import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
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
}
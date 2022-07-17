import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // �������� 1:
        Random random = new Random();

        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {

            int number = random.nextInt(50);

            while (number % 2 != 0) {

                number = random.nextInt(50);

            }
            array[i] = number;
        }
        System.out.println("�������� 1:");
        System.out.println(Arrays.toString(array));

        // �������� 2:
        System.out.println("�������� 2:");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        // �������� 3:
        char[] array2 = new char[15];
        System.out.println("\n�������� 3:");
        for (int i = 0; i < array.length; i++) {

            array2[i] = (char) random.nextInt(255);
            System.out.print(array2[i] + " ");
        }

        // �������� 4:
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\n�������� 4:");
        System.out.println("Max is " + max);

        // �������� 5:
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("�������� 5:");
        System.out.println("Min is " + min);

        // �������� 6:
        int sum = 0;
        double avrg = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        avrg = (double) sum / array.length;
        System.out.println("�������� 6:");
        System.out.println("Avarage is " + avrg);

        // �������� 7:
        int maxEven = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxEven && array[i] % 2 == 0) {
                maxEven = array[i];
            }
        }
        System.out.println("�������� 7:");
        System.out.println("Max even is " + maxEven);

        // �������� 8:

        System.out.println("�������� 8:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

    }
}

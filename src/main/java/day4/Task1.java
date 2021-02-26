package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        Random random = new Random();
        int more = 0, unit = 0, even = 0, odd = 0, sumArr = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10) + 1;
        }

        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + " ");
            if (myArray[j] > 8) {
                more++;
            }
            if (myArray[j] == 1) {
                unit++;
            }
            if (myArray[j] % 2 == 0) {
                even++;
            }
            if (myArray[j] % 2 == 1) {
                odd++;
            }
            sumArr = sumArr + myArray[j];
        }
        System.out.println();
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + more);
        System.out.println("Количество чисел равных 1: " + unit);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sumArr);
    }
}

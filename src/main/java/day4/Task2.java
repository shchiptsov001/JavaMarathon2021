package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = new int[100];
        Random random = new Random();
        int max = 0, min = 10000, quantity = 0, sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10000) + 1;
        }

        for (int arrayInt : myArray) {
            if (max < arrayInt) {
                max = arrayInt;
            }
            if (min > arrayInt) {
                min = arrayInt;
            }
            if (arrayInt % 10 == 0) {
                quantity++;
                sum = sum + arrayInt;
            }
//            System.out.println(arrayInt);
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + quantity);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sum);

    }
}

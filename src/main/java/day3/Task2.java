package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        while (y != 0) {
            System.out.println(x / y);
            x = scanner.nextDouble();
            y = scanner.nextDouble();
        }
    }
}

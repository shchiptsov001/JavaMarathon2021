package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;

        for (int i = 0; i < 5; i++) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(x / y);
        }
    }
}

package part_3_arrays_.PreciseNumber;

import java.util.Scanner;

public class PreciseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Podaj liczę całkowitą różną od zero");
            double number = scanner.nextDouble();
            for (; ; ) {
                if (number == 0) {
                    System.out.println("Zła liczba.");
                    break;
                } else if (number > 0) {
                    for (double i = 0; i < (number + 0.1); i += 0.1) {
                        System.out.printf("%.1f, ", i);
                    }
                    System.out.println();
                    break;
                } else if (number < 0) {
                    for (double i = 0; i > (number - 0.1); i -= 0.1) {
                        System.out.printf("%.1f, ", i);
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
}

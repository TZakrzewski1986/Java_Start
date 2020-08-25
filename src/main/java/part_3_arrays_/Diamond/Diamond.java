package part_3_arrays_.Diamond;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cyfrę:");
        int number = scanner.nextInt();

        for (int x = 0; x <= number; x++) {
            for (int y = x; y <= number; y++) {
                System.out.print(" ");
            }
            for (int z = number; z > 0; z--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

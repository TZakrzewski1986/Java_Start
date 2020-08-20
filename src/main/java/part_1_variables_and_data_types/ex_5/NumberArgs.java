package part_1_variables_and_data_types.ex_5;

import java.util.ArrayList;
import java.util.List;

public class NumberArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Brak argumentów");
            return;
        }
        System.out.printf("Liczba argumentów: %d\n", args.length);
        printArgs(args);
        int[] numbers = convertStringoIntArray(args);
        printSquares(numbers);
        printSum(numbers);
    }

    private static void printSum(int[] numbers) {
        List<String> list = new ArrayList<>(numbers.length);
        int sum = 0;
        for (int number : numbers) {
            list.add(Integer.toString(number));
            sum += number;
        }
        String leftSideSum = String.join("+", list);
        System.out.printf("%s=%d\n", leftSideSum, sum);
    }

    private static void printSquares(int[] numbers) {
        for (int number : numbers) {
            System.out.print(Math.pow(number, 2) + " ");
        }
        System.out.println();
    }

    private static int[] convertStringoIntArray(String[] strArray) {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.valueOf(strArray[i]);
        }
        return intArray;
    }

    private static void printArgs(String[] array) {
        for (String arg : array) {
            System.out.println(arg + " ");
        }
        System.out.println();
    }
}

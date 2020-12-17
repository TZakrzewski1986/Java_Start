package part_3_arrays_.OperationsOnArrays;

import java.util.Arrays;

public class OperationsOnArrayRunner {
    public static void main(String[] args) {
        int[][] multiArray1 = {
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3}
        };
        int[][] multiArray2 = {
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5},
                {6, 6, 6, 6, 6}
        };

        int[][] biggerArray = OperationsOnArrays.theBiggestArray(multiArray1, multiArray2);
        System.out.println("Większa tablica:");
        for (int[] ints : biggerArray) {
            System.out.println(Arrays.toString(ints));
        }
    }

}

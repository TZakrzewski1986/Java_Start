package part_3_arrays_.OperationsOnArrays;

public class OperationsOnArrays {

    public static int[][] theBiggestArray(int[][] x, int[][] y) {
        int sumOfArrayX = 0;
        int sumOfArrayY = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
                sumOfArrayX += x[i][j];
        }
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++)
                sumOfArrayX += x[i][j];
        }

        return sumOfArrayX > sumOfArrayY ? x : y;
    }
}

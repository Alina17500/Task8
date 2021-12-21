package ru.vsu.cs.volobueva;

public class TransformArray {
    public static int[][] transformArray(int[][] array) {
        int maxElement = searchForMaxElement(array);
        int minElement = searchForMinElement(array);

        boolean[] arrayRows = deleteRows(array, maxElement, minElement);
        boolean[] arrayColumns = deleteColumns(array, maxElement, minElement);

        return fillResultArray(array, arrayRows, arrayColumns);
    }

    private static int searchForMaxElement(int[][] array) {
        int maxElement = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > maxElement) {
                    maxElement = anInt;
                }
            }
        }
        return maxElement;
    }

    private static int searchForMinElement(int[][] array) {
        int minElement = 9000000;

        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt < minElement) {
                    minElement = anInt;
                }
            }
        }
        return minElement;
    }

    private static boolean[] deleteRows(int[][] array, int maxElement, int minElement) {
        boolean[] arrayRows = new boolean[array.length];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                arrayRows[row] = array[row][column] == maxElement || array[row][column] == minElement;

            }
        }
        return arrayRows;
    }

    private static boolean[] deleteColumns(int[][] array, int maxElement, int minElement) {
        boolean[] arrayColumns = new boolean[array[0].length];

        for (int[] ints : array) {
            for (int column = 0; column < ints.length; column++) {
                if (ints[column] == maxElement || ints[column] == minElement) {
                    arrayColumns[column] = true;
                }

            }
        }
        return arrayColumns;
    }

    private static int[][] fillResultArray(int[][] array, boolean[] arrayRows, boolean[] arrayColumns) {
        int[][] resultArray = new int[countLengthInResultArray(arrayRows)][countLengthInResultArray(arrayColumns)];
        int row2 = 0;
        int column2;

        for (int row = 0; row < array.length; row++) {
            column2 = 0;

            if (!arrayRows[row]) {
                for (int column = 0; column < array[row].length; column++) {
                    if (!arrayColumns[column]) {
                        resultArray[row2][column2] = array[row][column];
                        column2++;
                    }
                }
                row2++;
            }
        }
        return resultArray;
    }

    private static int countLengthInResultArray(boolean[] array) {
        int k = 0;

        for (boolean arr : array) {
            if (!arr) {
                k++;
            }
        }
        return k;
    }
}


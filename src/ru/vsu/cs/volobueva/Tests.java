package ru.vsu.cs.volobueva;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.util.ArrayUtils;

public class Tests {
    @Test
    public void testStandardSituation() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/inputArray01.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult01.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void testSpecialElementsOnlyInFirstRowAndColumn() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/inputArray02.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult02.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void testOnlyMaxMinElements() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/inputArray03.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult03.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void testSituationWithDeletionAtEdges() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/inputArray04.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult04.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void testOnlyOneNumber() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/inputArray05.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult05.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }
}
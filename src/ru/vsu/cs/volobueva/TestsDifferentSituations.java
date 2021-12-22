package ru.vsu.cs.volobueva;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.util.ArrayUtils;

public class TestsDifferentSituations {
    @Test
    public void testStandardSituation() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input01TestStandardSituation.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult01.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void testSpecialElementsOnlyInFirstRowAndColumn() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input02TestSpecialElementsOnlyInFirstRowAndColumn.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult02.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void testOnlyMaxMinElements() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input03TestOnlyMaxMinElements.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult03.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void testSituationWithDeletionAtEdges() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input04TestSituationWithDeletionAtEdges.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult04.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void testOnlyOneNumber() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input05TestOnlyOneNumber.txt");
        arrayForTest = TransformArray.transformArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/outputResult05.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }
}
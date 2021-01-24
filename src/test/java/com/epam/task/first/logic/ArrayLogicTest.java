package com.epam.task.first.logic;

import com.epam.task.first.entity.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayLogicTest {

    private Array array;
    private ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testFindMaxWhenPositiveNumbersApplied() {
        //given
        array = new Array(1, 2, 3, 8, 5, 6);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(8, actual);
    }

    @Test
    public void testFindMaxWhenNegativeNumbersApplied() {
        //given
        array = new Array(-1, -2, -3, -8, -5, -6);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMaxWhenPositiveAndNegativeNumbersApplied() {
        //given
        array = new Array(-1, 0, 3, -8, 5, -6);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(5, actual);
    }

    @Test
    public void testFindMinWhenPositiveNumbersApplied() {
        //given
        array = new Array(5, 2, 3, 8, 1, 6);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindMinWhenNegativeNumbersApplied() {
        //given
        array = new Array(-1, -2, -3, -8, -5, -6);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(-8, actual);
    }

    @Test
    public void testFindMinWhenPositiveAndNegativeNumbersApplied() {
        //given
        array = new Array(-1, 0, 3, -8, 5, -6);


        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(-8, actual);
    }

    @Test
    public void testDoubleOddNumbersWhenPositiveNumbersApplied() {
        //given
        array = new Array(5, 2, 3, 8, 1, 7);
        Array testArray = new Array(10, 2, 6, 8, 2, 14);

        //when
        Array actualArray = arrayLogic.doubleOddNumbers(array);

        //then

        Assert.assertTrue(testArray.equals(actualArray));
    }

    @Test
    public void testDoubleOddNumbersWhenNegativeNumbersApplied() {
        //given
        array = new Array(-5, -2, -3, -8, -1, -7);
        Array testArray = new Array(-10, -2, -6, -8, -2, -14);

        //when
        Array actualArray = arrayLogic.doubleOddNumbers(array);

        //then

        Assert.assertTrue(testArray.equals(actualArray));
}


    @Test
    public void testSumArrayWhenPositiveNumbersApplied() {
        //given
        array = new Array(5, 2, 3, 8, 1, 7);

        //when
        int sum = arrayLogic.sumArray(array);

        //then
        Assert.assertEquals(26, sum);

    }

    @Test
    public void testSumArrayWhenNegativeNumbersApplied() {
        //given
        array = new Array(-5, -2, -3, -8, -1, -7);

        //when
        int sum = arrayLogic.sumArray(array);

        //then
        Assert.assertEquals(-26, sum);

    }

    @Test
    public void testSumArrayWhenPositiveAndNegativeNumbersApplied() {
        //given
        array = new Array(5, -2, 3, -8, 1, -7);

        //when
        int sum = arrayLogic.sumArray(array);

        //then
        Assert.assertEquals(-8, sum);

    }

    @Test
    public void testGetAverageNumberWhenPositiveNumbersApplied() {
        //given
        array = new Array(5, 2, 3, 8, 1, 7);

        //when
        int actual = arrayLogic.getAverageNumber(array);

        //then
        Assert.assertEquals(4, actual);

    }

    @Test
    public void testGetAverageNumberWhenNegativeNumbersApplied() {
        //given
        array = new Array(-5, -2, -3, -8, -1, -7);


        //when
        int actual = arrayLogic.getAverageNumber(array);

        //then
        Assert.assertEquals(-4, actual);

    }

    @Test
    public void testGetAverageNumberWhenPositiveAndNegativeNumbersApplied() {
        //given
        array = new Array(5, -2, 3, -8, 1, -7);


        //when
        int actual = arrayLogic.getAverageNumber(array);

        //then
        Assert.assertEquals(-1, actual);

    }

    @Test
    public void testCountPositiveNumbersWhenPositiveAndNegativeNumbersApplied() {
        //given
        array = new Array(5, -2, 3, -8, 1, -7, 0);


        //when
        int count = arrayLogic.countPositiveNumbers(array);

        //then
        Assert.assertEquals(3, count);

    }

    @Test
    public void testCountNegativeNumbersWhenPositiveAndNegativeNumbersApplied() {
        //given
        array = new Array(5, -2, 3, -8, 1, -7, 0);


        //when
        int count = arrayLogic.countNegativeNumbers(array);

        //then
        Assert.assertEquals(3, count);

    }

    @Test
    public void testCountPositiveNumbersWhenWhenNoNumbersApplied() {

        //given
        array = new Array();

        //when

        int count = arrayLogic.countPositiveNumbers(array);

        //then
        Assert.assertEquals(0, count);
    }

    @Test
    public void testCountNegativeNumbersWhenWhenNoNumbersApplied() {

        //given
        array = new Array();

        //when

        int count = arrayLogic.countNegativeNumbers(array);

        //then
        Assert.assertEquals(0, count);
    }

}

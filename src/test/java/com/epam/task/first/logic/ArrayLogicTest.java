package com.epam.task.first.logic;

import com.epam.task.first.entity.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayLogicTest {

    @Test
    public void testFindMaxWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 2, 3, 8, 5, 6);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int actual = arrayLogic.findMax();

        //then
        Assert.assertEquals(8, actual);
    }

    @Test
    public void testFindMaxWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -2, -3, -8, -5, -6);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int actual = arrayLogic.findMax();

        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMaxWhenPositiveAndNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, 0, 3, -8, 5, -6);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int actual = arrayLogic.findMax();

        //then
        Assert.assertEquals(5, actual);
    }

    @Test
    public void testFindMaxWhenNoNumbersApplied() {
        //given
        Array array = new Array();
        ArrayLogic arrayLogic = new ArrayLogic(array);
        boolean isException = false;

        //when
        try {
            int actual = arrayLogic.findMax();
        } catch (IndexOutOfBoundsException ex) {
            isException = true;
        }


        //then
        Assert.assertTrue(isException);
    }

    @Test
    public void testFindMinWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(5, 2, 3, 8, 1, 6);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int actual = arrayLogic.findMin();

        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindMinWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -2, -3, -8, -5, -6);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int actual = arrayLogic.findMin();

        //then
        Assert.assertEquals(-8, actual);
    }

    @Test
    public void testFindMinWhenPositiveAndNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, 0, 3, -8, 5, -6);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int actual = arrayLogic.findMin();

        //then
        Assert.assertEquals(-8, actual);
    }

    @Test
    public void testFindMinWhenNoNumbersApplied() {
        //given
        Array array = new Array();
        ArrayLogic arrayLogic = new ArrayLogic(array);
        boolean isException = false;

        //when
        try {
            int actual = arrayLogic.findMin();
        } catch (IndexOutOfBoundsException ex) {
            isException = true;
        }

        //then
        Assert.assertTrue(isException);
    }

    @Test
    public void testDoubleOddNumbersWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(5, 2, 3, 8, 0, 7);
        ArrayLogic arrayLogic = new ArrayLogic(array);
        ArrayList<Integer> elements = array.getElements();
        boolean isDoubled = true;

        //when
        arrayLogic.doubleOddNumbers();

        //then
        ArrayList<Integer> changedElements = array.getElements();
        for (int element : elements) {
            if (element % 2 != 0) {
                int index = elements.indexOf(element);
                int elementFromChangedArray = changedElements.get(index);
                if (element * 2 != elementFromChangedArray) {
                    isDoubled = false;
                    break;
                }
            }
        }

        Assert.assertFalse(isDoubled);
    }

    @Test
    public void testDoubleOddNumbersWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-5, -2, -3, -8, -1, -7);
        ArrayLogic arrayLogic = new ArrayLogic(array);
        ArrayList<Integer> elements = array.getElements();
        boolean isDoubled = true;

        //when
        arrayLogic.doubleOddNumbers();

        //then
        ArrayList<Integer> changedElements = array.getElements();
        for (int element : elements) {
            if (element % 2 != 0) {
                int index = elements.indexOf(element);
                int elementFromChangedArray = changedElements.get(index);
                if (element * 2 != elementFromChangedArray) {
                    isDoubled = false;
                    break;
                }
            }
        }

        Assert.assertFalse(isDoubled);
    }

    @Test
    public void testDoubleOddNumbersWhenNoNumbersApplied() {
        //given
        Array array = new Array();
        ArrayLogic arrayLogic = new ArrayLogic(array);
        boolean isException = false;

        //when
        try {
            arrayLogic.doubleOddNumbers();
        } catch (IndexOutOfBoundsException ex) {
            isException = true;
        }

        //then
        Assert.assertTrue(isException);
    }

    @Test
    public void testSumArrayWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(5, 2, 3, 8, 1, 7);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int sum = arrayLogic.sumArray();

        //then
        Assert.assertEquals(26, sum);

    }

    @Test
    public void testSumArrayWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-5, -2, -3, -8, -1, -7);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int sum = arrayLogic.sumArray();

        //then
        Assert.assertEquals(-26, sum);

    }

    @Test
    public void testSumArrayWhenPositiveAndNegativeNumbersApplied() {
        //given
        Array array = new Array(5, -2, 3, -8, 1, -7);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int sum = arrayLogic.sumArray();

        //then
        Assert.assertEquals(-8, sum);

    }

    @Test
    public void testSumArrayWhenWhenNoNumbersApplied() {
        //given
        Array array = new Array();
        ArrayLogic arrayLogic = new ArrayLogic(array);
        boolean isException = false;

        //when
        try {
            int sum = arrayLogic.sumArray();
        } catch (IndexOutOfBoundsException ex) {
            isException = true;
        }

        //then
        Assert.assertTrue(isException);
    }

    @Test
    public void testGetAverageNumberWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(5, 2, 3, 8, 1, 7);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        String actual = arrayLogic.getAverageNumber();

        //then
        Assert.assertEquals("4,33", actual);

    }

    @Test
    public void testGetAverageNumberWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-5, -2, -3, -8, -1, -7);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        String actual = arrayLogic.getAverageNumber();

        //then
        Assert.assertEquals("-4,33", actual);

    }

    @Test
    public void testGetAverageNumberWhenPositiveAndNegativeNumbersApplied() {
        //given
        Array array = new Array(5, -2, 3, -8, 1, -7);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        String actual = arrayLogic.getAverageNumber();

        //then
        Assert.assertEquals("-1,33", actual);

    }

    @Test
    public void testGetAverageNumberWhenWhenNoNumbersApplied() {
        //given
        Array array = new Array();
        ArrayLogic arrayLogic = new ArrayLogic(array);
        boolean isException = false;

        //when
        try {
            String actual = arrayLogic.getAverageNumber();
        } catch (IndexOutOfBoundsException ex) {
            isException = true;
        }

        //then
        Assert.assertTrue(isException);
    }

    @Test
    public void testCountPositiveNumbersWhenPositiveAndNegativeNumbersApplied() {
        //given
        Array array = new Array(5, -2, 3, -8, 1, -7, 0);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int count = arrayLogic.countPositiveNumbers();

        //then
        Assert.assertEquals(3, count);

    }

    @Test
    public void testCountNegativeNumbersWhenPositiveAndNegativeNumbersApplied() {
        //given
        Array array = new Array(5, -2, 3, -8, 1, -7, 0);
        ArrayLogic arrayLogic = new ArrayLogic(array);

        //when
        int count = arrayLogic.countNegativeNumbers();

        //then
        Assert.assertEquals(3, count);

    }

    @Test
    public void testCountPositiveNumbersWhenWhenNoNumbersApplied() {
        //given
        Array array = new Array();
        ArrayLogic arrayLogic = new ArrayLogic(array);
        boolean isException = false;

        //when
        try {
            int count = arrayLogic.countPositiveNumbers();
        } catch (IndexOutOfBoundsException ex) {
            isException = true;
        }

        //then
        Assert.assertTrue(isException);
    }

    @Test
    public void testCountNegativeNumbersWhenWhenNoNumbersApplied() {
        //given
        Array array = new Array();
        ArrayLogic arrayLogic = new ArrayLogic(array);
        boolean isException = false;

        //when
        try {
            int count = arrayLogic.countNegativeNumbers();
        } catch (IndexOutOfBoundsException ex) {
            isException = true;
        }

        //then
        Assert.assertTrue(isException);
    }

    /*
    PS. Я понимаю, что NoNumbers тесты здесь скорее всего не нужны(выглядят они по меньшей мере немного нелепо),
    но я пишу тесты первый раз и решил перестраховаться.
     */
}

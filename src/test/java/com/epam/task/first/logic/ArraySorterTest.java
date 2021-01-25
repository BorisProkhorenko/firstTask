package com.epam.task.first.logic;

import com.epam.task.first.entity.Array;
import com.epam.task.first.sort.ArraySorter;
import com.epam.task.first.sort.BubbleArraySorter;
import com.epam.task.first.sort.SelectionArraySorter;
import com.epam.task.first.sort.ShellArraySorter;
import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {

    private ArraySorter sorter;
    private Array TEST_ARRAY = new Array(2, 1, 5, -3, 2);
    private Array expectedArray = new Array(-3, 1, 2, 2, 5);

    @Test
    public void testBubbleSort() {
        //given
        sorter = new BubbleArraySorter();

        //when
        sorter.sort(TEST_ARRAY);

        //then
        Assert.assertEquals(expectedArray,TEST_ARRAY);
    }

    @Test
    public void testSelectionSort() {
        //given
        sorter = new SelectionArraySorter();

        //when
        sorter.sort(TEST_ARRAY);

        //then
        Assert.assertEquals(expectedArray,TEST_ARRAY);
    }

    @Test
    public void testShellSort() {
        //given
        sorter = new ShellArraySorter();

        //when
        sorter.sort(TEST_ARRAY);

        //then
        Assert.assertEquals(expectedArray,TEST_ARRAY);
    }
}

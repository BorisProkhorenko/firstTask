package com.epam.task.first.logic;

import com.epam.task.first.entity.Array;
import com.epam.task.first.parsing.ArrayParser;
import org.junit.Assert;
import org.junit.Test;

public class ArrayParserTest {

    private ArrayParser parser = new ArrayParser();

    @Test
    public void testParseArrayWhenNoEmptyLineApplied() {
        //given
        String testData = "1m334 7jkh0009lm34";
        Array expectedArray = new Array(1, 334, 7, 9, 34);

        //when
        Array actualArray = parser.parseArray(testData);

        //than
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testParseArrayWhenNoEmptyLineWithMinusApplied() {
        //given
        String testData = "1m334 -7jk-h9lm-34";
        Array expectedArray = new Array(1, 334, -7, 9, -34);

        //when
        Array actualArray = parser.parseArray(testData);

        //than
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testParseArrayWhenEmptyLineApplied() {
        //given
        String testData = "";
        Array expectedArray = new Array();

        //when
        Array actualArray = parser.parseArray(testData);

        //than
        Assert.assertEquals(expectedArray, actualArray);
    }
}

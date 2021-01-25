package com.epam.task.first.logic;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    private final static String TEST_DATA = "./src/test/resources/input.txt";
    private DataReader reader = new DataReader();

    @Test
    public void testReadData() throws DataException {
        //given
        List<String> expected = new ArrayList<>();
        expected.add("2 3 4");
        expected.add("2g 45 6");
        expected.add("3 4 5");

        //when
        List<String> actual = reader.readData(TEST_DATA);

        //then
        Assert.assertEquals(expected, actual);
    }
}


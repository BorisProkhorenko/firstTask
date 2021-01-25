package com.epam.task.first.logic;

import com.epam.task.first.ArrayCreator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entity.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.validation.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATA = Arrays.asList("1 2 3", "546 5 3");
    private final static Array TEST_ARRAY = new Array(1, 2, 3, 546, 5, 3);


    @Test
    public void testProcess() throws DataException {
        //given
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.parseArray(anyString())).thenReturn(TEST_ARRAY);

        ArrayCreator arrayCreator = new ArrayCreator(reader, validator, parser);

        //when
        Array actualArray = arrayCreator.process("SomeFilePath");

        //than
        Assert.assertEquals(TEST_ARRAY, actualArray);
    }
}

package com.epam.task.first.logic;

import com.epam.task.first.validation.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    ArrayValidator arrayValidator = new ArrayValidator();

    @Test
    public void testValidateWhenValidDataApplied(){
        //given
        String validLine="4 5 6   6  7";

        //when
        boolean isValid = arrayValidator.validate(validLine);

        //then
        Assert.assertTrue(isValid);
    }

    @Test
    public void testInvalidateWhenValidDataApplied(){
        //given
        String validLine="4 5 6 b  6  7";

        //when
        boolean isValid = arrayValidator.validate(validLine);

        //then
        Assert.assertFalse(isValid);
    }

    @Test
    public void testInvalidateWhenEmptyLineApplied(){
        //given
        String validLine="";

        //when
        boolean isValid = arrayValidator.validate(validLine);

        //then
        Assert.assertFalse(isValid);
    }
}

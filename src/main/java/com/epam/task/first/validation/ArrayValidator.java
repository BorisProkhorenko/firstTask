package com.epam.task.first.validation;

import java.util.regex.Pattern;

public class ArrayValidator {

    private static final String REG_EXP = "[\\d\\s]+";

    public boolean validate(String line) {
        if (Pattern.matches(REG_EXP, line)) {
            return true;
        } else {
            return false;
        }
    }
}

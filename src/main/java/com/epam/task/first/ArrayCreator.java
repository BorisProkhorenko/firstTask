package com.epam.task.first;


import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entity.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.validation.ArrayValidator;

import java.util.List;

public class ArrayCreator {

    private DataReader reader;
    private ArrayValidator validator;
    private ArrayParser parser;

    public ArrayCreator(DataReader reader, ArrayValidator validator, ArrayParser parser) {
        this.reader = reader;
        this.validator = validator;
        this.parser = parser;
    }

    public Array process(String filePath) throws DataException {


        List<String> data = reader.readData(filePath);
        String dataLine = "";

        for (String line : data) {
            if (validator.validate(line)) {
                dataLine += " " + line;
            }
        }
        Array array = parser.parseArray(dataLine);
        return array;

    }
}

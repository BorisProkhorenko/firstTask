package com.epam.task.first.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> readData(String filePath) throws DataException {


        List<String> data = new ArrayList<>();
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();

            while (line != null) {
                data.add(line);
                line = bufferedReader.readLine();
            }

            fileReader.close();// can't be in finally because I use try-with-resources
            bufferedReader.close();

        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }

        return data;
    }
}

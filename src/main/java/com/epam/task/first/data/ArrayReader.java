package com.epam.task.first.data;

import sun.plugin.javascript.navig.Array;

import java.util.List;

public interface ArrayReader {

    List<String> readData() throws DataException;
}

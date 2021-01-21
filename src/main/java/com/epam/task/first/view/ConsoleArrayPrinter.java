package com.epam.task.first.view;

import com.epam.task.first.entity.Array;

import java.util.ArrayList;

public class ConsoleArrayPrinter implements ArrayPrinter{
    public void print(final Array array) {
        ArrayList<Integer> elements = array.getElements();
        for (Integer element:elements) {
            System.out.println(element);
        }
    }
}

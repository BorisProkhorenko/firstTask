package com.epam.task.first.sort;

import com.epam.task.first.entity.Array;

import java.util.List;

public class SelectionArraySorter implements ArraySorter {
    @Override
    public void sort(Array array) {
        List<Integer> elements = array.getElements();
        int indexOfMinElement = 0;
        for (int j = 0; j < elements.size() - 1; j++) {
            int min = elements.get(j);
            for (int i = j; i < elements.size(); i++) {

                if (elements.get(i) <= min) {
                    min = elements.get(i);
                    indexOfMinElement = i;
                }
            }
            int temp = elements.get(indexOfMinElement);
            elements.set(indexOfMinElement, elements.get(j));
            elements.set(j, temp);
        }
    }
}


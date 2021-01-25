package com.epam.task.first.sort;

import com.epam.task.first.entity.Array;

import java.util.List;

public class ShellArraySorter implements ArraySorter {


    @Override
    public void sort(Array array) {
        List<Integer> elements = array.getElements();
        for (int i = 1; i < elements.size() - 1; i++) {
            if (elements.get(i) > elements.get(i + 1)) {
                int temp = elements.get(i);
                elements.set(i, elements.get(i+1));
                elements.set(i+1, temp);
                if (i >= 1)
                    i -= 2;
            }
        }
    }
}

package com.epam.task.first.entity;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
    private final ArrayList<Integer> elements;

    public Array(ArrayList<Integer> elements) {
        this.elements = elements;
    }

    public Array(Integer... elements) {
        this.elements = new ArrayList<Integer>();
        Collections.addAll(this.elements, elements);
    }

    public ArrayList<Integer> getElements() {
        return elements;
    }

}

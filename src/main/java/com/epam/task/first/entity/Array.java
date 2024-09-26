package com.epam.task.first.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Array {
    private final List<Integer> elements;

    public Array(List<Integer> elements) {
        this.elements = elements;
    }

    public Array(Integer... elements) {
        this.elements = new ArrayList<Integer>();
        Collections.addAll(this.elements, elements);
    }

    public List<Integer> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Objects.equals(elements, array.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }

    @Override
    public String toString() {
        return "Array{" +
                "elements=" + elements +
                '}';
    }
}

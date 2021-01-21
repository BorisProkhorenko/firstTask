package com.epam.task.first.logic;

import com.epam.task.first.entity.Array;

import java.util.ArrayList;

public class ArrayLogic {
    private Array array;

    public ArrayLogic(Array array) {
        this.array = array;
    }

    public int findMax() {
        ArrayList<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new IndexOutOfBoundsException("Empty array");
        }
        int max = elements.get(0);
        for (int element : elements) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public int findMin() {
        ArrayList<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new IndexOutOfBoundsException("Empty array");
        }
        int min = elements.get(0);
        for (int element : elements) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    public void doubleOddNumbers() {
        ArrayList<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new IndexOutOfBoundsException("Empty array");
        }
        for (int element : elements) {
            if (element % 2 != 0) {
                element *= 2;
            }
        }
    }

    public int sumArray() {
        ArrayList<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new IndexOutOfBoundsException("Empty array");
        }
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }

    public String getAverageNumber() {
        ArrayList<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new IndexOutOfBoundsException("Empty array");
        }
        double sum = sumArray();
        Double averageNumber = sum / elements.size();
        String formatOfAverageNumber = String.format("%.2f",averageNumber);
        return formatOfAverageNumber;
    }

    public int countPositiveNumbers() {
        ArrayList<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new IndexOutOfBoundsException("Empty array");
        }
        int count = 0;
        for (int element : elements) {
            if (element > 0) {
                count++;
            }
        }
        return count;
    }

    public int countNegativeNumbers() {
        ArrayList<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new IndexOutOfBoundsException("Empty array");
        }
        int count = 0;
        for (int element : elements) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }
}

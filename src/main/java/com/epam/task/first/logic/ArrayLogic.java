package com.epam.task.first.logic;

import com.epam.task.first.entity.Array;

import java.util.List;

public class ArrayLogic {


    public int findMax(Array array) {
        List<Integer> elements = array.getElements();
        int max = elements.get(0);
        for (int element : elements) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public int findMin(Array array) {
        List<Integer> elements = array.getElements();
        int min = elements.get(0);
        for (int element : elements) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    public Array doubleOddNumbers(Array array) {
        List<Integer> elements = array.getElements();
        Array newArray = new Array();
        List<Integer> newArrayElements = newArray.getElements();
        for (int element : elements) {
            if (element % 2 == 0) {
                newArrayElements.add(element);
            } else {
                newArrayElements.add(element * 2);
            }
        }
        return newArray;
    }

    public int sumArray(Array array) {
        List<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new IndexOutOfBoundsException("Empty array");
        }
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }

    public int getAverageNumber(Array array) {
        List<Integer> elements = array.getElements();
        int sum = sumArray(array);
        return sum / elements.size();
    }

    public int countPositiveNumbers(Array array) {
        List<Integer> elements = array.getElements();
        int count = 0;
        for (int element : elements) {
            if (element > 0) {
                count++;
            }
        }
        return count;
    }

    public int countNegativeNumbers(Array array) {
        List<Integer> elements = array.getElements();
        int count = 0;
        for (int element : elements) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }


}

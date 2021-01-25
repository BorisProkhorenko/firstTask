package com.epam.task.first.parsing;

import com.epam.task.first.entity.Array;

import java.util.ArrayList;
import java.util.List;


public class ArrayParser {


    public Array parseArray(String data) {
        List<Integer> list = new ArrayList<>();

        int element = 0;
        int multiplier = 1;

        boolean isPreviousCharacterDigit = false;
        boolean isPreviousMinus = false;

        for (char character : data.toCharArray()) {

            if (Character.isDigit(character)) {

                element *= multiplier;
                element += Integer.parseInt(String.valueOf(character));
                multiplier = 10;
                isPreviousCharacterDigit = true;

            } else {

                addElement(list, isPreviousCharacterDigit, isPreviousMinus, element);
                isPreviousMinus = checkMinus(character);

                element = 0;
                multiplier = 1;
                isPreviousCharacterDigit = false;
            }
        }

        addElement(list, isPreviousCharacterDigit, isPreviousMinus, element);

        return new Array(list);
    }

    private void addElement(List<Integer> list, boolean isPreviousCharacterDigit,
                            boolean isPreviousMinus, int element) {

        if (isPreviousCharacterDigit) {
            if (isPreviousMinus) {
                element = -element;
            }
            list.add(element);
        }
    }

    private boolean checkMinus(char character) {
        if (character == '-') {
            return true;
        } else {
            return false;
        }
    }

}

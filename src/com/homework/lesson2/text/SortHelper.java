package com.homework.lesson2.text;

import java.util.Comparator;

public class SortHelper implements Comparator<String> {
    @Override
    public int compare(String word1, String word2) {
        if (word1.length() > word2.length()) {
            return 1;
        } else {
            if (word1.length() < word2.length()) {
                return -1;
            } else {
                return word1.compareTo(word2);
            }
        }
    }
}
package com.homework.lesson2.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextHelper {

    public TextHelper(String PATH) {
        ArrayList<String> LIST1;
        this.PATH = PATH;
        try {
            LIST1 = getListFromFile();
        } catch (FileNotFoundException e) {
            LIST1 = new ArrayList<>();
            e.printStackTrace();
        }
        LIST = LIST1;
    }

    private final String PATH;

    private final ArrayList<String> LIST;

    private List<String> wordsList = new ArrayList<>();

    public List<String> getWordsList() {
        return wordsList;
    }

    public int getWordCount() throws FileNotFoundException {
        File file = new File(PATH);
        Scanner scanner = new Scanner(file);
        int countOfWords = 0;

        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            countOfWords += array.length;
        }
        scanner.close();
        return countOfWords;
    }

    public List<String> getSortedList() throws FileNotFoundException {
        File file = new File(PATH);
        Scanner scanner = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            for (String item : array) {
                list.add(wordNormalized(item));
            }
        }

        list.sort(new SortHelper());

        return list;
    }

    public void countHowManyEachWords() throws FileNotFoundException {
        Map<String, Integer> counts = new HashMap<>();

        List<String> list = getSortedList();

        list.forEach(item -> {
            item = wordNormalized(item);
            if (!counts.containsKey(item)) {
                counts.put(item, 1);
            } else {
                counts.put(item, counts.get(item) + 1);
            }
        });

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз");
        }

    }

    public void reverseIteration() throws FileNotFoundException{
        ArrayList<String> list = getListFromFile();

        for (String str : new ReverseIterator<String>(list)) {
            System.out.println(str);
        }
    }

    private String wordNormalized(String word) {
        return word.replace(".", "")
                .toLowerCase();
    }

    public ArrayList<String> getListFromFile() throws FileNotFoundException {
        File file = new File(PATH);
        Scanner scanner = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            list.add(string);
            System.out.println(string);
        }
        System.out.println("===========================================================================");
        scanner.close();
        return list;
    }

    public String getStringByNumber(int number) {
        return LIST.get(number - 1);
    }

    static class ReverseIterator<T> implements Iterator<T>, Iterable<T> {

        private final List<T> list;
        private int position;

        public ReverseIterator(List<T> list) {
            this.list = list;
            this.position = list.size() - 1;
        }

        @Override
        public Iterator<T> iterator() {
            return this;
        }

        @Override
        public boolean hasNext() {
            return position >= 0;
        }

        @Override
        public T next() {
            return list.get(position--);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

}

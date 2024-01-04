package com.iteratorpattern;

public class IntegerArrayIterator extends Iterator {

    private IntegerArray integerArray;
    private int index;

    public IntegerArrayIterator(IntegerArray array) {
        index = 0;
        integerArray = array;
    }

    @Override
    public int CurrentItem() {
        return integerArray.myList.get(index);
    }

    @Override
    public void First() {
        index = 0;

    }

    @Override
    public boolean IsDone() {
        return integerArray.myList.size() == index;
    }

    @Override
    public void Next() {
        index++;

    }

}

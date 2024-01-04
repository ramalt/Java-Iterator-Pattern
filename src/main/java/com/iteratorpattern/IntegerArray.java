package com.iteratorpattern;

import java.util.ArrayList;

public class IntegerArray extends Aggregate {

    public ArrayList<Integer> myList;

    public IntegerArray() {
        myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

    }

    @Override
    public Iterator createIterator() {
        return new IntegerArrayIterator(this);
    }

}

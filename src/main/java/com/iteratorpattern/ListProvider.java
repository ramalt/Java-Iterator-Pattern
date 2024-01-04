package com.iteratorpattern;

public class ListProvider {
    public static void GetList(Aggregate ref) {
        Iterator iterator = ref.createIterator();

        for (iterator.First(); !iterator.IsDone(); iterator.Next()) {
            System.out.println("item: " + iterator.CurrentItem());
        }
    }
}

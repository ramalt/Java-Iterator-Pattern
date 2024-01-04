package com.iteratorpattern;

public class Main {
    public static void main(String[] args) {
        
        // ListProvider.GetList(new IntegerArray());

        Tree tree = new Tree(12);
        Tree right = new Tree(13);
        Tree left = new Tree(15);
        Tree right2 = new Tree(20);

        tree.AddLeft(left);
        tree.AddRight(right);
        right.AddRight(right2);

        ListProvider.GetList(tree);


    }
}
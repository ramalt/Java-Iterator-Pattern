package com.iteratorpattern;

public class Tree extends Aggregate {

    private Integer val;
    Tree left;
    Tree right;

    public Tree(int val) {
        this.val = val;
        left = null;
        right = null;

    }

    public int GetValue() {
        return val;
    }

    public void AddLeft(Tree branch) {
        left = branch;
    }

    public void AddRight(Tree branch) {
        right = branch;
    }

    @Override
    public Iterator createIterator() {
        return new TreeIterator(this);
    }

}

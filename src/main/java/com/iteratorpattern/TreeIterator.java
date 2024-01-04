package com.iteratorpattern;

import java.util.Stack;

public class TreeIterator extends Iterator {

    Tree init;
    Tree now;

    Stack<Tree> stack;

    public TreeIterator(Tree ref) {
        this.init = ref;
        stack = new Stack<>();

    }

    @Override
    public int CurrentItem() {
        now = stack.pop();
        return now.GetValue();
    }

    @Override
    public void First() {
        now = init;
        stack = new Stack<>();
        stack.push(now);
    }

    @Override
    public boolean IsDone() {
        return stack.isEmpty();
    }

    @Override
    public void Next() {
        if (now.left != null) {
            stack.push(now.left);
        }
        if (now.right != null) {
            stack.push(now.right);
        }

    }

}

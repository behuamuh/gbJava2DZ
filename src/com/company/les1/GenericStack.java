package com.company.les1;

import java.util.ArrayList;
import java.util.Collection;

public class GenericStack<E> implements Stack<E> {
    private int size;
    private int maxSize;
    private ArrayList<E> array;

    public GenericStack(int maxSize) {
        this.maxSize = maxSize;
        array = new ArrayList<>();
        size = 0;
    }

    @Override
    public void push(E element) throws StackException {
        if (isFull())
            throw new StackException();
        array.add(size++, element);

    }

    @Override
    public E pop() throws StackException {
        if (isEmpty())
            throw new StackException();
        return array.get(--size);
    }

    @Override
    public E peek() {
        return size == 0 ? null : array.get(size - 1);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size >= maxSize;
    }

    @Override
    public void pushAll(Collection<? extends E> src) throws StackException {
        for (E e : src) {
            push(e);
        }
    }

    @Override
    public void popAll(Collection<? super E> dst) throws StackException {
        if (dst == null) throw new StackException();
        while (!isEmpty()){
            dst.add(pop());
        }
    }
}

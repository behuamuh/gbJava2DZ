package com.company.les1;

import java.util.Collection;

public class GenericStackWithArray<E> implements Stack<E> {
    private int size;
    private int maxSize;
    private Object[] array;

    public GenericStackWithArray(int maxSize) {
        if (maxSize < 0) throw new IllegalArgumentException();
        this.maxSize = maxSize;
        size = 0;
        array = new Object[maxSize];
    }

    @Override
    public void push(E element) throws StackException {
        if (isFull())
            throw new StackException();
        array[size++] = element;
    }

    @Override
    public E pop() throws StackException {
        if (isEmpty())
            throw new StackException();
        return (E)array[--size];
    }

    @Override
    public E peek() {
        return isEmpty() ? null : (E) array[size - 1];
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
        if (src == null) return;
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

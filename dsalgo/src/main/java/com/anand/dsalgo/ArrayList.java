package com.anand.dsalgo;

import java.util.*;

/**
 * Created by anand_patel on 4/19/18.
 */
public class ArrayList<T> implements List<T> {

    private Object[] arr;
    private int size = 0;
    private int capacity;

    public ArrayList() {
        this(2);
    }

    public ArrayList(final int capacity) {
        this.capacity = capacity;
        arr = new Object[this.capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean contains(Object o) {
        return (indexOf(o) != -1);
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    public boolean add(T t) {
        ensureCapacity();
        addSafe(t);
        return true;
    }

    private void addSafe(T e) {
        arr[size] = e;
        size++;
    }

    private void ensureCapacity() {
        if (full()) {
            expand();
        }
    }

    private void expand() {
        capacity = capacity * 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    private boolean full() {
        return (size == capacity);
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {
        size = 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T)arr[index];
    }

    public T set(int index, T element) {
        return null;
    }

    public void add(int index, T element) {

    }

    public T remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == null)
                    return i;
            }
        }
        else {
            for (int i = 0; i < size; i++) {
                if (o.equals(arr[i]))
                    return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<T> listIterator() {
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}

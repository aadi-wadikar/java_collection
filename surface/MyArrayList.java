package surface;

import java.util.NoSuchElementException;
import java.util.Arrays;
import core.MyIterator;
import core.MyList;

public class MyArrayList<T> implements MyList<T> {
    private int size;
    private int capacity;
    private T[] arr;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
        this.size = 0;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            capacity *= 2;
            arr = Arrays.copyOf(arr, capacity);
        }
    }

    @Override
    public void addFirst(T e) {
        ensureCapacity();
        System.arraycopy(arr, 0, arr, 1, size);
        arr[0] = e;
        size++;
    }

    @Override
    public void addLast(T e) {
        add(e);
    }

    @Override
    public void add(T e) {
        ensureCapacity();
        arr[size++] = e;
    }

    @Override
    public void add(T e, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        ensureCapacity();
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = e;
        size++;
    }

    @Override
    public T getFirst() {
        if (size == 0) throw new NoSuchElementException("List is empty");
        return arr[0];
    }

    @Override
    public T getLast() {
        if (size == 0) throw new NoSuchElementException("List is empty");
        return arr[size - 1];
    }

    @Override
    public T removeFirst() {
        if (size == 0) throw new NoSuchElementException("List is empty");
        T removed = arr[0];
        System.arraycopy(arr, 1, arr, 0, --size);
        arr[size] = null; 
        return removed;
    }

    @Override
    public T removeLast() {
        if (size == 0) throw new NoSuchElementException("List is empty");
        T removed = arr[--size];
        arr[size] = null;
        return removed;
    }

    @Override
    public MyIterator<T> myiterator() {
        return new MyArrayListIterator();
    }

    class MyArrayListIterator implements MyIterator<T> {
        private int cursor;

        public MyArrayListIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            return arr[cursor++];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}


package core;
public interface MyIterable<T> {
    /**
     * Used for traversing collection
     * @return MyIterator object
     */
    MyIterator<T> myiterator();
}

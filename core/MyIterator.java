package core;
public interface MyIterator<E> {
    /**
     * check if next element is present in collection
     * @return true if present, else no
     */
    boolean hasNext();

    /**
     * move pointer forward, by one position
     * @return E type if present, else throw error
     * @throws NoSuchElementException if the iteration has no more elements
     */
    E next();
}

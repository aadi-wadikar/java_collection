package core;
public interface MyList<E> extends MyIterable<E>{
        /**
     * @return Element present at first position
     * @throws NoSuchELementException if no element is present
     */
    E getFirst();

    /**
     * @return element present at last position
     * @throws NoSuchELementException if no element is present
     */
    E getLast();

    /**
     * @return and remove element present at first position
     * @throws NoSuchELementException if no element is present
     */
    E removeFirst();

    /**
     * @return and remove element present at last position
     * @throws NoSuchELementException if no element is present
     */
    E removeLast();

    /**
     * @return boolean if element is added at start of collection
     * @throws NoSuchELementException if no element is present
     */
    void addFirst(E e);

    /**
     * @return boolean if element is added at ending of collection
     * @throws NoSuchELementException if no element is present
     */
    void addLast(E e);


    /**
     * add given element at last of collection
     * @return void
     */
    void add(E e);

    /**
     * add given element at given index
     * @return void
     */
    void add(E e, int index);
    
}
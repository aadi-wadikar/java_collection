# My Java Collection Framework

This project is a custom implementation of the Java Collection Framework, providing a foundation for data structures like ArrayList, LinkedList, and Deques.

## Features
- **Custom List Interface** (`MyList<E>`) with essential methods like `add()`, `remove()`, and `getFirst()`.
- **Iterator Support** using `MyIterator<E>`.
- **Dynamic Resizing** in `MyArrayList<T>`.
- **Future Additions**: LinkedList, ArrayDeque, LinkedListQueue.

## Class Structure
- `core.MyIterator<E>`: Custom iterator for traversing collections.
- `core.MyIterable<T>`: Interface defining iterable behavior.
- `core.MyList<E>`: Interface extending `MyIterable<T>`.
- `surface.MyArrayList<T>`: Implementation of `MyList<E>` using a dynamically resizing array.

## Usage Example
```java
MyArrayList<Integer> list = new MyArrayList<>();
list.add(10);
list.add(20);
System.out.println(list); // Output: [10, 20]
```

## Future Improvements
- Implement `MyLinkedList<T>`.
- Add `MyArrayDeque<T>`.
- Optimize memory usage and performance.

## License
This project is open-source and free to use.


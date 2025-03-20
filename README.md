# MyArrayList - Custom Java Collection Framework

## 📌 Overview

MyArrayList is a custom implementation of Java's `ArrayList`. It is designed to function similarly to Java's built-in `ArrayList` with essential methods such as adding, removing, and retrieving elements while maintaining dynamic resizing capabilities.

## 🚀 Features

- **Dynamic Resizing**\*: Automatically expands when needed.\*
- **Efficient Insertions & Deletions**\*: Supports **`addFirst`**, **`addLast`**, **`removeFirst`**, **`removeLast`**, and indexed operations.\*
- **Iterator Support**\*: Implements a custom iterator to traverse elements.\*
- **Exception Handling**\*: Handles edge cases like accessing an empty list.\*

## 🏗️ Class Structure

### `MyArrayList<T>`\* (Main Class)\*

- `add(T e)`\*\*: Adds an element to the end.
- `addFirst(T e)`\*\*: Adds an element at the beginning.
- `addLast(T e)`\*\*: Alias for **`add()`**.
- `add(T e, int index)`\*\*: Adds an element at a specific index.
- `getFirst()`\*\*, **`getLast()`**: Retrieves first and last elements.
- `removeFirst()`\*\*, **`removeLast()`**: Removes first and last elements.
- `myiterator()`\*\*: Returns an iterator for traversal.
- `toString()`\*\*: Pretty representation of the list contents.

### `MyArrayListIterator<T>`\* (Nested Class)\*

- Implements **`MyIterator<T>`** to provide a simple iterator over the list.

## 🛠️ Usage Example

## 📜 License

This project is open-source and free to *use under the MIT License.*


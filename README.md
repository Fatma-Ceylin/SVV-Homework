# SVV-Homework

This is one of my lab sessions from a Data Structures course at another university.  
We completed it during a class session with our professor.

---

##  Project Purpose

This project extends the Java `Queue` structure by implementing two custom queue types:

- **LQueue**: A simple FIFO (First-In-First-Out) queue.
- **PriorityLQueue**: A priority queue that automatically sorts elements.

In the `Main` class, both queue types are tested and compared to demonstrate their behaviors.

---

##  Class Overview

### 1. `LQueue<E>` – Linear Queue
- Based on `LinkedList`.
- Implements FIFO (First-In-First-Out) behavior.
- Overrides basic queue methods: `offer()`, `poll()`, and `peek()`.
- Includes a custom `equals()` method to compare the content of queues.

### 2. `PriorityLQueue<E>` – Priority Queue
- Inherits from `LQueue`.
- Automatically sorts elements every time a new one is added.
- Sorting strategies:
  - Natural ordering (if elements implement `Comparable`)
  - Custom sorting using a provided `Comparator`

### 3. `Main` – Test Class
- Demonstrates the usage of both `LQueue` and `PriorityLQueue`.
- Converts standard queues into priority queues.
- Adds elements, displays queue states, and compares them using `equals()`.

---

##  Summary

This project demonstrates key OOP principles such as:
- Inheritance
- Method overriding
- Use of generic types and custom comparators
- Practical manipulation of Java Collections



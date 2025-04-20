# SVV-Homework


This is a one of my lab sessions of Data Structures course
in a different university and we did this in class with
our proffesor.


Project Purpose
This project extends the Java Queue structure to create two custom types:

    LQueue: A simple FIFO (First-In-First-Out) queue.
    PriorityLQueue: A priority queue that automatically sorts elements.

In the Main class, both queue types are tested and compared to show how they behave differently.

Class Overview

 1. LQueue<E> (Linear Queue)

  •Based on a LinkedList.
  •Works as a standard FIFO queue.
  •Overrides basic queue methods like offer(), poll(), and peek().
  •Includes a custom equals() method to compare queues based on their content.

 2. PriorityLQueue<E> (Priority Queue)
 
  •Inherits from LQueue.
  •Automatically sorts the queue every time an element is added.
  •Sorting is done:
  Using natural ordering if no comparator is provided .
  Or using a custom Comparator if given during construction.

 3. Main (Test Class)
 
  •Creates a queue (q1, q2) using LQueue.
  •Converts it into a PriorityLQueue (pq, pq2, pq3).
  •Demonstrates how elements are sorted after adding.
  •Compares the queues using equals() to see if their contents are considered equal.

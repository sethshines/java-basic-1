package basic;

import java.util.Date;
import java.util.Objects;

public class Base {
    public static void main(String[] args) {
        Start start = new Start("Java");
        start.printWelcomeMessage();
        Start start2 = new Start("Java");
        start2.printWelcomeMessage();
        String c = "new";
        String d = "new";
        String cObjec = new String("new");
        String dObject = new String("new");
        System.out.println(c+" "+d);
        System.out.println(c==d);
        System.out.println(cObjec+" "+dObject);
        System.out.println(cObjec==dObject);
//        System.out.println(start);
//        System.out.println(start2);
//        System.out.println(start.equals(start2));
    }
}

class Start {
    String technology;
    Date startingOn;

    Start(String tech) {
        technology = tech;
        startingOn = new Date();
    }

    void printWelcomeMessage() {
        System.out.println("*** /// HELLO! We are Starting with "+ technology +" on " + startingOn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Start start = (Start) o;
        return Objects.equals(technology, start.technology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(technology, startingOn);
    }

    @Override
    public String toString() {
        return "We started learning " + technology + " on " + startingOn;
    }
}

//
//Learning Java with a focus on practical coding problems is an excellent way to grasp concepts while building your problem-solving skills. Below is a structured plan:
//
//        ---
//
//        ### **Phase 4: Advanced OOP Concepts (2-3 Weeks)**
//        1. **Learn**
//        - Inheritance and method overriding.
//        - Polymorphism (compile-time and runtime).
//        - Abstract classes and interfaces.
//
//        2. **Practice Problems**
//        - Create a class hierarchy for animals and demonstrate method overriding.
//   - Implement an interface for vehicles and write classes for different types of vehicles.
//        - Create a program for managing employees with inheritance.
//
//        ---
//
//        ### **Phase 5: Data Structures and Collections (4 Weeks)**
//        1. **Learn**
//        - Arrays and multi-dimensional arrays.
//        - ArrayList, LinkedList, HashMap, HashSet.
//   - Stacks, queues, and priority queues.
//
//2. **Practice Problems**
//        - Find the largest and smallest numbers in an array.
//   - Write a program to remove duplicates from an array.
//   - Implement a stack and queue using built-in collections.
//        - Count character frequencies in a string using HashMap.
//
//        ---
//
//        ### **Phase 6: Exception Handling and File I/O (2 Weeks)**
//        1. **Learn**
//        - Try-catch blocks.
//   - Custom exceptions.
//        - Reading from and writing to files.
//
//        2. **Practice Problems**
//        - Write a program to handle divide-by-zero exceptions.
//        - Create a program to read from a text file and display its content.
//   - Write a program to save user input into a file.
//
//        ---
//
//        ### **Phase 7: Multithreading and Concurrency (2 Weeks)**
//        1. **Learn**
//        - Threads and the `Runnable` interface.
//        - Thread synchronization.
//        - Executors and thread pools.
//
//        2. **Practice Problems**
//        - Create a program to demonstrate thread creation and execution.
//   - Implement a producer-consumer problem.
//        - Simulate a ticket booking system with synchronized methods.
//
//---
//
//        ### **Phase 8: Advanced Topics and Projects (4 Weeks)**
//        1. **Topics**
//        - Java Streams and Lambda Expressions.
//   - Database connectivity with JDBC.
//        - Basics of JavaFX or Swing for GUI development.
//
//        2. **Practice Problems**
//        - Parse and process large data files using streams.
//        - Create a CRUD (Create, Read, Update, Delete) application connected to a database.
//        - Build a simple GUI application like a to-do list manager or calculator.
//
//        ---
//
//        ### **Resources**
//        - **Books**: *Head First Java* by Kathy Sierra, *Effective Java* by Joshua Bloch.
//- **Online Courses**: Courses on platforms like Codecademy, Udemy, or Coursera.
//        - **Coding Platforms**: Practice problems on HackerRank, LeetCode, or Codewars.
//
//---
//
//        ### **Tips**
//        - Set daily or weekly goals.
//- Dedicate time to debugging and understanding errors.
//- Participate in coding challenges to stay motivated.
//- Build small projects as you progress to reinforce concepts.
//
//Would you like a more detailed focus on any particular phase?
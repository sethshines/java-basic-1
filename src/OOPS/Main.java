package OOPS;

//Phase 3: Object-Oriented Programming (2-3 Weeks)
//Learn
//
//Classes and objects.
//Methods and constructors.
//this keyword.
//Encapsulation and access modifiers.
//Static and instance members.
//Practice Problems
//
//Create a class for a Student with attributes and methods to calculate the average of marks.
//Implement a simple Bank Account system with deposit, withdraw, and balance display functionalities.
//Create a program to manage a library system.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student(1,"Charvi", "Seth", 4, "A 1003 Garnet Street S4T 2X7");
//        s1.setStandard(Standard.LKG);
//        Map<Subjects, Integer> map = new HashMap<>();
//        map.put(Subjects.HINDI,90);
//        map.put(Subjects.ENGLISH,95);
//        map.put(Subjects.MATH,99);
//        s1.setMarks(map);
//        System.out.println(s1);

        BankAccount b1 = new BankAccount(1, "Rahul", "Seth");
        b1.setAge(32);
        b1.setAddress("A 1003 Garnet Street S4T 2X7");
        b1.deposit(1000);
        b1.displayAccountSummary();
        try {
            b1.deposit(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught:- " + e);
        }

        b1.deposit(1000);
        b1.deposit(1000);
        b1.deposit(1000);
        b1.deposit(1000);
        b1.deposit(1000);
        b1.withdraw(100);
        try {
            b1.withdraw(-1100);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught:- " + e);
        }

        b1.displayAccountSummary();

    }
}


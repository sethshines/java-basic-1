package OOPS;

import java.util.Arrays;
import java.util.Map;

enum Standard {
    KG,
    LKG,
    FIRST,
    SECOND,
    THIRD
}

enum Subjects {
    HINDI,
    ENGLISH,
    MATH
}

public class Student extends Person {
    int id;
    Standard standard;
    Map<Subjects, Integer> marks;

    Student(int id, String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age, address);
        this.id = id;
    }

    public Map<Subjects, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<Subjects, Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name=" + firstName + " " + lastName +
                "\t\t\t\n standard=" + standard +
                "\t\t\t\n marks in HINDI=" + marks.get(Subjects.HINDI) +
                ",ENGLISH=" + marks.get(Subjects.ENGLISH) +
                ",MATH=" + marks.get(Subjects.MATH) +
                "Total Percentage=" + getTotalPercentage();
    }

    private Standard getStandard() {
        return standard;
    }

    void setStandard(Standard standard) {
        this.standard = standard;
    }

    int getId() {
        return id;
    }

    float getTotalPercentage() {
        int total = marks.get(Subjects.MATH) + marks.get(Subjects.HINDI) + marks.get(Subjects.ENGLISH);
        return ((float) total / 300) * 100;
    }

}

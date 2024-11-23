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

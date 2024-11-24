package OOPS.POLYMORPHISM;

public abstract class Shape {
    int noOfSide;
    float length;
    float width;

    Shape(int length, int width){
        this.length = length;
        this.width = width;
    }
    float area(){
        System.out.println("USE ME TO CALCULATE THE AREA");
        return 0;
    }

    float perimeter(){
        System.out.println("USE ME TO CALCULATE THE PERIMETER");
        return 0;
    }
}

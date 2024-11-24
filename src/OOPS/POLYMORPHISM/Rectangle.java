package OOPS.POLYMORPHISM;

public class Rectangle extends Shape{

    Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    float area() {
        return this.length * this.width;
    }

    @Override
    float perimeter() {
        return 2 * (length + width);
    }
}

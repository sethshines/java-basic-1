package OOPS.POLYMORPHISM;

public class Square extends Shape{

    Square(int side) {
        super(side,side);
    }

    @Override
    float area() {
        return this.length * this.length;
    }

    @Override
    float perimeter() {
        return 4*this.length;
    }
}

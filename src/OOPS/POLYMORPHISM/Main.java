package OOPS.POLYMORPHISM;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(4);
        System.out.println("Area of Square:- "+square.area());
        System.out.println("Perimeter of Square:- "+square.perimeter());

        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("Area of Square:- "+rectangle.area());
        System.out.println("Perimeter of Square:- "+rectangle.perimeter());

    }
}

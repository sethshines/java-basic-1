package OOPS.MultipleInheritence;

enum Color {
    RED,
    GREEN,
    BLUE,
    BLACK
}

enum EngineType {
    ELECTRIC,
    FUEL,
    HYBRID
}

public class Vehicle {
    int noOfSeats;
    int noOfGears;
    int noOfWheels;
    int speed = 0;
    Color color;
    final EngineType engineType;

    public Vehicle(EngineType engineType, Color color) {
        this.engineType = engineType;
        this.color = color;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelarate() {
        System.out.println("ZOOM.......");
    }

    public void brake() {
        System.out.println("STOP");
    }
}

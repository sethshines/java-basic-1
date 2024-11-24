package OOPS.MultipleInheritence;

public class HybridVehicle extends Vehicle implements ElectricVehicle,FuelVehicle{
    private float fuelLeft = 100.0f;
    private float batterPrec = 100.0f;
    EngineType currentMode;
    public HybridVehicle(EngineType engineType, Color color) {
        super(engineType, color);
        this.currentMode = EngineType.ELECTRIC;
    }

    @Override
    public void displayBatteryPerc() {
        System.out.printf("Current Battery Level:- %f", batterPrec);
        System.out.println();
    }

    @Override
    public void chargeBattery(float prec) {
        this.batterPrec+=prec;
        this.displayBatteryPerc();
    }

    @Override
    public void displayFuelLevel() {
        System.out.printf("Current Fuel Level:- %f", fuelLeft);
        System.out.println();
    }

    @Override
    public void refillFuel(float refill) {
        this.fuelLeft+=refill;
        this.displayFuelLevel();
    }

    @Override
    public void accelarate() {
        this.speed += 10;
        if(this.currentMode.equals(EngineType.ELECTRIC)) {
            this.batterPrec -= 0.05;
            this.displayBatteryPerc();
        } else {
            this.fuelLeft -= 0.5;
            this.displayFuelLevel();
        }
    }

    public void setCurrentMode(EngineType currentMode) {
        this.currentMode = currentMode;
    }

    @Override
    public void brake() {
        this.speed -= 10;
        if(this.currentMode.equals(EngineType.ELECTRIC)) {
            this.batterPrec += 0.01;
            this.displayBatteryPerc();
        } else {
            this.displayFuelLevel();
        }
    }
}

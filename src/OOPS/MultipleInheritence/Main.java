package OOPS.MultipleInheritence;

public class Main {
    public static void main(String[] args) {
        HybridVehicle Tiago = new HybridVehicle(EngineType.HYBRID, Color.BLACK);
        Tiago.displayFuelLevel();
        Tiago.displayFuelLevel();
        Tiago.accelarate();
        Tiago.setCurrentMode(EngineType.FUEL);
        Tiago.accelarate();
        Tiago.chargeBattery(1);
        Tiago.refillFuel(1);
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.setCurrentMode(EngineType.ELECTRIC);
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
        Tiago.accelarate();
    }
}

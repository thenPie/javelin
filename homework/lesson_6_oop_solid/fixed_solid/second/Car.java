package fixed_solid.second;

public class Car extends Vehicle implements iSpeedCalculation {
    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}

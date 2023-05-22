package fixed_solid.second;

public class Bus extends Vehicle implements iSpeedCalculation {
    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}

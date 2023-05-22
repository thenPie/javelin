package fixed_solid.second;

public class main {
    public static void main(String[] args) {

        Car car = new Car(100);
        Bus bus = new Bus(100);

        System.out.println(car.calculateAllowedSpeed());
        System.out.println(bus.calculateAllowedSpeed());

    }
}

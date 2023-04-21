package src;

public class Product extends HotDrink {
    
    Integer temp;

    @Override
    public String toString() {
        return "HotDrink {" +
               "feels = " + feels + "," + "\n" +
               "temp = " + temp +
               "}";
    }

}

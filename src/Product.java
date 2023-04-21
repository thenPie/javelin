package src;

public class Product extends HotDrink {
    
    Integer temp;

    @Override
    public String toString() {
        return "Product {" +
               "temp = " + temp +
               "}" + "\n" +
               super.toString();
    }

}

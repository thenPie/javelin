package src;

public class main {
    public static void main(String[] args) {
        
        HotDrink aDrink = new HotDrink();
        aDrink.feels = "hot";
        Product smth = new Product();
        smth.feels = "hot";
        smth.temp = 35;

        System.out.println(aDrink.toString());
        System.out.println(smth.toString());

    }
}

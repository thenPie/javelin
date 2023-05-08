import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.discountClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Market Perekryostok = new Market();

        // OrdinaryClient client3 = new OrdinaryClient("Jubilee");
        // SpecialClient client4 = new SpecialClient("Shen", 123);

        // Perekryostok.acceptToMarket(client3);
        // Perekryostok.acceptToMarket(client4);
        
        // Perekryostok.update();

        Market magnit = new Market();

        iActorBehaviour item1 = new OrdinaryClient("Wei");
        iActorBehaviour item2 = new SpecialClient("Нинель", 413);
        iActorBehaviour item3 = new discountClient("Скидоооон", 49);

        magnit.acceptToMarket(item1);
        magnit.acceptToMarket(item2);
        magnit.acceptToMarket(item3);
        magnit.update();
        magnit.returnOrder(item2);
        magnit.returnOrder(item2);
        magnit.returnOrder(item3);

    }
}

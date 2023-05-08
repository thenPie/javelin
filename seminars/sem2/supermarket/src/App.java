import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;

//добавить одного вип клиента, добавить ещё один интерфейс для очереди

public class App {
    public static void main(String[] args) throws Exception {
        
        Market Perekryostok = new Market();

        OrdinaryClient client3 = new OrdinaryClient("Jubilee");
        SpecialClient client4 = new SpecialClient("Shen", 123);

        Perekryostok.acceptToMarket(client3);
        Perekryostok.acceptToMarket(client4);
        
        Perekryostok.update();

    }
}

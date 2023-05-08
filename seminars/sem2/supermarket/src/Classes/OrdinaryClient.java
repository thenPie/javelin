
package Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    // @Override
    // public Integer getIdVIP() {
    //     return super.idVIP;
    // }

    @Override
    public Boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public Boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(Boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(Boolean pickupOrder) {
        super.isTakeOrder = pickupOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    
    
}

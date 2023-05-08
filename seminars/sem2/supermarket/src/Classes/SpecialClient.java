
package Classes;

public class SpecialClient extends Actor {

    public SpecialClient(String name, Integer idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public Integer getIdVIP() {
        return idVIP;
    }

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

}

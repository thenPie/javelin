package Classes;

public class discountClient extends Actor {

    private Integer discount;

    public discountClient(String name, Integer discount) {
        super(name);
        this.discount = discount;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this;
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

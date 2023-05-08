package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс магазина.
 */
public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {
    
    // private List<Actor> queue;

    /**
     * Поле очереди.
     */
    private List<iActorBehaviour> queue;
    
    /**
     * Инициализация магазина и очереди внутри.
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
    
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " client came in the market");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " client added to the queue");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " left the market");
            this.queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " client got their order");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " client left the queue");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " client made an order");
            }
        }
    }

    @Override
    public void acceptReturn() {
        System.out.println("Order has been returned");
    }

    @Override
    public void cashReturn() {
        System.out.println("Order has been refunded.");
    }

    @Override
    public void denyReturn() {
        System.out.println("Order return was denied");
    }

    @Override
    public void returnOrder(iActorBehaviour actor) {
        if (actor.isTakeOrder()) {
            acceptReturn();
            cashReturn();
        } else {
            denyReturn();
        }
    }

    

}

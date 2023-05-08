package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {
    
    private List<Actor> queue;
    
    public Market() {
        this.queue = new ArrayList<Actor>();
    }
    
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " client came in the market");
        takeInQueue(actor);
    }
    
    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " client added to the queue");
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
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " client got their order");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor);
                System.out.println(actor.getName() + " client left the queue");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " client made an order");
            }
        }
    }

}

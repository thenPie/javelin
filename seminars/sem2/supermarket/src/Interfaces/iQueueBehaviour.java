package Interfaces;

// import Classes.Actor;

/**
 * Интерфейс поведения очереди.
 */
public interface iQueueBehaviour {
    
    /**
     * Метод добавления клиента в очередь магазина.
     * @param actor
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Метод выхода из очереди.
     */
    void releaseFromQueue();

    /**
     * Метод создания заказа клиентом.
     */
    void takeOrder();

    /**
     * Метод выдачи заказа.
     */
    void giveOrder();

}

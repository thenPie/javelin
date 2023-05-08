package Interfaces;

import Classes.Actor;

/**
 * Интерфейс поведения заказов.
 */
public interface iActorBehaviour {

    /**
     * Хочет ли клиент создать заказ.
     * @param makeOrder
     */
    void setMakeOrder(Boolean makeOrder);

    /**
     * Установить статус заказа.
     * @param pickupOrder
     */
    void setTakeOrder(Boolean pickupOrder);

    /**
     * Есть активный заказ.
     * @return
     */
    Boolean isMakeOrder();

    /**
     * Выдан ли клиенту заказ.
     * @return
     */
    Boolean isTakeOrder();

    /**
     * Метод возврата данных клиента.
     * @return
     */
    Actor getActor();

}

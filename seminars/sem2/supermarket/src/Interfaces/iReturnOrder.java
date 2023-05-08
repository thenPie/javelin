package Interfaces;

/**
 * Интерфейс поведения возврата товаров.
 */
public interface iReturnOrder {

    /**
     * Инициализация возврата товара.
     */
    void returnOrder(iActorBehaviour actor);

    /**
     * Метод возврата товара.
     */
    void acceptReturn();

    /**
     * Метод непройденного возврата товара.
     */
    void denyReturn();

    /**
     * Метод возврата денежных средств.
     */
    void cashReturn();

}
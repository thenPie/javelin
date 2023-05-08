package Interfaces;

/**
 * Интерфейс поведения возврата товаров.
 */
public interface iReturnOrder {

    /**
     * Метод возврата товара.
     */
    void acceptReturn();

    /**
     * Метод непройденного возврата товара.
     */
    void denyReturn();

    /**
     * Метод замены товара.
     */
    void changeOrderReturn();

    /**
     * Метод возврата денежных средств.
     */
    void cashReturn();

}

package Classes;

import Interfaces.iActorBehaviour;

/**
 * Абстрактный класс о клиенте.
 */
public abstract class Actor implements iActorBehaviour {

    /**
     * Информация клиента.
     */
    protected String name;
    protected Boolean isMakeOrder;
    protected Boolean isTakeOrder;

    // Boolean isMakeOrder();
    // Boolean isTakeOrder();

    /**
     * Инициализация клиента.
     * @param name
     */
    public Actor(String name) {
        this.name = name;
        this.isMakeOrder = true; // временное
        this.isTakeOrder = true; // временное
    }

    public abstract String getName();
    
}
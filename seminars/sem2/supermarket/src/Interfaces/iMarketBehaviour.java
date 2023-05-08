package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс поведения магазина.
 */
public interface iMarketBehaviour {
    
    /**
     * Метод захода клиента в магазин.
     * @param actor
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Метод ухода клиента из магазина.
     * @param actors
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Логика работы магазина.
     */
    void update();

}

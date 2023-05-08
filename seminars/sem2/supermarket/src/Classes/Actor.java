
package Classes;

import javax.swing.UIDefaults.ActiveValue;

import Interfaces.iActorBehaviour;

/**
 * Actor
 */
public abstract class Actor implements iActorBehaviour {

    protected String name;
    protected Integer idVIP;
    protected Boolean isMakeOrder;
    protected Boolean isTakeOrder;

    // Boolean isMakeOrder();
    // Boolean isTakeOrder();

    public Actor(String name) {
        this.name = name;
        this.idVIP = null;
        this.isMakeOrder = true; // временное
        // this.isTakeOrder = true; // временное
    }

    public abstract String getName();
    
    public abstract Integer getIdVIP();
    
}

package homework.lesson_2;

/**
 * Акционный клиент.
 */
public class shareholder implements iReturnOrder {

    private String sharesName;
    private Integer shID;

    public shareholder(String sharesName) {
        this.sharesName = sharesName;
    }

    @Override
    public void returnOrder() {
        System.out.println("Successfull return of the shares");
    }
    
    @Override
    public void denyReturn() {
        System.out.println("Denied return");
    }

}

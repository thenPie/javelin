
package srcRobot;

public class main {

    public static void main(String[] args) {
        
        Robot dummy = new Robot("TestSubject_1", 25);

        System.out.println("----------------");
        System.out.println(dummy);
        System.out.println();

        dummy.power();
        dummy.work();
        dummy.work();
        dummy.work();
        dummy.power();
        dummy.work();
        dummy.work();
        dummy.work();
        dummy.power();
        dummy.work();
        dummy.work();
        dummy.power();

    }

}

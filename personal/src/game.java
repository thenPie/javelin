
import java.util.Scanner;

public class game {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("beating each other\n");

        person a = new person("Jehn");
        person b = new person("Shen");

        System.out.println(a.getName());
        System.out.println(b.getName());

        // Integer choose = (int) ((Math.random() * (2 - 1)) + 1);
        // String first;
        
        // if (choose == 2) {
        //     first = b.getName();
        // } else {
        //     first = a.getName();
        // }
        
        
        Boolean fight = false;
        System.out.println("Wanna see a fight?\n1. Yes\nElse. No");
        Integer choose = sc.nextInt();
        if (choose == 1) {
            fight = true;
            System.out.println("First to attack is " + a.getName());
            while (fight == true) {
                a.attack(b);
                b.attack(a);
            }
        }

        System.out.println(a.getState());
        System.out.println(b.getState());

    }
}

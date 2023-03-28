import java.util.Scanner;

public class prog {

    private static final Scanner scanread = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. task1\n2. task2\n3. task3");
        Scanner scanread = new Scanner(System.in);
        int choose = scanread.nextInt();
        if (choose == 1) {
            task1();
        }
        if (choose == 2) {
            task2();
        }
        if (choose == 3) {
            task3();
        }
        scanread.close();
    }

    static void task1() {
        // Scanner scanread = new Scanner(System.in);
        System.out.println("Input two nums <1000 to qube: ");
        int elemTake1 = scanread.nextInt();
        int elemTake2 = scanread.nextInt();
        int arr[] = new int[1001];
        for(int i = 1; i < arr.length; i++) {
            arr[i] = (int)Math.pow(i, 3);
        }
        System.out.println("Output");
        System.out.println(arr[elemTake1]);
        System.out.println(arr[elemTake2]);
        scanread.close();
    }

    static void task2() {
        System.out.println("Input");
        // Scanner scanread = new Scanner(System.in);
        int n = scanread.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            int iElem = scanread.nextInt();
            arr[i] = iElem;
        }
        int multiply = scanread.nextInt();
        System.out.println("Output");
        for(int i = 0; i < n; i++) {
            arr[i] = arr[i] * multiply;
            System.out.println(arr[i]);
        }
        scanread.close();
    }

    static int task3_plus(int plussee) {
        System.out.println("На какое число?");
        // Scanner scanread = new Scanner(System.in);
        int plusser = scanread.nextInt();
        int res = plussee + plusser;
        return res;
    }

    static int task3_minus(int minussee) {
        System.out.println("На какое число?");
        // Scanner scanread = new Scanner(System.in);
        int minusser = scanread.nextInt();
        return minussee - minusser;
    }

    static int task3_multiply(int multiplee) {
        System.out.println("На какое число?");
        // Scanner scanread = new Scanner(System.in);
        int multipler = scanread.nextInt();
        return multiplee * multipler;
    }

    static void task3() {
        // Scanner scanread = new Scanner(System.in);
        System.out.println("\nКалькулятор\n\nВведите целое число");
        int num1 = scanread.nextInt();
        boolean wait = true;
        while (wait) {
            System.out.println("Какое действие?\n1. +\n2. -\n3. =\n4. *");
            int choice = scanread.nextInt();

            if (choice == 1) {
                num1 = task3_plus(num1);
            }
            if (choice == 2) {
                num1 = task3_minus(num1);
            }
            if (choice == 3) {
                System.out.println("Результат: " + num1);
                scanread.close();
                wait = false;
            }
            if (choice == 4) {
                num1 = task3_multiply(num1);
            }
        }
    }
}
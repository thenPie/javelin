import java.util.Scanner;

public class prog {

    private static final Scanner scanread = new Scanner(System.in);

    public static void main(String[] args) {

        // prettify
        boolean waiting = true;
        while (waiting) {
            System.out.println("\n\nСеминары\n0. Выход\n1. дз первого семинара\n2. дз второго семинара");
            int choice = scanread.nextInt();
            if (choice == 0) {
                waiting = false;
            }
            if (choice == 1) {
                seminar1();
            }
            if (choice == 2) {
                seminar2();
            }
        }

    }
    
    static void seminar1() {
        boolean waiting = true;
        while (waiting) {
            System.out.println("\n\nДз первого семинара\n0. exit\n1. task1\n2. task2\n3. task3");
            int choose = scanread.nextInt();
            if (choose == 0) {
                waiting = false;
            }
            if (choose == 1) {
                task1_sem1();
            }
            if (choose == 2) {
                task2_sem1();
            }
            if (choose == 3) {
                task3_sem1();
            }
        }
    }

    static void task1_sem1() {
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
    }

    static void task2_sem1() {
        System.out.println("Input");
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
    }

    static int task3_plus_sem1(int plussee) {
        System.out.println("На какое число?");
        int plusser = scanread.nextInt();
        int res = plussee + plusser;
        return res;
    }

    static int task3_minus_sem1(int minussee) {
        System.out.println("На какое число?");
        int minusser = scanread.nextInt();
        return minussee - minusser;
    }

    static int task3_multiply_sem1(int multiplee) {
        System.out.println("На какое число?");
        int multipler = scanread.nextInt();
        return multiplee * multipler;
    }

    static void task3_sem1() {
        System.out.println("\nКалькулятор\n\nВведите целое число");
        int num1 = scanread.nextInt();
        boolean wait = true;
        while (wait) {
            System.out.println("Какое действие?\n1. +\n2. -\n3. =\n4. *");
            int choice = scanread.nextInt();

            if (choice == 1) {
                num1 = task3_plus_sem1(num1);
            }
            if (choice == 2) {
                num1 = task3_minus_sem1(num1);
            }
            if (choice == 3) {
                System.out.println("Результат: " + num1);
                wait = false;
            }
            if (choice == 4) {
                num1 = task3_multiply_sem1(num1);
            }
        }
    }

    static void seminar2() {
        boolean waiting = true;
        while (waiting) {
            System.out.println("\n\nДз второго семинара\n0. exit\n1. task0\n2. task1");
            int choose = scanread.nextInt();
            if (choose == 0) {
                waiting = false;
            }
            if (choose == 1) {
                task1_sem2();
            }
            if (choose == 2) {
                task2_sem2();
            }
        }
    }

    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”
    static void task1_sem2() {
        StringBuilder sb = new StringBuilder();
        String jewels = "aB"; char[] eachJewel = jewels.toCharArray();
        String stones = "aaaAbbbB"; char[] eachStone = stones.toCharArray();
        int count = 0; String res = "";

        for (char aJewel : eachJewel) {
            count = 0;
            count = looker_sem2(aJewel, eachStone);
            // res = res + aJewel + count;
            res = sb.append(aJewel + "" + count).toString();
        }

        System.out.println(res);
    }

    static int looker_sem2(char aPiece, char[] lookie) {
        int count = 0;
        for (char c : lookie) {
            if (c == aPiece) {
                count++;
            }
        }
        return count;
    }

    // Вам дается строка S и целочисленный массив индексов int index[s.length].
    // Напишите программу, которая перетасует символы в S таким образом,
    // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
    
    // Пример: s = “cba”, index = [3,2,1] result “abc”
    static void task2_sem2() {
        StringBuilder sb = new StringBuilder();
        String s = "cba";
        int[] index = new int[] {3, 2, 1};
        String res = "";

        for (int i : index) {
            res = sb.append(s.charAt(i - 1)).toString();
        }

        System.out.println(res);
    }
}
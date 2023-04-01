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
            System.out.println("\n\nДз второго семинара\n0. exit\n1. task0\n2. task1\n3. task2");
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
            if (choose == 3) {
                task3_sem2();
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

    // Task_2
    // На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
    // Выходные данные
    // Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
    // Sample Input:
    // 2
    // Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
    // Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
    // 3
    // арахис - колбаса
    // клубника - вишня
    // сгущенка - молоко
    // Sample Output:
    // Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
    // Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
    static void task3_sem2() {
        System.out.println("Введите количество строк рецепта");
        int n = scanread.nextInt();
        String recipe = task3_sem2_recipe(n);
        System.out.println("Введите количество аллергий на продукты");
        int m = scanread.nextInt();
        String arg = task3_sem2_allerg(m);
        System.out.println(recipe);
    }
    
    static String task3_sem2_recipe(int n) {
        StringBuilder sb = new StringBuilder();
        String recipe = "";
        System.out.println("Вводите рецепт построчно");
        for (int i = 0; i <= n; i++) {
            String aLine = scanread.nextLine();
            recipe = sb.append(aLine).append("\n").toString();
        }
        return recipe;
    }
    
    static String task3_sem2_allerg(int m) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите на что аллергия и чем его можно заменить в формате: продукт1 - продукт2");
        String rec = "";
        for (int j = 0; j <= m; j++) {
            String arg = scanread.nextLine();
            rec = sb.append(arg).append("\n").toString();
        }
        return rec;
    }
}
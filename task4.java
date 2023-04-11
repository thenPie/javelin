import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class task4 {

    static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {

        Deque<Integer> res = new ArrayDeque<>();
        int all = 0;
        int len = Math.max(d1.size(), d2.size());

        for (int i = 0; i < len; i++) {
          int sum = d1.pollFirst() + d2.pollFirst() + all;
          res.addLast(sum % 10);
          all = sum / 10;
        }

        if (all > 0)
          res.addLast(all);
        return res;
    }

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        System.out.println(sum(d1, d2));
    }
}

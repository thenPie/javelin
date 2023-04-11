import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class task5 {

    static boolean logically(Deque<String> deque) {
        Deque<String> rememb = new ArrayDeque<>();
        while (deque.size() > 0) {
            String deq1 = deque.pollFirst();
            String rememlast = rememb.peekLast();
            if ((deq1 == "(" || deq1 == "[" || deq1 == "{")) {
                rememb.addLast(deq1);
            } else if ((deq1 == ")" && rememlast == "(") || (deq1 == "}" && rememlast == "{") || (deq1 == "]" && rememlast == "[")) {
                rememb.removeLast();
            } else {
                rememb.addLast(deq1);
            }
        }
        if (rememb.size() > 0) {
          return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Deque<String> d1 = new ArrayDeque<>(Arrays.asList("(", "{", "[", "]", "}", ")", "(", ")"));
        System.out.println(logically(d1));
    }
}
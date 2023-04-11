import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task1 {

    static boolean isPalindrom(Deque<Integer> deque) {
        while (deque.size() > 1 ) {
            Integer first = deque.peekFirst();
            Integer last = deque.peekLast();
            if(first != last){
                return false;
            }
            deque.pollFirst();
            deque.pollLast();
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(isPalindrom(deque));
    }
}
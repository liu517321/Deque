import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("学习");
        deque.offerFirst("吃饭");
        deque.addLast("睡觉");
        deque.offerLast("打豆豆");
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
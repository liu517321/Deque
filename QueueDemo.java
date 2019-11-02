import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("学习");
        queue.add("睡觉");
        queue.offer("吃饭");
        queue.offer("打豆豆");
        System.out.println(queue.isEmpty());
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println("================");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println("================");
        System.out.println(queue.poll());
    }
}

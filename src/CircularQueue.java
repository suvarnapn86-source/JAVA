import java.util.ArrayDeque;
import java.util.Deque;
public class CircularQueue {
    public static void main(String[] args) {
        Deque<Integer> cq = new ArrayDeque<>(5);
        cq.addLast(10);//enqueue
        cq.addLast(20);
        cq.addLast(30);
        cq.addLast(40);
        cq.addLast(50);
        System.out.println("Queue elements:" + cq);
        System.out.println("dequeued element" + cq.removeFirst());
        System.out.println("dequeued element" + cq.removeFirst());
        System.out.println("Queue after dequeues:" + cq);
        cq.addLast(60);
        cq.addLast(70);
        System.out.println("queue after adding 60 and 70:" + cq);
        System.out.println("final queue elements:");
        for (int val : cq) {
            System.out.println(val + "");
        }
    }
}


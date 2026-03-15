import java.util.PriorityQueue;
import java.util.Comparator;

class Item {
    int value;
    int priority;

    Item(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

public class PriorityQueueCustom {

    public static void display(PriorityQueue<Item> pq) {
        for (Item item : pq) {
            System.out.println(item.value + " (priority " + item.priority + ")");
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Item> pq = new PriorityQueue<>(Comparator.comparingInt(i -> i.priority));

        pq.add(new Item(10, 2));
        pq.add(new Item(20, 1));
        pq.add(new Item(30, 3));
        pq.add(new Item(40, 2));
        pq.add(new Item(50, 4));
        pq.add(new Item(60, 1));
        pq.add(new Item(70, 5));

        System.out.println("Elements in priority queue:");
        display(pq);

        Item removed = pq.poll();
        System.out.println("\nDeleted element: " + removed.value + " (priority " + removed.priority + ")");

        System.out.println("\nPriority queue after deletion:");
        display(pq);

        System.out.println("\nRemoving elements in priority order:");
        while (!pq.isEmpty()) {
            Item item = pq.poll();
            System.out.println(item.value + " (priority " + item.priority + ")");
        }
    }
}
package in.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue <Integer> queue =  new LinkedList <> ();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        for (Integer i : queue) {
            System.out.println("The Queue is : " +i);
        }
        System.out.println();

        System.out.println("Remove element : " +queue.remove());
        System.out.println("Ater remove: " );

        for (Integer i : queue) {
            System.out.println("The Queue is : " +i);
        }
    }
}

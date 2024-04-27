package miPrincipal;

import java.util.Queue;
import java.util.LinkedList;

public class DemoQueue {
    public static void menu() {
        System.out.println("************************");
        System.out.println("          QUEUE         ");
        System.out.println("************************");
        System.out.println();
        Queue<String> micola = new LinkedList<String>();
        micola.add("elemento 0");
        micola.add("elemento 1");
        micola.add("elemento 2");
        System.out.println("El primer elemento de la cola es " +
                micola.peek());

        micola.remove();
        System.out.println("El primer elemento de la cola es " +
                micola.peek());

        micola.remove();
        System.out.println("El primer elemento de la cola es " +
                micola.peek());

        micola.remove();
        System.out.println("El primer elemento de la cola es " +
                micola.peek());

    }

}
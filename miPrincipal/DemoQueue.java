package miPrincipal;

import java.util.Queue;
import java.util.LinkedList;

public class DemoQueue {
    public static void menu() {
        System.out.println("************************");
        System.out.println("          QUEUE         ");
        System.out.println("************************");
        System.out.println();
        // creamos una cola generica
        Queue<String> micola = new LinkedList<String>();
        // Agregarmos tres elementos a la cola
        micola.add("elemento 0");
        micola.add("elemento 1");
        micola.add("elemento 2");
        // Muestra tre elementos de la cola en ese orden
        System.out.println("El primer elemento de la cola es " +
                micola.peek());

        // Elimina el primer elemento de la cola
        micola.remove();
        // Muestra tre elementos de la cola en ese orden
        System.out.println("El primer elemento de la cola es " +
                micola.peek());

        micola.remove();
        // Muestra tre elementos de la cola en ese orden
        System.out.println("El primer elemento de la cola es " +
                micola.peek());

        micola.remove();
        // Muestra tre elementos de la cola en ese orden
        System.out.println("El primer elemento de la cola es " +
                micola.peek());

    }

}
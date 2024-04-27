package miPrincipal;

import java.util.*;

public class DemoStack {

    public static void menu() {
        System.out.println("************************");
        System.out.println("          STACK         ");
        System.out.println("************************");
        System.out.println();
        Stack<Integer> pila = new Stack<Integer>();
        pila.push(2);
        pila.push(5);
        pila.push(7);
        pila.push(10);

        System.out.println("Posicion de elemento buscando 2 : " + pila.search(2));
        System.out.println("Posicion de elemento buscando 10 : " + pila.search(10));
        System.out.println("Posicion de elemento buscando 3 : " + pila.search(3));

        System.out.println("EL elemento del tope = " + pila.peek());

        pila.pop();

        System.out.println("EL elemento del tope =" + pila.peek());

        System.out.println("EL elemento del tope =" + pila.peek());

        pila.pop();

        System.out.println("El elemento del tope =" + pila.peek());

    }

}

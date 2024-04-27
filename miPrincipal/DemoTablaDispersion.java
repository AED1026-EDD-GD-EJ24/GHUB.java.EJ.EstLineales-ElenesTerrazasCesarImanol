package miPrincipal;

import java.util.Enumeration;
import java.util.Hashtable;

public class DemoTablaDispersion {

    public static void menu() {

        System.out.println("************************");
        System.out.println("   TABLA DE DISPERDION  ");
        System.out.println("************************");
        System.out.println();

        Persona p1 = new Persona("Pablo", 23, "Argentino");
        Persona p2 = new Persona("Juan", 25, "Mexicano");
        Persona p3 = new Persona("Pedro", 18, "Español");

        Hashtable<String, Persona> tabla = new Hashtable<String, Persona>();

        tabla.put(p1.getNombre(), p1);
        tabla.put(p2.getNombre(), p2);
        tabla.put(p3.getNombre(), p3);

        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));
        System.out.println(tabla.get("Rolando"));

        String aux = " ";
        Enumeration<String> keys = tabla.keys();

        while (keys.hasMoreElements()) {

            aux = keys.nextElement();
            System.out.println(aux + " = " + tabla.get(aux));

        }

    }

}

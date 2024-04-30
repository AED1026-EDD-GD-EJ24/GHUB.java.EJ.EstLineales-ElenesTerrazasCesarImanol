package miPrincipal;

import java.util.ArrayList;

public class DemoExamen<T> {

    public static void main(String[] args) {
        
      

        ArrayList<Contacto> listaContactos= new ArrayList<Contacto>();

        Contacto l= new contacto("Fernando", "Castro",
        "C11 No 12 Culiacan", "fernandocastro@gmail.com",
        "6677160732", "6677511511");

        Contacto lp= new contacto("Maria Andrea", "Vargas",
        " C11 No 705 Culiacan", "mariv@gmail.com",
        "6677121429", "6677306142");
        
        Contacto lp2= new contacto("Carolina", "Sanchez",
        ",", "carolsa@gmail.com",
        "6677121212", "6677982515");

        Contacto lp3= new contacto("imanol", "elenes",
        ",", "carolsa@gmail.com",
        "6677121212", "6677982515");

        Contacto lp4= new contacto("pablo", "Sanchez",
        ",", "carolsa@gmail.com",
        "6677121212", "6677982515");

        listaContactos.add(l);
        listaContactos.add(lp);
        listaContactos.add(lp2);
       
        listaContactos.get(1).toString();
        listaContactos.get(2).toString();
        listaContactos.get(3).toString();

        listaContactos.add(1, lp3);
        listaContactos.add(2,lp4);

        listaContactos.toString(1);
        listaContactos.toString(2);

        listaContactos.remove(3);

        listaContactos.get(1).toString();
        listaContactos.get(2).toString();
        listaContactos.get(3).toString();



    }

}
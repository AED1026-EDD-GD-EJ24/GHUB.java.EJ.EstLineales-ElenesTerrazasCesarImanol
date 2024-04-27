import Persona.Persona;
import java.util.*;

public class DemoArrayListPersonas {

    public static void menu() {

        System.out.println("************************");
        System.out.println("      ARRAYLIST     ");
        System.out.println("      PERSONAS     ");
        System.out.println("************************");

        try {
            List<Persona> lp = new ArrayList<Persona>();
            Random r = new Random();
            Persona temp = null;
            int sumaaltura = 0;
            for (int i = 0; i < 1000; i++) {
                lp.add(new Persona(i, "Persona" + i, r.nextInt(100) + 100));
            }
            Iterator<Persona> it = lp.iterator();
            while (it.hasNext()) {
                temp = it.next();
                System.out.println(temp);
                sumaaltura += temp.getAltura();
            }
            System.out.println("La media del conjunto de personas = " +
                    sumaaltura / lp.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

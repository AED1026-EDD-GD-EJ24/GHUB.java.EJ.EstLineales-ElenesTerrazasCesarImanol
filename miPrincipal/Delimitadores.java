package miPrincipal;

public class Delimitadores {

   public boolean evaluacion(String cadena) {
      Pila<String> pcaracteres = new Pila<String>();
      int i = 0;
      boolean masElementosPorLeer = true;
      while (i < cadena.length() && masElementosPorLeer) {
         char car = cadena.charAt(i);
         String s = charToString(car);
         i++;
         switch (car) {
           
            case '(':
               pcaracteres.apilar(charToString(')'));
               break;
            case '[':
               pcaracteres.apilar(charToString(']'));
               break;
            case '{':
               pcaracteres.apilar(charToString('}'));
               break;
            case '/':
              
               if (siguienteEsAsterisco(cadena, i)) {
                  pcaracteres.apilar(charToString('/'));
                  i++;
               }
               break;
          
            case ')':
            case ']':
            case '}': {
              
               String aux = pcaracteres.cima();
               if (aux != null) {
                  if (s.compareTo(aux) == 0) {
                     
                     pcaracteres.retirar();
                  } else {
                    
                     masElementosPorLeer = false;
                  }
               }
              
               break;
            }
            case '*':
               if (siguienteEsDiagonal(cadena, i)) {
                  pcaracteres.retirar();
                  i++;
               }

         }
      } 
      if (pcaracteres.esVacia() && masElementosPorLeer)
         return true;
      else
         return false;

   }

   private static String charToString(char ch) {
      return String.valueOf(ch);
   }

   private static boolean siguienteEsAsterisco(String cadena, int posicion) {

      char car = cadena.charAt(posicion);
      if (car == '*')
         return true;
      else
         return false;
   }

   private static boolean siguienteEsDiagonal(String cadena, int posicion) {

      char car = cadena.charAt(posicion);
      if (car == '/')
         return true;
      else
         return false;
   }

}
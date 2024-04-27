package miPrincipal;

public class Cola<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamaño;

    public Cola() {

        cabeza = null;
        cola = null;
        tamaño = 0;

    }

    public boolean esVacia() {

        return (cabeza == null);

    }

    public void encolar(T valor) {

        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);

        if (esVacia()) {

            cabeza = nuevo;
            cola = nuevo;

        } else {

            cola.setSiguiente(nuevo);
            cola = nuevo;

            tamaño++;

        }

    }

    public void desencolar() {

        if (!esVacia())
            ;

        if (cabeza == cola) {

            cabeza = null;
            cola = null;

        } else {

            cabeza = cabeza.getSiguiente();

        }

        tamaño--;

    }

    public T frente() {

        if (!esVacia()) {

            return cabeza.getValor();

        } else {

            return null;

        }

    }

    public int getTamaño() {
        return tamaño;
    }

}

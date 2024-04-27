package miPrincipal;

public class Pila<T> {

    private Nodo<T> cabeza;
    private int tamaño;

    public Pila() {
        cabeza = null;
        tamaño = 0;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public boolean esVacia() {

        return (cabeza == null);

    }

    public void apilar(T valor) {

        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);

        if (esVacia()) {

            cabeza = nuevo;

        }

        nuevo.setSiguiente(cabeza);

        cabeza = nuevo;

        tamaño++;

    }

    public void retirar() {

        if (!esVacia()) {

            cabeza = cabeza.getSiguiente();
            tamaño--;

        }

    }

    public T cima() {

        if (!esVacia()) {

            return cabeza.getValor();

        }

        return null;

    }

}

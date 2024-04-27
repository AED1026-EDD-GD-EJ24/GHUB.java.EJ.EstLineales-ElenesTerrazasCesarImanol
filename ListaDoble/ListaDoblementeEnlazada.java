package ListaDoble;

import miPrincipal.PosicionIlegalException;

public class ListaDoblementeEnlazada<T> {
   
    private Nodo<T> cabeza;
   
    private int tamanio;

    
    public ListaDoblementeEnlazada() {
        cabeza = null;
        tamanio = 0;
    }

    
    public int getTamanio() {
        return tamanio;
    }

    
    public boolean esVacia() {
        if (cabeza == null)
            return true;
        else
            return false;
    }

    public void agregar(T valor) {
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
        } else {
            Nodo<T> aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
        }
        tamanio++;

    }

    public void insertar(T valor, int pos) throws PosicionIlegalException {
        if (pos >= 0 && pos <= tamanio) {
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            if (pos == 0) {
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            } else {
                if (pos == tamanio) {
                    Nodo<T> aux = cabeza;
                    while (aux.getSiguiente() != null) {
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                } else {
                    Nodo<T> aux = cabeza;
                    for (int i = 0; i <= pos - 2; i++) {
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                    nuevo.setAnterior(aux);
                    siguiente.setAnterior(nuevo);

                }

            }
            tamanio++;

        } else {
            throw new PosicionIlegalException();
        }

    }

    public T getValor(int pos) throws PosicionIlegalException {
        if (pos >= 0 && pos < tamanio) {
            T valor;
            if (pos == 0) {
                valor = cabeza.getValor();
                return valor;
            } else {
                Nodo<T> aux = cabeza;
                for (int i = 0; i <= pos - 1; i++) {
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();

            }
            return valor;

        } else {
            throw new PosicionIlegalException();
        }
    }

    public void remover(int pos) throws PosicionIlegalException {
        if (pos >= 0 && pos < tamanio) {
            if (pos == 0) {
                cabeza = cabeza.getSiguiente();
                cabeza.setAnterior(null);
                tamanio--;
            }
            else {
                Nodo<T> aux = cabeza;
                for (int i = 0; i <= pos - 2; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                prox.getSiguiente().setAnterior(aux);
                aux.setSiguiente(prox.getSiguiente());

                tamanio--;
            }

        } else {
            throw new PosicionIlegalException();
        }
    }

    public void limpiar() {
        cabeza = null;
        tamanio = 0;

    }
}

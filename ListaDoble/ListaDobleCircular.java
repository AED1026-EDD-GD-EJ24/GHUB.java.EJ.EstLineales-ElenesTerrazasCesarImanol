package ListaDoble;
import miPrincipal.PosicionIlegalException;
public class ListaDobleCircular<T> {


    private Nodo<T> cabeza;
   
    private int tamanio;

  
    public ListaDobleCircular() {
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
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
        } else {
            Nodo<T> ultimo = cabeza.getAnterior();
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            
        }
        tamanio++;

    }

    public void insertar(T valor, int pos) throws PosicionIlegalException {
        if (pos >= 0 && pos <= tamanio) {
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            if(pos==0){
                Nodo<T> ultimo = cabeza.getAnterior();
                nuevo.setSiguiente(cabeza);
                cabeza.setAnterior(nuevo);
                cabeza = nuevo;
                nuevo.setAnterior(ultimo);
                ultimo.setAnterior(cabeza);
            }
            else{
                if(pos==tamanio){
                    Nodo<T> ultimo = cabeza.getAnterior();
                    ultimo.setSiguiente(nuevo);
                    nuevo.setSiguiente(cabeza);
                    cabeza.setAnterior(nuevo);
                   
                }
                else{
                    Nodo<T> aux = cabeza;
                    for(int i=0; i<=pos-2; i++){
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

        }
        else{
            throw new PosicionIlegalException();
        }
    }
    public T getValor(int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamanio)
        {
            T valor;
            if(pos ==0){
                valor = cabeza.getValor();
                return valor;
            }
            else{
                Nodo<T> aux = cabeza;
                for(int i=0; i<=pos-1; i++){
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();

            }
            return valor;

        }
        else{
            throw new PosicionIlegalException();
        }
    }
    public void remover (int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamanio){
            if (pos==0){
                Nodo<T> ultimo = cabeza.getAnterior();
                cabeza= cabeza.getSiguiente();
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
                tamanio--;
            }
            else{
                Nodo<T> aux = cabeza;
                for(int i=0;i<=pos-2;i++){
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                prox.getSiguiente().setAnterior(aux);
                aux.setSiguiente(prox.getSiguiente());
                
                tamanio--;
            }

        }
        else{
            throw new PosicionIlegalException();
        }
    }
    public void limpiar(){
        cabeza=null;
        tamanio=0;

    }
    
}
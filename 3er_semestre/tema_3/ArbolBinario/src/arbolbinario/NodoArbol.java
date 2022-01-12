package arbolbinario;

public class NodoArbol {

    int valor;
    Object contenido;
    NodoArbol nodoIzquierdo;
    NodoArbol nodoDerecho;

    NodoArbol(int valor, Object contenido) {
        this.valor = valor;
        this.contenido = contenido;
        this.nodoDerecho = null;
        this.nodoIzquierdo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    void insertarNodo(int _valor, Object _contenido) {
        if (_valor < this.valor) {
            //izq
            if (this.nodoIzquierdo == null) {
                nodoIzquierdo = new NodoArbol(_valor, _contenido);
            } else {
                this.nodoIzquierdo.insertarNodo(_valor, _contenido);
            }
        } else {
            // derecho
            if (this.nodoDerecho == null) {
                nodoDerecho = new NodoArbol(_valor, _contenido);
            } else {
                this.nodoDerecho.insertarNodo(_valor, _contenido);
            }
        }
    }
    
    boolean esHoja(){
        return ((nodoDerecho == null) && (nodoIzquierdo == null));
    }
    
}

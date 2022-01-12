package arbolbinario;

public class NodoArbol {

    String llave;
    String nombre;
    String apPat;
    String apMat;
    NodoArbol nodoIzquierdo;
    NodoArbol nodoDerecho;

    NodoArbol(String llave, String apPat, String apMat, String nombre) {
        this.llave = llave;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.nodoDerecho = null;
        this.nodoIzquierdo = null;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public Object getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    void insertarNodo(String _llave, String _apPat, String _apMat, String _nombre) {
        String nombreCompleto;
        String nombreCompletoNodo;
        nombreCompleto = _apPat+_apMat+_nombre;
        nombreCompletoNodo = this.apPat+this.apMat+this.nombre;
        
        if (nombreCompleto.compareToIgnoreCase(nombreCompletoNodo) == 0) {
            System.out.println("No se pueden ingresar nombres iguales");
        }
        // Mayor
        else if (nombreCompleto.compareToIgnoreCase(nombreCompletoNodo) > 0) {
            //izq
            if (this.nodoIzquierdo == null) {
                nodoIzquierdo = new NodoArbol(_llave, _apPat, _apMat, _nombre);
            } else {
                this.nodoIzquierdo.insertarNodo(_llave, _apPat, _apMat, _nombre);
            }
        } else {
            // derecho
            if (this.nodoDerecho == null) {
                nodoDerecho = new NodoArbol(_llave, _apPat, _apMat, _nombre);
            } else {
                this.nodoDerecho.insertarNodo(_llave, _apPat, _apMat, _nombre);
            }
        }
    }

    boolean esHoja() {
        return ((nodoDerecho == null) && (nodoIzquierdo == null));
    }

}

package arbolbinario;

public class ArbolBinario {

    NodoArbol raiz;

    ArbolBinario() {
        this.raiz = null;
    }

    void insertarNodo(int valor, Object contenido) {
        if (this.raiz == null) {
            this.raiz = new NodoArbol(valor, contenido);
        } else {
            this.raiz.insertarNodo(valor, contenido);
        }
    }

    boolean estaVacio(NodoArbol nodo) {
        return nodo == null;
    }

    // Retorna una cadena con el mensaje de si lo encontro con sus datos o si no lo encontro
    String buscarNodo(int valor) {
        NodoArbol aux = this.raiz;
        while (valor != aux.getValor()) {
            if (valor < aux.getValor()) {
                aux = aux.getNodoIzquierdo();
            } else {
                aux = aux.getNodoDerecho();
            }
            if (aux == null) {
                return "El nodo " + valor + " no se encuentra en el arbol";
            }
        }
        return "Nodo: " + valor + " encontrado\n"
                + "valor: " + aux.valor + "\n"
                + "contenido: " + aux.contenido;
    }

    // Usa el mismo metodo de buscar pero en este caso verifica si tiene o no tienes hijos para borrar el modo de cierta forma
    String eliminarNodo(int valor) {
        NodoArbol padre = this.raiz;
        NodoArbol aux = this.raiz;
        // Variable que sirve para que al momento de encontrar el nodo, el padre de este conozca que lado de sus nodos hijos borrar
        boolean esHijoIzq = true;
        // 6  -->   8 - 5 - 6
        while (valor != aux.getValor()) {
            // El padre obtiene el valor del auxiliar ya que ese necesita actulizarse por cada vuelta, padre sera el que sera el nodo eliminado
            padre = aux;
            if (valor < aux.getValor()) {
                aux = aux.getNodoIzquierdo();
                esHijoIzq = true;

                //Si el valor del nodo es mayor al nodo de la izquierda se va por la rama derecha
            } else {
                // Obtenemos el siguiente nodo derecho
                aux = aux.getNodoDerecho();
                esHijoIzq = false;
            }
            // Si el nodo no se encuentra muestra este mensaje
            if (aux == null) {
                return "El nodo " + valor + " no existe o ya se ha borrado";
            }
        }
        // Verifica si el nodo no tiene hijos, para eso llama a esHoja()
        if (aux.esHoja()) {
            eliminarNodoHoja(padre, aux, esHijoIzq);

            // Verifica si tiene un lado sin hijos
        } else if (aux.getNodoIzquierdo() == null || aux.getNodoDerecho() == null) {
            eliminarNodoUnHijo(padre, aux, esHijoIzq);

            // Al no ser un nodo sin hijos o un nodo con un solo hijo por ende es un nodo con dos hijos y entra la condición
        } else if (aux.getNodoIzquierdo() != null && aux.getNodoDerecho() != null) {
            eliminarNodoDosHijos(padre, aux, esHijoIzq);
        }
        // Mensaje que el proceso se ha realizado
        return "El nodo " + valor + " se ha borrado";
    }

    // Metodo para eliminar nodos sin hijos
    void eliminarNodoHoja(NodoArbol padre, NodoArbol aux, boolean esHijoIzq) {
        if (aux == this.raiz) {
            raiz = null;
        } else if (esHijoIzq) {
            // Si el nodo esta en la rama izquierda, el nodo izquierdo de su padre sera nulo
            padre.nodoIzquierdo = null;
        } else {
            // Si el nodo esta en la rama derecha, el nodo derechp de su padre sera nulo
            padre.nodoDerecho = null;
        }
    }

    // Metodo para eliminar nodos con solo un hijo
    void eliminarNodoUnHijo(NodoArbol padre, NodoArbol aux, boolean esHijoIzq) {
        // Revisa si su hijo nodo derecho es nulo
        if (aux.getNodoDerecho() == null) {
            if (aux == this.raiz) {
                raiz = aux.getNodoIzquierdo();
            } else if (esHijoIzq) {
                padre.nodoIzquierdo = aux.getNodoIzquierdo();
            } else {
                padre.nodoDerecho = aux.getNodoIzquierdo();
            }
            // Revisa si su hijo nodo izquierdo es nulo
        } else if (aux.getNodoIzquierdo() == null) {
            if (aux == this.raiz) {
                raiz = aux.getNodoDerecho();
            } else if (esHijoIzq) {
                padre.nodoIzquierdo = aux.getNodoDerecho();
            } else {
                padre.nodoDerecho = aux.getNodoDerecho();
            }
        }
    }

    void eliminarNodoDosHijos(NodoArbol padre, NodoArbol aux, boolean esHijoIzq) {

        NodoArbol reemplazo;
        NodoArbol nulo;
        NodoArbol reemplazo2;
        reemplazo2 = aux;
        reemplazo = aux;
        nulo = aux;
        boolean raiz;
        raiz = false;

        if (aux == this.raiz) {
            raiz = true;
        }

        if (!aux.getNodoDerecho().esHoja()) {

            aux = aux.getNodoDerecho();
            // Si su nodo hijo izquierdo no es nulo, busca profudamente en todos los demas nodos hijos izquierdos que existan hasta dar con el menor de los mayores
            if (aux.getNodoIzquierdo() != null) {
                while (aux != null) {
                    // Nulo siempre va un nodo adelantado para verificar si se llego al tope
                    nulo = aux.getNodoIzquierdo();
                    /* Nulo siempre va un nodo adelantado para verificar si se llego al tope, 
                    si se llego al tope se reemplazan los valores y se sale del ciclo while */
                    if (nulo.getNodoIzquierdo() == null) {
                        reemplazo.valor = nulo.valor;
                        reemplazo.contenido = nulo.contenido;
                        aux.nodoIzquierdo = null;

                        break;
                    }
                    // Se obtiene el siguiente nodo izquierdo
                    aux = aux.getNodoIzquierdo();
                }
                // Si su nodo hijo no tiene un nodo hijo en la izquierda desde el inicio, se reemplaza el nodo a borrar con su primer nodo hijo derecho
            } else {
                reemplazo = aux;
                reemplazo.nodoIzquierdo = reemplazo2.getNodoIzquierdo();
            }
            // Si el nodo hijo derecho no contiene hijos solo se obtiene su valor y se reemplaza por el nodo a borrar
        } else {
            reemplazo = aux.getNodoDerecho();
            reemplazo.nodoIzquierdo = aux.getNodoIzquierdo();
        }

        if (raiz) {
            reemplazo.nodoDerecho = this.raiz.getNodoDerecho();
            reemplazo.nodoIzquierdo = this.raiz.getNodoIzquierdo();
            this.raiz = reemplazo;
            
        } else if (esHijoIzq) {
            padre.nodoIzquierdo = reemplazo;
        } else {
            padre.nodoDerecho = reemplazo;
        }

    }

    void preOrder(NodoArbol nodo) {
        if (nodo == null) {
        } else {
            System.out.println(nodo.getValor() + " contenido: " + nodo.contenido);
            preOrder(nodo.getNodoIzquierdo());
            preOrder(nodo.getNodoDerecho());
        }
    }

    void inOrder(NodoArbol nodo) {
        if (nodo == null) {
        } else {
            inOrder(nodo.getNodoIzquierdo());
            System.out.println(nodo.getValor() + " contenido: " + nodo.contenido);
            inOrder(nodo.getNodoDerecho());
        }
    }

    void postOrder(NodoArbol nodo) {
        if (nodo == null) {
        } else {
            postOrder(nodo.getNodoDerecho());
            System.out.println(nodo.getValor() + " contenido: " + nodo.contenido);
            postOrder(nodo.getNodoIzquierdo());
        }
    }

}

package main;

/**
 *
 * @author emloa
 */
public class TablaRecursivaPOO {

    //atributos de mi clase
    int limite;
    int iterador;
    int entrada;
    String resultadoTabla;

    //metodo constructor sin parametros
    public TablaRecursivaPOO() {
        limite = 0;
        iterador = 1;
        entrada = 0;
        resultadoTabla = "";
    }

    //metodo constructor con parametros
    public TablaRecursivaPOO(int entrada, int limite) {
        this.limite = limite;
        iterador = 1;
        this.entrada = entrada;
        resultadoTabla = "";
    }

    //metodo set para tablas de multiplicar
    public void setResultadoTabla() {
        if (iterador <= limite) {
            resultadoTabla += entrada + " x " + iterador + " = " + entrada * iterador + "\n";
            iterador++;
            setResultadoTabla();
        }
    }

    //metodo show para tablas de multiplicar
    public void showResultadoTabla() {
        System.out.println("La tabla de múltiplicar de "+entrada+" a "+limite +" es:\n"+resultadoTabla);
    }

}

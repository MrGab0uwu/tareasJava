package main;

/**
 *
 * @author emloa
 */
public class TablaNoRecursivaPOO {

    //atributos de mi clase
    int limite;
    int entrada;
    String resultadoTabla;

    //metodo constructor sin parametros
    public TablaNoRecursivaPOO() {
        limite = 0;
        entrada = 0;
        resultadoTabla = "";
    }

    //metodo constructor con parametros
    public TablaNoRecursivaPOO(int entrada, int limite) {
        this.limite = limite;
        this.entrada = entrada;
        resultadoTabla = "";
    }

    //metodo set para tablas de multiplicar
    public void setResultadoTabla() {
        for (int i = 1; i <= limite; i++) {
            resultadoTabla += entrada + " x " + i + " = " + entrada * i + "\n";
        }
    }

    //metodo show para tablas de multiplicar
    public void showResultadoTabla() {
        System.out.println("La tabla de múltiplicar de "+entrada+" a "+limite +" es:\n"+resultadoTabla);
    }

}

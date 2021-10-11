package TestMain;

public class TestSerieNumericaPOO {

    public static void main(String[] args) {

        // Objeto de la clase NO RECURSIVA 
        var obj = new serieNumericaNoRecursiva(4, 10);
        // Metodo para iterar la serie
        obj.setSerieNumerica();
        // Metodo para mostrar la serie
        obj.showSerieNumerica();

        // Objeto de la clase NO RECURSIVA 
        var obj2 = new serieNumericaRecursiva(4, 10);
        // Metodo para iterar la serie
        obj2.setSerieNumerica();
        // Metodo para mostrar la serie
        obj2.showSerieNumerica();
    }
}

package radix;

public class TestCasoRadix {

    public static void main(String[] args) {
        var radix = new Radix();
        radix.importarFichero("lista.txt");
        System.out.println("\n --------  Ordenado ---------");
        radix.ordenamientoRadix();
    }
}

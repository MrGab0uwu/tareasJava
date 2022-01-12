package mezcla.directa;

public class TestMezclaDirecta {

    public static void main(String[] args) {
        
        var Mezcla = new MezclaDirecta();
        
        Mezcla.importarFichero("lista.txt");
        System.out.println("\n");
        
        Mezcla.showMezclaDirecta();

        
    }
    
}

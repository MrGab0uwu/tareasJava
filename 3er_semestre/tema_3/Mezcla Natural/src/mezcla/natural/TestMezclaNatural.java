package mezcla.natural;

public class TestMezclaNatural {

    public static void main(String[] args) {
        
        var Mezcla = new MezclaNatural();
        
        Mezcla.importarFichero("lista.txt");
        System.out.println("\n");
        
        Mezcla.showMezclaNatural();

        
    }
    
}

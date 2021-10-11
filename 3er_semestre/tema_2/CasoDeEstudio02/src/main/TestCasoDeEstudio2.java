package main;

public class TestCasoDeEstudio2 {

    public static void main(String[] args) {
        
        var obj = new SerieDescendenteNoRecursivoPOO(11);
        obj.setSerie();
        obj.showSerie();
        
        var obj2 = new SerieDescendenteRecursivoPOO(20);
        obj2.setSerie();
        obj2.showSerie();
        
    }

}

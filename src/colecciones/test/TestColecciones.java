package colecciones.test
import java.util.*;

public class TestColecciones{
    
    public static void main() {
        
        String diasSemana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        
        //Interface padre: Lista. | Clase que implementa la interfaz: ArrayList
        List miLista = new ArrayList();
        
        for(String dia : diasSemana) {
            miLista.add(dia);
        }
        for(Object elemento : miLista) {
            System.out.println(elemento);
        }
        
        //Arrow Function
        System.out.println("\n-ArrowFunct-");
        miLista.forEach(elemento -> {   System.out.println(elemento);   });
    }
}

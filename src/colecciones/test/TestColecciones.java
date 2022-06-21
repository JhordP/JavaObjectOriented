package colecciones.test
import java.util.*;

public class TestColecciones{
    
    public static void main() {
        var run = new TestColecciones();
        String diasSemana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        
            //Interface padre: Lista. | Clase que implementa la interfaz: ArrayList
        List miLista = new ArrayList();
        System.out.println("\nList:");
        run.mostrar(miLista, diasSemana);
        
            //Add & Show
        //for(String dia : diasSemana) miLista.add(dia); //Por cada elemento en el array, agregar
        //for(Object elemento : miLista) System.out.println(elemento); //Por cada elemento en la lista, mostrar.
            
            //Arrow Function
        //System.out.println("\n-ArrowFunct-");
        //miLista.forEach(elemento -> {   System.out.println(elemento);   });
        
            //Interface padre: Set. | Clase que implementa la interfaz: HashSet
        Set miSet = new HashSet();
        System.out.println("\nSet:");
        run.mostrar(miSet, diasSemana);
        
            //Add & Show
        //for(String dia : diasSemana) miSet.add(dia);
        //miSet.forEach(elem -> { System.out.println(elem); }); //Los Set no imprimen en el orden que se agregaron los elementos
        
        /*Nota:
            En las Listas los elementos pueden duplicarse
            En los Set los elementos duplicados se sobreescriben
        */
    }
    
    //Aplicando polimorfismo
    public void mostrar(Collection coleccion, String[] dias) {
        for(String dia : dias) coleccion.add(dia);
        coleccion.forEach(elemento -> { System.out.println(elemento); });
    }
}

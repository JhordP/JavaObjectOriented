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
        
        Map miMapa = new HashMap();
        System.out.println("\nMap:");
        
        //Se agrega una "key" y un registro , ambos de cualquier tipo de dato Object.
        miMapa.put("P1", "Juan");
        miMapa.put(02, "Karla");
        miMapa.put('3', "Roberto");
        //miMapa.put(02, "Jose"); Si se le coloca la misma key a otro valor, se sobreescribe.
        
        //Se trae la key como parametro sin importar el tipo de dato.
        String elemento = (String)miMapa.get(02); //Se realiza un DownCasting para poder almacenarlo en la variable.
        System.out.println(elemento);
        //System.out.println((String)miMapa.get('3')); //TryHard 1 linea
        
        System.out.println("\nTrayendo todos los elementos\n");
        //Para traer todas las llaves:
        Set mapa = miMapa.keySet(); //Devuelve un set por lo que el orden varia. No devuelve los valores sino las Key.
        mapa.forEach(elem -> { System.out.println(elem); });
        
        //Para traer todas los valores:
        Collection lista = miMapa.values();
        lista.forEach(elem -> { System.out.println(elem); });
        
        /*Diferencias-->
            List: Guardan el orden o index en el que fueron agregados
            Set: No guardan el orden del index que fueron agregados
            Map: Guardan una llave de referencia en cada valor.
        */
    }
    
    //Aplicando polimorfismo
    public void mostrar(Collection coleccion, String[] dias) {
        for(String dia : dias) coleccion.add(dia);
        coleccion.forEach(elemento -> { System.out.println(elemento); });
    }
}

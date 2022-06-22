package colecciones.test;

import java.util.*;

public class TestColeccionesGenerics{
    
    public static void main() {
        var run = new TestColeccionesGenerics();
        String diasSemana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        
            //Interface padre: Lista. | Clase que implementa la interfaz: ArrayList
        List<String> miLista = new ArrayList<>();
        System.out.println("\nList:");
        run.mostrar(miLista, diasSemana);
        System.out.println("Get: "+miLista.get(3)); //Get de ArrayList es un indexador
        
            //Add & Show
        //for(String dia : diasSemana) miLista.add(dia); //Por cada elemento en el array, agregar
        //for(Object elemento : miLista) System.out.println(elemento); //Por cada elemento en la lista, mostrar.
            
            //Arrow Function
        //System.out.println("\n-ArrowFunct-");
        //miLista.forEach(elemento -> {   System.out.println(elemento);   });
        
            //Interface padre: Set. | Clase que implementa la interfaz: HashSet
        Set<String> miSet = new HashSet<>();
        System.out.println("\nSet:");
        run.mostrar(miSet, diasSemana);
        
            //Add & Show
        //for(String dia : diasSemana) miSet.add(dia);
        //miSet.forEach(elem -> { System.out.println(elem); }); //Los Set no imprimen en el orden que se agregaron los elementos
        
        /*Nota:
            En las Listas los elementos pueden duplicarse
            En los Set los elementos duplicados se sobreescriben
        */
        
        Map<Integer, String> miMapa = new HashMap<>();
        System.out.println("\nMap:");
        
        //Se agrega una "key" y un registro , ambos de cualquier tipo de dato Object.
        miMapa.put(01, "Juan");
        miMapa.put(02, "Karla");
        miMapa.put(03, "Roberto");
        //miMapa.put(02, "Jose"); Si se le coloca la misma key a otro valor, se sobreescribe.
        
        //Se trae la key como parametro sin importar el tipo de dato.
        String elemento = (String)miMapa.get(02); //Se realiza un DownCasting para poder almacenarlo en la variable.
        System.out.println(elemento);
        System.out.println((String)miMapa.get(01)); //TryHard 1 linea
        
        //System.out.println("\nTrayendo todos los elementos\n");
        //Para traer todas las llaves:
        Set<Integer> mapa = miMapa.keySet(); //Devuelve un set por lo que el orden varia. No devuelve los valores sino las Key.
        mapa.forEach(elem -> { System.out.println(elem); });
        
        //Para traer todas los valores:
        Collection<String> lista = miMapa.values();
        lista.forEach(elem -> { System.out.println(elem); });
        
        /*Diferencias-->
            List: Guardan el orden o index en el que fueron agregados
            Set: No guardan el orden del index que fueron agregados
            Map: Guardan una llave de referencia en cada valor.
        */
    }
    
    //Aplicando polimorfismo
    public void mostrar(Collection<String> coleccion, String[] dias) {
        for(String dia : dias) coleccion.add(dia);
        coleccion.forEach(elemento -> { System.out.println(elemento); });
    }
}

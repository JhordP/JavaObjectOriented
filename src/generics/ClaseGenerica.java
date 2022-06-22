package generics;

public class ClaseGenerica<T> { //Se define que la clase va a obtener un tipo generico
    
    T objeto; //Se declara el tipo con el nombre "objeto" en este caso.
    
    public ClaseGenerica(T objeto) { //Constructor que inicializa este objeto sin importar el tipo.
        this.objeto = objeto;
    }
    
    public void obtenerTipo() {
        System.out.println("El tipo es: "+objeto.getClass().getSimpleName()); //Devuelve el nombre de la clase o tipo utilizada.
    }
}

package generics.test;
import generics.*;
import java.util.Scanner;

public class TestGenerics {
    public static void main () {
        var input = new Scanner(System.in);
        System.out.println("Digite un valor.");
        var valor = input.nextLine();
        
        //Se indica el tipo de objeto que utilizará la clase generica, y se crea una instancia en este caso llenando el constructor con su tipo.
        try {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(Integer.parseInt(valor));
        objetoInt.obtenerTipo();
        }catch(Exception e){
            e.getMessage();
        }
        
        ClaseGenerica<String> objetoString = new ClaseGenerica<>(valor);
        objetoString.obtenerTipo();

        input.close();
        //Nota: El tipo del tipo que se envia al constructor en este caso debe ser un tipo compatible:
        //Ej. Si el T es padre, el que se envia por parametro puede ser hijo. Si el T es una interfaz, el parametro puede ser una clase que la implemente.
    }
}

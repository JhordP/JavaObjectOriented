package object.test;
import object.domain.Empleado;

public class TestObject {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 5000.00);
        Empleado emp2 = new Empleado("Juan", 5000.00);
        
        //Se evalua la referencia de memoria como tal del objeto
        if(emp1 == emp2) System.out.println("Los objetos tienen la misma referencia de memoria.");
        else System.out.println("Los objetos tienen distinta referencia de memoria.");
        
        //Se evalua el contenido del objeto utilizando el metodo sobreescrito .equals()
        if (emp1.equals(emp2)) System.out.println("Los objetos son iguales en contenido.");
        else System.out.println("Los objetos son distintos en contenido.");
        
        //Evaluacion del HashCode (contenido de cada atributo). Tanto equals como HashCode discriminan entre Mayus y Minus.
        //NOTA: Recordar-> HashCode trae un numero entero unico con poca probabilidad de repeticion para cada valor de objeto dando un valor final.
        if(emp1.hashCode() == emp2.hashCode()) System.out.println("El valor HashCode es igual.");
        else System.out.println("El valor HashCode es distinto.");
    }
}

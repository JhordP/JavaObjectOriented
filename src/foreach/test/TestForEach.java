package foreach.test;
import foreach.domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {1,6,3,7};

        //Una variable edad del tipo del arreglo, dos puntos y el arreglo.
        for (int edad: edades) {
            System.out.println(edad);
        }

        Persona personas[] = 
        {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};

        for(Persona persona : personas) {
            System.out.println(persona); //cada "persona" es la instancia asi que se imprime el toString
        }
    }
}

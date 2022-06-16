package javabeans.test;
import javabeans.domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {

        var persona = new Persona();
        //Al utilizar JavaBean utilizamos el constructor vacio de la clase y posteriormente
        //utilizamos los metodos set de los atributos que queramos inicializar.
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        System.out.println(persona);

        //Individual sin el ToString:
        System.out.println("Nombre/Persona: "+persona.getNombre());
        System.out.println("Apellido/Persona: "+persona.getApellido());
    }
}

package bloques_inicializacion;

public class Persona {
    //Se usan antes del constructor de una clase
    private final int idPersona;
    private static int contadorPersonas;

    //Bloque de inicializacion statico
    static {
        //Validando que se llama antes que el constructor
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
}

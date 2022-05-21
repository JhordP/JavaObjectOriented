package bloques_inicializacion;

public class Persona {
    //Se usan antes del constructor de una clase
    private final int idPersona;
    private static int contadorPersonas;

    //Bloque de inicializacion statico
    /*El bloque estatico solo se ejecutara una vez:
    La primera vez que se invoca una instancia del objeto*/
    static {
        //Validando que se llama antes que el constructor
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas; //Esta linea la sube de 0 a 1 (solo corre una vez)
        //idPersona = Persona.contadorPersonas ***Como idpersona no es estatico, no permite utilizarlo en este bloque
    }

    //Bloque de inicializacion no estatico ó Dinamico
    /*Mientras que el dinamico se ejecutara cada vez que se invoque una nueva instancia del objeto*/
    {
        System.out.println("Ejecucion bloque dinamico");
        this.idPersona = Persona.contadorPersonas++; //Y ya aqui habiendo empezado de uno, se va aumentando cada vez.
    }

    //Para probar que los bloques de inicializacion ejecuta antes que el constructor
    public Persona() {
        System.out.println("Ejecucion del Constructor.");
    }

    public int getIdPersona () {
        return this.idPersona;
    }
}

package excepcions.manejoexcepciones1.excepciones;

public class OperacionExcepcion extends Exception{
    //Check Exception: hereda de la clase Exception. El compilador te obliga a corregir.
    //Uncheck Exception: hereda de la clase RunTimeException(hijo de Exception). Compilador no te obliga a corregir.

    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
}

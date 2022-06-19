package excepcions.manejoexcepciones2.test;

import excepcions.manejoexcepciones2.excepciones.OperacionExcepcion;

public class Aritmetica {

    /*No es necesario indicar en la firma del metodo la excepcion que puede arrojar*/
    public static int division(int numerador, int denominador)
    {
        if (denominador==0) {
            throw new OperacionExcepcion("Division entre cero."); //Si se cumple la condicion, arroja una excepcion del tipo creado.
        }
        else return numerador/denominador;
    }
}

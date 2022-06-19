package excepcions.manejoexcepciones2.test;

public class TestExcepciones {
    public static void main(String[] args) {

        int resultado = 0;
        try {
            resultado = Aritmetica.division(5, 0);

        } catch (Exception e) { //Si se agregan varios catch se debe colocar en orden ascendente de jerarquia, primero el menor
            System.out.println("Ocurrio un error:\n ");
            //Imprime la pila de excepciones
            e.printStackTrace(System.out);

            //Imprime solamente el mensaje del error
            System.out.println(e.getMessage());
        }
        //Si agregamos un bloque finally este se ejecutara sin importar que haya una excepcion o no
        System.out.println("Resultado: "+resultado);
    }
}

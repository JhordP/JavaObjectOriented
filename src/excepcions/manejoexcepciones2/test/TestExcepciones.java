package excepcions.manejoexcepciones2.test;

public class TestExcepciones {
    public static void main(String[] args) {

        int resultado = 0;
        try {
            resultado = Aritmetica.division(5, 0);

        } catch (Exception e) {
            System.out.println("Ocurrio un error:\n ");
            //Imprime la pila de excepciones
            e.printStackTrace(System.out);

            //Imprime solamente el mensaje del error
            System.out.println(e.getMessage());
        }
        System.out.println("Resultado: "+resultado);
    }
}

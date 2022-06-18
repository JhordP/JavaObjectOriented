package excepcions.manejoexcepciones1.test;

public class TestExcepciones {
    public static void main(String[] args) {

        int resultado = 0;
        try {
            resultado = 10/0;
            System.out.println("Resultado: "+resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error:\n ");
            //Imprime la pila de excepciones
            e.printStackTrace(System.out);
        }
        System.out.println(resultado);
        
    }
}

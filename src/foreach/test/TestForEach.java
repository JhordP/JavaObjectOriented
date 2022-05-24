package foreach.test;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {1,6,3,7};

        //Una variable edad del tipo del arreglo, dos puntos y el arreglo.
        for (int edad: edades) {
            System.out.println(edad);
        }
    }
}

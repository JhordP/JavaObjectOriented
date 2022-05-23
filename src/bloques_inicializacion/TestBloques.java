package bloques_inicializacion;

public class TestBloques {
    public static void main(String[] args) {

        //El bloque estatico corre primero, y una sola vez
        Persona persona1 = new Persona();
        System.out.println(persona1.getIdPersona());

        //Aqui ya no vemos correr el bloque estatico mas si el dinamico por lo de que es static.
        Persona persona2 = new Persona();
        System.out.println(persona2.getIdPersona());
    }
}

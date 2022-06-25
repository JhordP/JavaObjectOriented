package manejoarchivos.test;
import static manejoarchivos.ManejoArchivos.crearArchivo;

public class TestManejoArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "./src/manejoarchivos/prueba.txt";
        crearArchivo(nombreArchivo);
    }
}

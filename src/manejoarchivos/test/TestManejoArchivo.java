package manejoarchivos.test;
import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "./src/manejoarchivos/prueba.txt";
        //crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Hola Mundo.");
        agregarInfo(nombreArchivo, "Adios.");
        leerArchivo(nombreArchivo);
    }
}

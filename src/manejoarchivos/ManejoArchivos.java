package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Archivo creado.");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace(System.out);
        }
    }
}

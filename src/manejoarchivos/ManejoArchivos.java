package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ManejoArchivos {

    //Crea archivo
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

    //Sobreescribe texto
    public static void escribirArchivo(String nombreArchivo, String contenido) { 
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito en el archivo.");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getStackTrace());
        }
    }

    //Agrega informacion sin sobreescribir
    public static void agregarInfo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito en el archivo.");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getStackTrace());
        }
    }
}

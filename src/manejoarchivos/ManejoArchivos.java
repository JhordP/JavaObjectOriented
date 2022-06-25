package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

    //Lee el archivo
    public static void leerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();  
            }
            entrada.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace(System.out);
        }finally{
            
        }
        
    }
}

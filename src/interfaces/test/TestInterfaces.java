package interfaces.test;

import interfaces.accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos;
        System.out.println("--MySQL--");
        datos = new ImplementacionMySQL();
        // datos.insertar();
        // datos.actualizar();
        // datos.listar();
        // datos.eliminar();
        imprimir(datos); 

        System.out.println("\n--Oracle--");
        datos = new ImplementacionOracle();
        // datos.insertar();
        // datos.actualizar();
        // datos.listar();
        // datos.eliminar();
        imprimir(datos);
    }

    //Usando polimorfismo tomando por parametro la interfaz pero aplicando el metodo de la clase referenciada en memoria.
    public static void imprimir(IAccesoDatos data){
        data.insertar();
        data.actualizar();
        data.listar();
        data.eliminar();
    }

}

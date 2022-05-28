package modifacceso.test;

import javax.sql.rowset.spi.SyncResolver;

import modifacceso.paquete1.Clase1;

public class TestModifAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println(clase1.atributoPublico);
        clase1.metodoPublico();
    }
}
